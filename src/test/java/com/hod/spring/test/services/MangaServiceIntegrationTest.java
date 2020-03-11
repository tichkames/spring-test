package com.hod.spring.test.services;


import com.hod.spring.test.model.Manga;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
public class MangaServiceIntegrationTest {

    @Autowired
    private MangaService mangaService;

    @Test
    public void testGetMangasByTitle() {
        List<Manga> mangasByTitle = mangaService.getMangasByTitle("ken");
        log.info(mangasByTitle.toString());
        assertThat(mangasByTitle).isNotNull().isNotEmpty();
    }
}
