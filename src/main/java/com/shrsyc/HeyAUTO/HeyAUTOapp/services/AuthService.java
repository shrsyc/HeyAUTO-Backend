package com.shrsyc.HeyAUTO.HeyAUTOapp.services;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.DriverDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.UserDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.SignupdDto;

public interface AuthService {
    String login(String email, String password);

    UserDto signup(SignupdDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
