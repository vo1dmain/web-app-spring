package ru.vo1d.web.data.repos.daybook.timetables;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.vo1d.web.data.dto.daybook.timetables.TimetableDto;
import ru.vo1d.web.data.entities.daybook.timetables.Timetable;

public interface TimetablesRepo extends JpaRepository<Timetable, Integer> {

    @Query(value = "SELECT id, group_code, type_id, format FROM timetables",
            countQuery = "SELECT COUNT(id) FROM timetables",
            nativeQuery = true
    )
    @NotNull Page<TimetableDto> findAllDto(Pageable pageable);
}
