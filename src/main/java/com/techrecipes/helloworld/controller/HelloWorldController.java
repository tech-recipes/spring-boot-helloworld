package com.techrecipes.helloworld.controller;

import com.techrecipes.helloworld.util.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    public void setSequenceGenerator(SequenceGenerator sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    private SequenceGenerator sequenceGenerator;


    @GetMapping("/")
    public String sayHello(){
        return "Sequence: " + sequenceGenerator.nextSequence() ;
    }
}
