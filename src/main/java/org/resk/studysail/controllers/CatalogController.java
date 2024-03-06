package org.resk.studysail.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("StudySail/catalog")
public class CatalogController {
    @GetMapping("/test")
    public String test(){return "index";}
    @GetMapping
    public String authPage(){
        return "catalog";
    }
}
