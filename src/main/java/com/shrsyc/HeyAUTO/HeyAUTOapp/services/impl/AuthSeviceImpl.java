package com.shrsyc.HeyAUTO.HeyAUTOapp.services.impl;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.DriverDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.SignupdDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.UserDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.services.AuthService;

public class AuthSeviceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupdDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
