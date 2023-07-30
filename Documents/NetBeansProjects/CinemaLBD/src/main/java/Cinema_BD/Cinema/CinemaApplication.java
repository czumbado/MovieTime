package Cinema_BD.Cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "Cinema_BD.Cinema.models")
public class CinemaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }
}
