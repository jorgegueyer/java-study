package es.jorgegueyer.dev.springboot.web.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringBootWebMvcApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootWebMvcApplication::main).with(TestSpringBootWebMvcApplication.class).run(args);
    }

}
