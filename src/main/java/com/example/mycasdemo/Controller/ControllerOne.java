package com.example.mycasdemo.Controller;

import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Comparator;
import java.util.TreeMap;

@Controller
@RequestMapping("/cas")
public class ControllerOne {

    @RequestMapping("test1")
    @ResponseBody
    public String test1() {
        return "cas tes1";
    }


    @RequestMapping("test2")
    @ResponseBody
    public String test2() {

        return "cas tes2***************8";
    }
    @RequestMapping("loginSuccess")
    @ResponseBody
    public String loginSuccess() {

        return "cas loginSuccess";
    }

    @RequestMapping("/out")
    @ResponseBody
    public String logout () {
        return "logout success *****************";
    }

}

