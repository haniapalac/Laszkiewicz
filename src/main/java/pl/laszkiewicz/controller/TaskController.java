package pl.laszkiewicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {
    public TaskController() {
    }

    @RequestMapping({"/task"})
    public ModelAndView start(ModelAndView modelAndView) {
        modelAndView.setViewName("task");
        return modelAndView;
    }
}
