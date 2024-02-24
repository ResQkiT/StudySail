package org.resk.studysail.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("StudySail/auth")
public class AuthController {
    @GetMapping
    public String authPage(){
        return "authentication";
    }
}
