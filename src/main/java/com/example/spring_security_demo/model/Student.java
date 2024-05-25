package com.example.spring_security_demo.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String firstName;
    private String lastName;

}
