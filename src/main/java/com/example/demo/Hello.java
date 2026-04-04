package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/hello")
@Tag(name = "Hello API v1", description = "CRUD operations for Hello API version 1")
public class Hello {

    ArrayList<String> list = new ArrayList<>();

    @Operation(summary = "Get movie by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Movie found"),
            @ApiResponse(responseCode = "404", description = "Movie not found")
    })
    @GetMapping
    public String GetHello()
    {
        String text = "";
        for (int i = 0; i < list.size(); i++) {
            text = text + list.get(i);
        }
        return text;
    }

    @PostMapping
    public String PostHello(@RequestBody String variable)
    {
        list.add(variable);
        return  variable;
    }
}
