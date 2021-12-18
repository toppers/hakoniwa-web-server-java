package hakoniwa.server;

import com.baitando.openapi.samples.gen.springbootserver.model.AssetListsDto;
import hakoniwa.CoreServiceGrpc;
import hakoniwa.HakoniwaCore;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.baitando.openapi.samples.gen.springbootserver.model.ControlRequestDto;

import com.baitando.openapi.samples.gen.springbootserver.api.ControlApi;
import com.baitando.openapi.samples.gen.springbootserver.api.StatusApi;
import com.baitando.openapi.samples.gen.springbootserver.api.AssetsApi;
import org.springframework.web.context.request.NativeWebRequest;
import com.baitando.openapi.samples.gen.springbootserver.model.SimulationStatusDto;
import com.baitando.openapi.samples.gen.springbootserver.model.ErrorDto;

import java.util.Optional;

import static hakoniwa.HakoniwaCore.ErrorCode.ERROR_CODE_OK;

@RestController
public class HakoniwaServer implements ControlApi, StatusApi, AssetsApi {
    private static int port;
    private static String ipaddr;

    private static ManagedChannel channel = null;
    private static CoreServiceGrpc.CoreServiceBlockingStub stub;
    private static com.google.protobuf.Empty emptyRequest;
    public static void init(int p, String ip) {
        if (channel != null) {
            System.out.println("Hakoniwa Init already done");
            return;
        }
        port = p;
        ipaddr = ip;
        String target = ipaddr + ":" + String.valueOf(port);
        try {
            channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
            stub = CoreServiceGrpc.newBlockingStub(channel);
            emptyRequest = com.google.protobuf.Empty.newBuilder().build();
        }
        catch (Exception e) {
            System.out.println("Hakoniwa Init Exception: " + e);
            throw e;
        }
        //System.out.println("Init:channel " + channel);
        //System.out.println("Init:stub " + stub);
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ControlApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> controlSimulation(ControlRequestDto controlRequestDto) {
        HakoniwaCore.NormalReply reply = null;
        String type = controlRequestDto.getControlType().getValue();
        if ("start".equals(type)) {
            reply = stub.startSimulation(emptyRequest);
        }
        else if ("stop".equals(type)) {
            reply = stub.stopSimulation(emptyRequest);
        }
        else if ("reset".equals(type)) {
            reply = stub.resetSimulation(emptyRequest);
        }
        else {
            /* nothing to do */
        }
        var res = new ResponseEntity<Void>(HttpStatus.OK);
        return res;
    }
    @Override
    public ResponseEntity<SimulationStatusDto> getSimStatus() {
        HakoniwaCore.SimStatReply reply = stub.getSimStatus(emptyRequest);
        if (reply == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (reply.getErcd() != ERROR_CODE_OK) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var res = new ResponseEntity<SimulationStatusDto>(new SimulationStatusDto(), HttpStatus.OK);
        switch (reply.getStatus()) {
            case STATUS_STOPPED:
                res.getBody().setStatus(SimulationStatusDto.StatusEnum.STOPPED);
                break;
            case STATUS_STOPPING:
                res.getBody().setStatus(SimulationStatusDto.StatusEnum.STOPPING);
                break;
            case STATUS_RUNNABLE:
                res.getBody().setStatus(SimulationStatusDto.StatusEnum.RUNNABLE);
                break;
            case STATUS_RUNNING:
                res.getBody().setStatus(SimulationStatusDto.StatusEnum.RUNNING);
                break;
            case STATUS_TERMINATED:
                res.getBody().setStatus(SimulationStatusDto.StatusEnum.TERMINATED);
                break;
            default:
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return res;
    }

    @Override
    public ResponseEntity<AssetListsDto> getAssetList() {
        HakoniwaCore.AssetInfoList assets = stub.getAssetList(emptyRequest);
        var res = new ResponseEntity<AssetListsDto>(new AssetListsDto(), HttpStatus.OK);
        for (var entry : assets.getAssetsList()) {
            res.getBody().addNamesItem(entry.getName());
        }
        return res;
    }
}
