package springboot.schedue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: 程泰恒
 * @date: 2019/3/22 8:57
 */
@SpringBootApplication
@EnableScheduling
public class SpringbootSchedueApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSchedueApplication.class, args);
    }
}
