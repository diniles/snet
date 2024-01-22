package ru.gb.snet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        userRepository.save(new User(null, "Dmitry", "dleshko@gmail.com"));
        userRepository.save(new User(null, "Dmitry", "dleshko@gmail.com"));
        userRepository.save(new User(null, "Dmitry", "dleshko@gmail.com"));
        userRepository.save(new User(null, "Dmitry", "dleshko@gmail.com"));
        userRepository.save(new User(null, "Dmitry", "dleshko@gmail.com"));
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }
}
