package ru.vo1d.web.controllers.daybook;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import ru.vo1d.web.data.dto.daybook.timetables.TimetableDto;
import ru.vo1d.web.data.entities.daybook.timetables.Timetable;
import ru.vo1d.web.data.repos.daybook.timetables.TimetablesRepo;

import java.util.List;

@RestController
@RequestMapping("daybook/timetables")
final class TimetablesController {
    @Autowired
    private TimetablesRepo repo;


    @NotNull
    @GetMapping
    List<TimetableDto> list(@RequestParam(defaultValue = "0") final int page) {
        final var pageRequest = PageRequest.of(page, 10);
        return repo.findAllDto(pageRequest).getContent();
    }

    @NotNull
    @PostMapping
    Timetable addItem(@RequestBody() final Timetable item) {
        return repo.save(item);
    }

    @NotNull
    @GetMapping("/{id}")
    Timetable itemById(@PathVariable final int id) {
        return repo.findById(id).orElseThrow();
    }
}
