package com.example.demo.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    private String userId;
    private String name;
    private String email;
}
