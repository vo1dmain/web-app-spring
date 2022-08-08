package ru.vo1d.web.data.dto.news;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public record ArticleDto(
        int id,
        String title,
        String preview,
        LocalDateTime dateTime,
        ZoneId timeZone,
        List<Integer> categories
) {
}
