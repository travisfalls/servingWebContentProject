package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeekendActivitiesController {

    @RequestMapping("/weekendActivities")
    public String weekendActivities() {
        return "weekendActivities";
    }

}
