package com.boot.micro.simfleweb.search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @GetMapping("/search")
    public Search[] search() {
        RestTemplate searchClient = new RestTemplate();
        Search[] searchs = searchClient.getForObject("http://localhost:8095/api/search/get", Search[].class);
        return searchs;
    }
}
