package ru.vo1d.web.data.repos.daybook.groups;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.vo1d.web.data.dto.daybook.groups.GroupDto;
import ru.vo1d.web.data.entities.daybook.groups.Group;

import java.util.List;

public interface GroupsRepo extends JpaRepository<Group, String> {
    @Query(value = "SELECT g.code, g.level_id, g.degree_id, g.form_id FROM groups AS g", nativeQuery = true)
    @NotNull List<GroupDto> findALlDto();
}
