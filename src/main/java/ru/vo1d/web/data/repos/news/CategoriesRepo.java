package ru.vo1d.web.data.repos.news;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vo1d.web.data.entities.news.Category;

public interface CategoriesRepo extends JpaRepository<Category, Integer> {
}