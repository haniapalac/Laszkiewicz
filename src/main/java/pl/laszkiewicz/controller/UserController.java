package pl.laszkiewicz.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    public UserController() {
    }

    @RequestMapping({"/user"})
    public ModelAndView start(ModelAndView modelAndView) {
        modelAndView.setViewName("user");
        return modelAndView;
    }
}