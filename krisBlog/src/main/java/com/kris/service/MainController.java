package com.kris.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kris on 16/9/7.
 */
@Controller
public class MainController {

    @RequestMapping(value="/start.do")
    public String action(){
        return "hello";
    }
}
