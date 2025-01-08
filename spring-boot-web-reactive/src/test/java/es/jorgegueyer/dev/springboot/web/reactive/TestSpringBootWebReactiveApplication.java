package es.jorgegueyer.dev.springboot.web.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringBootWebReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootWebReactiveApplication::main).with(TestSpringBootWebReactiveApplication.class).run(args);
    }

}
