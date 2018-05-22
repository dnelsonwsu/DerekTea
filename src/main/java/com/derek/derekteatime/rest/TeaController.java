package com.derek.derekteatime.rest;

import com.derek.derekteatime.data.Tea;
import com.derek.derekteatime.dto.TeaRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * Created by nelsoder on 5/12/2018.
 */
@RestController
public class TeaController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TeaController.class);

    @Autowired
    private TeaRepository teaRepository;

    @RequestMapping(method=RequestMethod.GET, path="/tea")
    public Iterable<Tea> GetAllTea() {
        return teaRepository.findAll();
    }

    @GetMapping("/tea/{uuid}")
    public Tea GetATea(@PathVariable UUID uuid) {
        return teaRepository.findByResourceId(uuid);
    }

    @RequestMapping(method=RequestMethod.PUT, path="/tea")
    public Tea CreateTea(@RequestBody Tea tea) {
        teaRepository.save(tea);
        return tea;
    }

}
