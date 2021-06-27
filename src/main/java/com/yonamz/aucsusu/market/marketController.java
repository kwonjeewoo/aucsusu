package com.yonamz.aucsusu.market;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/market")
public class marketController {

    @RequestMapping("/all")
    public String getAll(){
        return "all";
    }

    @RequestMapping("/addItem")
    public String addItem(){
        return "addItem";
    }
}
