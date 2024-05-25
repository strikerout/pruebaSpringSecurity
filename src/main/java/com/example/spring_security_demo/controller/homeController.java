package com.example.spring_security_demo.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class homeController {

    @GetMapping("/")
    public ResponseEntity<byte[]> home() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        byte[] data = Files.readAllBytes(Path.of(resource.getURI()));
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(data);
    }

    @GetMapping("/welcomeLogged")
    public ResponseEntity<byte[]> homeLogged() throws IOException {
        Resource resource = new ClassPathResource("static/welcomeLogged.html");
        byte[] data = Files.readAllBytes(Path.of(resource.getURI()));
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(data);
    }

    @GetMapping("/signin")
    public ResponseEntity<byte[]> login() throws IOException {
        Resource resource = new ClassPathResource("static/login.html");
        byte[] data = Files.readAllBytes(Path.of(resource.getURI()));
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(data);
    }
}
