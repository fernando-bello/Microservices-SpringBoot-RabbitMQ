package com.ms.user.services;

import com.ms.user.model.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    final UserRepository userRepository;
    final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

    @Transactional //Se algo der errado, gera um rollback
    public UserModel save(UserModel user) {
        user = userRepository.save(user);
        userProducer.publishMessageEmail(user);
        return user;
    }
}