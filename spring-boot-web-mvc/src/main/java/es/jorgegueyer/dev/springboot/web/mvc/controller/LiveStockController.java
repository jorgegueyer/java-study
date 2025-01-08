package es.jorgegueyer.dev.springboot.web.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/livestock")
public class LiveStockController {

    @GetMapping("/findAll")
    public List<String> findAll() {
        return List.of("0001", "0002", "0003", "0004", "0005", "0006", "0007", "0008", "0009", "0010");
    }
}
