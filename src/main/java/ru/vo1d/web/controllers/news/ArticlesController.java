package ru.vo1d.web.controllers.news;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import ru.vo1d.web.data.dto.news.ArticleDto;
import ru.vo1d.web.data.entities.news.Article;
import ru.vo1d.web.data.repos.news.ArticlesRepo;

import java.util.List;

@RestController
@RequestMapping("news/articles")
final class ArticlesController {
    @Autowired
    private ArticlesRepo repo;

    @NotNull
    @GetMapping
    List<ArticleDto> list(@RequestParam(defaultValue = "0") final int page) {
        var pageRequest = PageRequest.of(page, 10);
        return repo.findAllDto(pageRequest).getContent();
    }

    @NotNull
    @GetMapping("/{id}")
    Article itemById(@PathVariable final int id) {
        return repo.findById(id).orElseThrow();
    }
}
