package hakoniwa.server;

import hakoniwa.server.HakoniwaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        HakoniwaServer.init(50051, "172.18.192.1");
        //HakoniwaServer.init(50051, "127.0.0.1");
        SpringApplication.run(Main.class, args);
    }
}
