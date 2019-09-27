package com.cssl.controller;


import com.cssl.pojo.Spxxb;
import com.cssl.service.TypeSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class TypeSelectController {
    @Autowired(required = false)
    private TypeSelectService tdao;

    @RequestMapping(value = "/TypeSelect.html")
    @ResponseBody
    public List<Spxxb> TypeSelect(String type){
        return tdao.Bytype(type);
    }
    //热销
    @RequestMapping(value = "/xiaomi.html")
    public String index(Model model){
        model.addAttribute("rx",tdao.Sellwell());
        return "index";
    }
}
