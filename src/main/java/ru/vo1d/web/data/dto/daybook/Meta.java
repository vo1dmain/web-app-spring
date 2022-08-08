package ru.vo1d.web.data.dto.daybook;

import ru.vo1d.web.data.dto.daybook.groups.GroupDto;
import ru.vo1d.web.data.entities.daybook.groups.EducationForm;
import ru.vo1d.web.data.entities.daybook.groups.GraduationDegree;
import ru.vo1d.web.data.entities.daybook.groups.GraduationLevel;
import ru.vo1d.web.data.entities.daybook.groups.TableType;
import ru.vo1d.web.data.entities.daybook.timetables.sessions.SessionType;
import ru.vo1d.web.data.entities.daybook.timetables.time.StartTime;

import java.util.List;

public record Meta(
        List<GraduationLevel> levels,
        List<GraduationDegree> degrees,
        List<EducationForm> forms,
        List<StartTime> startTimes,
        List<SessionType> sessionTypes,
        List<TableType> tableTypes,
        List<GroupDto> groups
) {
}
