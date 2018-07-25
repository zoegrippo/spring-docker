package com.conygre.spring.boot.rest;

import com.conygre.spring.boot.entities.CompactDisc;
import com.conygre.spring.boot.service.CompactDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compactdiscs")
public class CompactDiscController {
    @Autowired
    private CompactDiscService service;
    @RequestMapping(method = RequestMethod.GET)
    Iterable<CompactDisc> findAll() {
        return service.getCatalog();
    }
}
