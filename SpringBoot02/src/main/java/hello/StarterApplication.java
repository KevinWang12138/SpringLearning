package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication {
    private static Logger logger= LoggerFactory.getLogger(StarterApplication.class);
    public static void main(String[] args) {
        logger.debug("aaaaaaa");
        SpringApplication.run(StarterApplication.class);
    }
}
