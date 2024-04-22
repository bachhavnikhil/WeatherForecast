package com.example.demo.Model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {

    private String jwtToken;
    private String username;

}
