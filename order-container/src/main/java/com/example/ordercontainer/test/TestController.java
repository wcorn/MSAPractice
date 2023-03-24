package com.example.ordercontainer.test;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/success")
    public ResponseEntity<String> testSuccess() {

        String data = "test api success";
        log.info("test controller {}",data);
        return ResponseEntity.status(HttpStatus.OK).body("TEST");
    }
}