package com.wadimbap.sktest.controller;

import com.wadimbap.sktest.dto.ModifyRequest;
import com.wadimbap.sktest.dto.ModifyResponse;
import com.wadimbap.sktest.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modify")
@RequiredArgsConstructor
public class ExampleController {

    private final ExampleService exampleService;

    @PostMapping
    public ResponseEntity<ModifyResponse> modifyCurrent(@RequestBody ModifyRequest request) {
            int newValue = exampleService.modifyCurrent(request.id(), request.add());
            return ResponseEntity.ok(new ModifyResponse(newValue));
    }
}


