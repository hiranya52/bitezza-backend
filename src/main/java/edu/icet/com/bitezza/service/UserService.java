package edu.icet.com.bitezza.service;

import edu.icet.com.bitezza.model.dto.UserDTO;
import edu.icet.com.bitezza.repository.UserRepository;
import edu.icet.com.bitezza.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
