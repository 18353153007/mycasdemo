package com.example.mycasdemo.Controller;

import com.example.mycasdemo.Dao.RoleRepository;
import com.example.mycasdemo.Dao.UserRepository;
import com.example.mycasdemo.Entity.Role;
import com.example.mycasdemo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping("/insert")
    @ResponseBody
    public String insertUsers() {


        Role role = new Role("ROLE_ADMIN");
        roleRepository.save(role);

        User user = new User("user","123456",role);
        userRepository.save(user);
        return "insert success";

    }
    @RequestMapping("/insert2")
    @ResponseBody
    public String insertUsers2() {


        Role role = new Role("ROLE_TEST");
        roleRepository.save(role);

        User user = new User("test","123456",role);
        userRepository.save(user);
        return "insert success";

    }
}
