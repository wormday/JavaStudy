package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by sunwq on 2016/12/4.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/abc",method = RequestMethod.GET)
    public String home()
    {
        System.out.println("HomeController.home");
        return "home";
    }
}
