package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getItem(@PathVariable String id) {
        return ResponseEntity.ok("Get item " + id);
    }

    @PostMapping
    public ResponseEntity<String> createItem(@RequestBody String body) {
        return ResponseEntity.ok("Created: " + body);
    }
}
