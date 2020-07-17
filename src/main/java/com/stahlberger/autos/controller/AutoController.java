package com.stahlberger.autos.controller;

import com.stahlberger.autos.entity.Auto;
import com.stahlberger.autos.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class AutoController {
    @Autowired
    AutoRepository autoRepository;


    @RequestMapping(method = RequestMethod.GET, path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Auto> getAuto(){

        return (List<Auto>) autoRepository.findAll();
    }
}
