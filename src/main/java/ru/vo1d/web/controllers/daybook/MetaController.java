package ru.vo1d.web.controllers.daybook;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vo1d.web.data.dto.daybook.Meta;
import ru.vo1d.web.data.dto.daybook.groups.GroupDto;
import ru.vo1d.web.data.entities.daybook.groups.EducationForm;
import ru.vo1d.web.data.entities.daybook.groups.GraduationDegree;
import ru.vo1d.web.data.entities.daybook.groups.GraduationLevel;
import ru.vo1d.web.data.entities.daybook.groups.TableType;
import ru.vo1d.web.data.entities.daybook.timetables.sessions.SessionType;
import ru.vo1d.web.data.entities.daybook.timetables.time.StartTime;
import ru.vo1d.web.data.repos.daybook.groups.*;
import ru.vo1d.web.data.repos.daybook.timetables.SessionTypesRepo;
import ru.vo1d.web.data.repos.daybook.timetables.StartTimesRepo;

import java.util.List;

@RestController
@RequestMapping("daybook/meta")
final class MetaController {
    @Autowired
    private GraduationLevelsRepo graduationLevelsRepo;
    @Autowired
    private GraduationDegreesRepo graduationDegreesRepo;
    @Autowired
    private EducationFormsRepo educationFormsRepo;
    @Autowired
    private StartTimesRepo startTimesRepo;
    @Autowired
    private SessionTypesRepo sessionTypesRepo;
    @Autowired
    private TableTypesRepo tableTypesRepo;
    @Autowired
    private GroupsRepo groupsRepo;


    @GetMapping
    @NotNull Meta get() {
        return new Meta(
                graduationLevelsRepo.findAll(),
                graduationDegreesRepo.findAll(),
                educationFormsRepo.findAll(),
                startTimesRepo.findAll(),
                sessionTypesRepo.findAll(),
                tableTypesRepo.findAll(),
                groupsRepo.findALlDto()
        );
    }

    @GetMapping("/levels")
    @NotNull List<GraduationLevel> levels() {
        return graduationLevelsRepo.findAll();
    }

    @GetMapping("/degrees")
    @NotNull List<GraduationDegree> degrees() {
        return graduationDegreesRepo.findAll();
    }

    @GetMapping("/forms")
    @NotNull List<EducationForm> forms() {
        return educationFormsRepo.findAll();
    }

    @GetMapping("/start-times")
    @NotNull List<StartTime> startTimes() {
        return startTimesRepo.findAll();
    }

    @GetMapping("/session-types")
    @NotNull List<SessionType> sessionTypes() {
        return sessionTypesRepo.findAll();
    }

    @GetMapping("/table-types")
    @NotNull List<TableType> tableTypes() {
        return tableTypesRepo.findAll();
    }

    @GetMapping("/groups")
    @NotNull List<GroupDto> groups() {
        return groupsRepo.findALlDto();
    }
}
