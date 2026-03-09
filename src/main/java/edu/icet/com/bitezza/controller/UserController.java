package edu.icet.com.bitezza.controller;

import edu.icet.com.bitezza.model.dto.UserDTO;
import edu.icet.com.bitezza.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public UserDTO getUser(@PathVariable String username){
        return userService.getUser(username);
    }

}
