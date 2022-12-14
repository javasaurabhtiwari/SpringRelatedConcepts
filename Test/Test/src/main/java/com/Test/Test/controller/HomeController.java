package com.Test.Test.controller;

import com.Test.Test.model.*;
import com.Test.Test.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HomeController {

    @Autowired
    TestRepository testRepository;

    @RequestMapping(value = "/save" , method = RequestMethod.POST,consumes = "application/json")
    public void saveTest(@RequestBody Test test)
    {
        testRepository.save(test);
    }

    @GetMapping(path = "/getdata")
    public List<Test> findAll()
    {
       return testRepository.findAll();
    }
}
