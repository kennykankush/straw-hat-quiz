package one.piece.wshcay_onepiece.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import one.piece.wshcay_onepiece.service.PointSystem;

@Controller
public class AnswerController{

    private final PointSystem ps;

    @Autowired
    public AnswerController(PointSystem ps) {
        this.ps = ps;
    }

    
    @GetMapping("/")
    public String home() {
        ps.addCharacters();
        ps.viewList();
        return "home";
    }
    
    @GetMapping("/1")
    public String page1() {
        System.out.println("Hello, Page 1");
        return "1";
    }

    @PostMapping("/2")
    public String page2(@RequestParam("q1") String answer) {
        System.out.println("Hello, Page 2");
        
        if (answer.equals("a")){
            ps.addPoint("Nami", 10);
            ps.addPoint("Jinbe", 5);

        } else if (answer.equals("b")) {
            ps.addPoint("Zoro", 10);
            ps.addPoint("Luffy", 5);

        } else if (answer.equals("c")) {
            ps.addPoint("Franky", 10);
            ps.addPoint("Robin", 5);

        } else if (answer.equals("d")) {
            ps.addPoint("Luffy", 10);
            ps.addPoint("Chopper", 5);

        } else if (answer.equals("e")) {
            ps.addPoint("Usopp", 10);
            ps.addPoint("Brooke", 5);

        }
        System.out.println("User picked " + answer);
        ps.viewList();
        return "2";
    }

    @PostMapping("/3")
    public String page3(@RequestParam("q2") String answer) {
        System.out.println("Hello, Page 3");
        if (answer.equals("a")){
            ps.addPoint("Chopper", 10);
            ps.addPoint("Luffy", 5);

        } else if (answer.equals("b")) {
            ps.addPoint("Zoro", 10);
            ps.addPoint("Sanji", 5);

        } else if (answer.equals("c")) {
            ps.addPoint("Robin", 10);
            ps.addPoint("Nami", 5);

        } else if (answer.equals("d")) {
            ps.addPoint("Usopp", 10);
            ps.addPoint("Chopper", 5);

        } else if (answer.equals("e")) {
            ps.addPoint("Jinbe", 10);
            ps.addPoint("Brooke", 5);

        }
        System.out.println("User picked " + answer);
        ps.viewList();
        return "3";
    }

    @PostMapping("/4")
    public String page4(@RequestParam("q3") String answer) {
        System.out.println("Hello, Page 4");
        if (answer.equals("a")){
            ps.addPoint("Luffy", 10);
            ps.addPoint("Zoro", 5);

        } else if (answer.equals("b")) {
            ps.addPoint("Sanji", 10);
            ps.addPoint("Jinbe", 5);

        } else if (answer.equals("c")) {
            ps.addPoint("Robin", 10);
            ps.addPoint("Nami", 5);

        } else if (answer.equals("d")) {
            ps.addPoint("Franky", 10);
            ps.addPoint("Usopp", 5);

        } else if (answer.equals("e")) {
            ps.addPoint("Brooke", 10);
            ps.addPoint("Chopper", 5);

        }
        System.out.println("User picked " + answer);
        ps.viewList();
        return "4";
        
    }

    @PostMapping("/5")
    public String page5(@RequestParam("q4") String answer) {
        System.out.println("Hello, Page 5");
        if (answer.equals("a")){
            ps.addPoint("Luffy", 10);
            ps.addPoint("Zoro", 5);

        } else if (answer.equals("b")) {
            ps.addPoint("Robin", 10);
            ps.addPoint("Nami", 5);

        } else if (answer.equals("c")) {
            ps.addPoint("Usopp", 10);
            ps.addPoint("Franky", 5);

        } else if (answer.equals("d")) {
            ps.addPoint("Jinhe", 10);
            ps.addPoint("Sanji", 5);

        } else if (answer.equals("e")) {
            ps.addPoint("Chopper", 10);
            ps.addPoint("Brooke", 5);

        }
        System.out.println("User picked " + answer);
        ps.viewList();

        return "5";
    }

    @PostMapping("/results")
    public String getResults(@RequestParam("q5") String answer) {
        System.out.println("Hello, Results");
        if (answer.equals("a")){
            ps.addPoint("Luffy", 10);
            ps.addPoint("Sanji", 5);

        } else if (answer.equals("b")) {
            ps.addPoint("Robin", 10);
            ps.addPoint("Jinbe", 5);

        } else if (answer.equals("c")) {
            ps.addPoint("Franky", 10);
            ps.addPoint("Usopp", 5);

        } else if (answer.equals("d")) {
            ps.addPoint("Chopper", 10);
            ps.addPoint("Brooke", 5);

        } else if (answer.equals("e")) {
            ps.addPoint("Zoro", 10);
            ps.addPoint("Luffy", 5);

        }
        System.out.println("User picked " + answer);
        ps.viewList();

        String whichCharacter = ps.getMax();
        System.out.println(whichCharacter);

        return whichCharacter;
    }
    
    


}