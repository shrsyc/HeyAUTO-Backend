package com.shrsyc.HeyAUTO.HeyAUTOapp.dto;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private Set<UserRole> roles;
}
