package pl.laszkiewicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    public CustomerController() {
    }

    @RequestMapping({"/customer"})
    public ModelAndView start(ModelAndView modelAndView) {
        modelAndView.setViewName("customer");
        return modelAndView;
    }
}