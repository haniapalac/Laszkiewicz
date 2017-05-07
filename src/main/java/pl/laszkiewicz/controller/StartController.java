package pl.laszkiewicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {
    public StartController() {
    }

    @RequestMapping({"/start"})
    public ModelAndView start(ModelAndView modelAndView) {
        modelAndView.setViewName("start");
        return modelAndView;
    }
}
