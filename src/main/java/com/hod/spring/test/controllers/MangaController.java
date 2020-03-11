package com.hod.spring.test.controllers;


import com.hod.spring.test.model.Manga;
import com.hod.spring.test.services.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/manga")
public class MangaController {

    @Autowired
    private MangaService mangaService;

    @RequestMapping(value = "/async/{title}", method = RequestMethod.GET)
    @Async
    public CompletableFuture<List<Manga>> searchASync(@PathVariable(name = "title") String title) {
        return CompletableFuture.completedFuture(mangaService.getMangasByTitle(title));
    }

    @RequestMapping(value = "/sync/{title}", method = RequestMethod.GET)
    public @ResponseBody List<Manga> searchSync(@PathVariable(name = "title") String title) {
        return mangaService.getMangasByTitle(title);
    }
}
