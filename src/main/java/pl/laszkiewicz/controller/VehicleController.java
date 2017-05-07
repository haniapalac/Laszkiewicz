
package pl.laszkiewicz.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
    public VehicleController() {
    }

    @RequestMapping({"/vehicle"})
    public ModelAndView start(ModelAndView modelAndView) {
        modelAndView.setViewName("vehicle");
        return modelAndView;
    }
}
