package com.conygre.spring.boot.service;

import com.conygre.spring.boot.entities.CompactDisc;

public interface CompactDiscService {
    Iterable<CompactDisc> getCatalog();

}
