package ru.vo1d.web.controllers.news;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import ru.vo1d.web.data.entities.news.Category;
import ru.vo1d.web.data.repos.news.CategoriesRepo;

import java.util.List;

@RestController
@RequestMapping("news/categories")
public final class CategoriesController {
    @Autowired
    private CategoriesRepo categoriesRepo;

    @GetMapping
    @NotNull List<Category> list(@RequestParam(defaultValue = "0") final int page) {
        final var pageRequest = PageRequest.of(page, 10);
        return categoriesRepo.findAll(pageRequest).getContent();
    }

    @GetMapping("/{id}")
    @NotNull Category itemById(@PathVariable final int id) {
        return categoriesRepo.findById(id).orElseThrow();
    }
}
