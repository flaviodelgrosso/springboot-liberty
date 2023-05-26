package app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import app.model.*;
import app.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MongoService {

    private final UserRepository userRepository;

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}