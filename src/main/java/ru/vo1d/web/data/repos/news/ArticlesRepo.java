package ru.vo1d.web.data.repos.news;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.vo1d.web.data.dto.news.ArticleDto;
import ru.vo1d.web.data.entities.news.Article;

public interface ArticlesRepo extends JpaRepository<Article, Integer> {

    @Query(
            nativeQuery = true,
            value = """
                    SELECT a.id, a.title, a.preview, a.date_time, a.time_zone, ac.category_id
                    FROM articles AS a
                    INNER JOIN article_categories AS ac ON ac.article_id = a.id
                    GROUP BY a.id
                    """,
            countQuery = "SELECT COUNT(id) FROM articles"
    )
    @NotNull Page<ArticleDto> findAllDto(Pageable pageable);
}