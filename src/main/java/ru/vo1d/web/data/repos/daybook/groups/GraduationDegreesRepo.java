package ru.vo1d.web.data.repos.daybook.groups;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vo1d.web.data.entities.daybook.groups.GraduationDegree;

public interface GraduationDegreesRepo extends JpaRepository<GraduationDegree, String> {
}