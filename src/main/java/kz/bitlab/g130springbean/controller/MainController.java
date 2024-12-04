package kz.bitlab.g130springbean.controller;

import kz.bitlab.g130springbean.db.DBManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private DBManager dbManager;

    @GetMapping("/main")
    public String home() {
        dbManager.addName("Adil");
        return "home";
    }
}
