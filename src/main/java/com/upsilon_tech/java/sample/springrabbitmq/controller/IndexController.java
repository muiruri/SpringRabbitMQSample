package com.upsilon_tech.java.sample.springrabbitmq.controller;

import com.upsilon_tech.java.sample.springrabbitmq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kenny on 14/04/2017.
 */
@Controller
public class IndexController {

    @Autowired
    private ProducerService producerService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     *  This end-point receives a message and passes it to the producer.
     * @param message
     * @return
     */
    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public @ResponseBody String sendMessage(@RequestBody String message) {
        producerService.produceMessage(message);
        return "Message published";
    }
}
