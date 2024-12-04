package kz.bitlab.g130springbean.controller;

import javafx.application.Application;
import kz.bitlab.g130springbean.db.DBManager;
import kz.bitlab.g130springbean.db.DBManager2;
import kz.bitlab.g130springbean.db.DBManager3;
import kz.bitlab.g130springbean.db.DBManager4;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HomeController {

    private final DBManager dbManager;
    private final DBManager2 dbManager2;
    private final DBManager3 dbManager3;
    private final DBManager4 dbManager4;

    @GetMapping("/")
    public String home() {
        dbManager4.addName("Alisher");
        dbManager4.addName("Adil");
        System.out.println(dbManager4.getNames());
//        dbManager4.addName("Adil");
        return "home";
    }
}
