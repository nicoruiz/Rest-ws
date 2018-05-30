package Application.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.HttpResource;

@RestController
@RequestMapping("/Test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "Ok";
    }
}
