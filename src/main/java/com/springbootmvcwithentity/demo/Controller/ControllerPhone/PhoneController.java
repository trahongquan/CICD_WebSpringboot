package com.springbootmvcwithentity.demo.Controller.ControllerPhone;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhoneController {

    @GetMapping({"/x"})
    public String getPhones(Model model) {
        return "index";
    }

}
