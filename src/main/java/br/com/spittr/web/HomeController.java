package br.com.spittr.web;

import org.springframework.stereotype.Controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Home Controller:</b> a very simple Controller (it's a controller since it has the annotation "Controller"
 * The Component Scan in br.com.spittr.conf.WebConfig will recognize it as a Controller bean component.
 * It will handles with the first root request sent by Dispatcher Servlet and return a simple message.
 * If you remove the annotation, it's only a simple POJO, what is GREAT!!!
 * @author marcio.souza
 * @version 1.0
 * @since 12/06/2018
 */

@Controller
@RequestMapping("/")
public class HomeController {

    /**
     * Handle the root request. The Dispatcher Servlet will search by a view with the name returned by the method
     * In this case, a view called "home".
     * @return a simple string with the word "home". The Dispatcher Servlet will interpret this String as a view name
     * and will find out a view wiht the name "home" with the sufix "WEB-INF/views" and the prefix "jsp".
     */
    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
