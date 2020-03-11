package com.hod.spring.test.services;


import com.hod.spring.test.model.Manga;
import com.hod.spring.test.model.MangaResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MangaService {

    private static final String MANGA_SEARCH_URL="https://api.jikan.moe/v3/search/manga?q=";

    @Autowired
    RestTemplate restTemplate;

    public List<Manga> getMangasByTitle(String title) {
        return restTemplate.getForEntity(MANGA_SEARCH_URL+title, MangaResult.class).getBody().getResults();
    }
}