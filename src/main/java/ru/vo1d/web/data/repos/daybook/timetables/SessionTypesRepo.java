package ru.vo1d.web.data.repos.daybook.timetables;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vo1d.web.data.entities.daybook.timetables.sessions.SessionType;

public interface SessionTypesRepo extends JpaRepository<SessionType, Integer> {
}