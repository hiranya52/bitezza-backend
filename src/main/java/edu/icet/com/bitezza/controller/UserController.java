package edu.icet.com.bitezza.controller;

import edu.icet.com.bitezza.model.dto.UserDTO;
import edu.icet.com.bitezza.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public UserDTO getUser(String username){
        UserDTO userDTO = userService.getUser(username);
    }

}
