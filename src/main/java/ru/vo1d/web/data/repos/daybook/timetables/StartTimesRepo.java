package ru.vo1d.web.data.repos.daybook.timetables;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vo1d.web.data.entities.daybook.timetables.time.StartTime;

public interface StartTimesRepo extends JpaRepository<StartTime, Integer> {
}