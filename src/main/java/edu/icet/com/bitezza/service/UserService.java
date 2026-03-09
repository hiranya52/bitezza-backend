package edu.icet.com.bitezza.service;

import edu.icet.com.bitezza.model.dto.UserDTO;
import edu.icet.com.bitezza.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO getUser(String username) {

        User user = userRepository.findByUsername(username);

        return new UserDTO(
                user.getUsername(),
                user.getPassword()
        );

    }
}
