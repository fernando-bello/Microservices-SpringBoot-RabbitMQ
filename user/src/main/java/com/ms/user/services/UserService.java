package com.ms.user.services;

import com.ms.user.model.UserModel;
import com.ms.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    @Transactional //Se algo der errado, gera um rollback
    public UserModel save(UserModel user) {
        return userRepository.save(user);
    }
}