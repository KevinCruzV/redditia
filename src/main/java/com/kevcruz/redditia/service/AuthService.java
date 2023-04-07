package com.kevcruz.redditia.service;

import com.kevcruz.redditia.dto.RegisterRequest;
import com.kevcruz.redditia.model.User;
import com.kevcruz.redditia.model.VerifToken;
import com.kevcruz.redditia.repository.UserRepository;
import com.kevcruz.redditia.repository.VerifTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Service
@Transactional
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final VerifTokenRepository verifTokenRepository;

    @Transactional
    public void Register (RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setCreated(Instant.now());
        user.setEnabled(false);

        userRepository.save(user);

        String token = generateVerificationToken(user);

    }

    private String generateVerificationToken(User user) {
        String token = UUID.randomUUID().toString();
        VerifToken verifToken = new VerifToken();
        verifToken.setToken(token);
        verifToken.setUser(user);

        verifTokenRepository.save(verifToken);
        return token;
    }
}
