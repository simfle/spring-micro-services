package com.boot.micro.simflesearch.search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {
    @GetMapping("/search/get")
    public List<Search> search() {
        System.out.println("Input : search get arrived");
        List<Search> searchList = new ArrayList<>();
        Search search = new Search();
        search.setAge("77");
        search.setName("changhee");
        searchList.add(search);
        return searchList;
    }
}
