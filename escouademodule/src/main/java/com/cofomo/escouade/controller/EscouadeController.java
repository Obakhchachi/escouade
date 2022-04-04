package com.cofomo.escouade.controller;

import com.cofomo.escouade.model.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequestMapping("escouade")
@AllArgsConstructor
public class EscouadeController {

    @GetMapping("/get")
    public ResponseEntity<Response> get() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .message("")
                        .status(OK)
                        .statusCode(OK.value())
                        .data("Hello")
                        .build()
        );
    }
}
