package com.dynastymasra.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User : Dynastymasra
 * Name : Dimas Ragil T
 * Email: dynastymasra@gmail.com
 * Date : 10/14/13
 * Time : 9:58 PM
 */

@Controller
@RequestMapping("/")
public class MainController {
    protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(method = RequestMethod.GET)
    public static String home(ModelMap modelMap) {
        logger.debug("Received request to show home");
        return "main-tile";
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String update(ModelMap modelMap) {
        logger.debug("Received request to show update");
        return "update-tile";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(ModelMap modelMap) {
        logger.debug("Received request to show delete");
        return "delete-tile";
    }
}
