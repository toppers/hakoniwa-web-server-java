/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.baitando.openapi.samples.gen.springbootserver.api;

import com.baitando.openapi.samples.gen.springbootserver.model.AssetListsDto;
import com.baitando.openapi.samples.gen.springbootserver.model.ControlRequestDto;
import com.baitando.openapi.samples.gen.springbootserver.model.ErrorDto;
import com.baitando.openapi.samples.gen.springbootserver.model.SimulationStatusDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T09:18:44.546606+09:00[Asia/Tokyo]")
@Validated
@Api(value = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /api/control
     * hakoniwa simulation control.
     *
     * @param controlRequestDto  (optional)
     * @return OK (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "", nickname = "controlSimulation", notes = "hakoniwa simulation control.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/control",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> _controlSimulation(@ApiParam(value = "") @Valid @RequestBody(required = false) ControlRequestDto controlRequestDto) {
        return controlSimulation(controlRequestDto);
    }

    // Override this method
    default  ResponseEntity<Void> controlSimulation(ControlRequestDto controlRequestDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/assets
     *
     * @return get hakoniwa asset lists (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "", nickname = "getAssetList", notes = "", response = AssetListsDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get hakoniwa asset lists", response = AssetListsDto.class),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/assets",
        produces = { "application/json" }
    )
    default ResponseEntity<AssetListsDto> _getAssetList() {
        return getAssetList();
    }

    // Override this method
    default  ResponseEntity<AssetListsDto> getAssetList() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"names\" : [ \"names\", \"names\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/status
     *
     * @return get hakoniwa simulation status (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "", nickname = "getSimStatus", notes = "", response = SimulationStatusDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get hakoniwa simulation status", response = SimulationStatusDto.class),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/status",
        produces = { "application/json" }
    )
    default ResponseEntity<SimulationStatusDto> _getSimStatus() {
        return getSimStatus();
    }

    // Override this method
    default  ResponseEntity<SimulationStatusDto> getSimStatus() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"status\" : \"stopped\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
