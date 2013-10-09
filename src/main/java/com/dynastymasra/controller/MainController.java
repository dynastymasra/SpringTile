package com.dynastymasra.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Name : Dimas Ragil T
 * FB   : Dimas Ragil T
 * Twit : @dynastymasra
 * Email: dynastymasra@gmail.com
 * Date : 6/11/13
 * Time : 11:00 AM
 */


@Controller
@RequestMapping("/")
public class MainController {
    protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(method = RequestMethod.GET)
    public String main(ModelMap modelMap) {
        logger.debug("Request to show main");
        modelMap.addAttribute("menuMainClass", "active");

        return "main-tile";
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String insert(ModelMap modelMap) {
        logger.debug("Request to show insert");
        modelMap.addAttribute("menuInsertClass", "active");

        return "insert-tile";
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String update(ModelMap modelMap) {
        logger.debug("Request to show update");
        modelMap.addAttribute("menuUpdateClass", "active");

        return "update-tile";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(ModelMap modelMap) {
        logger.debug("Request to show delete");
        modelMap.addAttribute("menuDeleteClass", "active");

        return "delete-tile";
    }
}
