package com.sparta.spring_init_template;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeathCheckController {

    @Value("${server.env}")
    private String env;

    @Value("${server.port}")
    private String serverPort;
    @Value(("${server.serverAddress}"))
    private String serverAddress;
    @Value(("${serverName}"))
    private String serverName;

    // TODO : Spring Security 사용 중이면 /hc, /env .permitAll() 해주기
    @GetMapping("/hc")
    public ResponseEntity<?> getHeathCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("serverName", serverName);
        response.put("serverAddress", serverAddress);
        response.put("serverPort", serverPort);
        response.put("env", env);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/env")
    public ResponseEntity<?> getEnv() {
        return ResponseEntity.ok(env);
    }
}