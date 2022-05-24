package ru.neginskiy.familytime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neginskiy.familytime.domain.User;
import ru.neginskiy.familytime.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User findByName(String userName) {
        return userRepository.findByName(userName).orElse(null);
    }
}
