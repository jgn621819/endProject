package com.baizhi.controller;

import com.baizhi.entity.Person;
import com.baizhi.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonMapper personMapper;

    @RequestMapping("queryAll")
    public String queryAll(Model model) {
        List<Person> people = personMapper.selectAll();
        model.addAttribute("people", people);
        for (Person person : people) {
            System.out.println(person);
        }
        return "index";
    }
}
