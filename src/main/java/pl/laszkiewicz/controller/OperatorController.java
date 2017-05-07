package pl.laszkiewicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OperatorController {
    public OperatorController() {
    }

    @RequestMapping({"/operator"})
    public ModelAndView start(ModelAndView modelAndView) {
        modelAndView.setViewName("operator");
        return modelAndView;
    }
}
