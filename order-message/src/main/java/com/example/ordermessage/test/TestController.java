package com.example.ordermessage.test;


import com.example.ordermessage.global.common.api.ApiResponse;
import com.example.ordermessage.global.common.api.ResponseCode;
import com.example.ordermessage.global.common.exception.CustomException;
import com.example.ordermessage.global.error.ErrorCode;
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
    public ResponseEntity<ApiResponse<String>> testSuccess() {

        String data = "test api success";
        log.info("test controller {}",data);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse<>(ResponseCode.TEST));
    }

    @GetMapping("/fail")
    public ResponseEntity<ApiResponse<String>> testFail() {
        String data = "test api fail";
        throw new CustomException(ErrorCode.TEST);
    }
}