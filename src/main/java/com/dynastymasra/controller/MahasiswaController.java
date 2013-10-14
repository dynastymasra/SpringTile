package com.dynastymasra.controller;

import com.dynastymasra.domain.Mahasiswa;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User : Dynastymasra
 * Name : Dimas Ragil T
 * Email: dynastymasra@gmail.com
 * Date : 10/14/13
 * Time : 10:12 PM
 */

@Controller
@RequestMapping("mahasiswa")
public class MahasiswaController {
    protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(ModelMap modelMap) {
        logger.debug("Received request to get from mahasiswa");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10018203");
        mahasiswa.setName("Dimas Ragil T");
        mahasiswa.setEmail("dynastymasra@gmail.com");
        mahasiswa.setJurusan("Teknik Informtika");
        modelMap.addAttribute("mahasiswa", mahasiswa);

        return "insert-tile";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@ModelAttribute("mahasiswa") Mahasiswa mahasiswa, ModelMap modelMap) {
        logger.debug("Recieved request to create mahasiswa");
        return "list-tile";
    }
}
