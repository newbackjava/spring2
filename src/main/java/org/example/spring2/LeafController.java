package org.example.spring2;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LeafController {

    @GetMapping("leaf")
    public String leaf(Model model) {
        //list
        List<String> list = new ArrayList<>();
        list.add("hong");
        list.add("kim");

        //int
        int age = 15;

        //String
        String userId = "root";
        
        model.addAttribute("title", "타임리스 테스트");
        model.addAttribute("age", age); //int, 값을 전달
        model.addAttribute("userId", userId); //String, 주소를 전달
        model.addAttribute("list", list); //list, 주소를 전달
        return "leaf";
    }

    @GetMapping("/leaf2")
    public String example(Model model) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        int total = 3;
        String userId = "admin";

        model.addAttribute("title", "타임리프 예제");
        model.addAttribute("fruits", fruits);
        model.addAttribute("total", total);
        model.addAttribute("userId", userId);

        return "leaf2"; // templates/leaf2.html로 이동
    }

}
