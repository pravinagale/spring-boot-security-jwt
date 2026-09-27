package com.pravin.security.service;

import com.pravin.security.dto.AuthencationRequest;
import com.pravin.security.dto.AuthenticationResponse;
import com.pravin.security.dto.RegisterRequest;

public interface AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request);
    public AuthenticationResponse authenticate(AuthencationRequest request);
}
