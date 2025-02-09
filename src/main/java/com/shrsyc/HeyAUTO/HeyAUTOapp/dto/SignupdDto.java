package com.shrsyc.HeyAUTO.HeyAUTOapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupdDto {
    private String name;
    private String email;
    private String password;
}
