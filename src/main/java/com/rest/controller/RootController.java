package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by billaros on 9/10/2016.
 */
@Controller
public class RootController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
