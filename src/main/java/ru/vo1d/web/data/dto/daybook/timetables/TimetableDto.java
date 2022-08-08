package ru.vo1d.web.data.dto.daybook.timetables;

import ru.vo1d.web.data.entities.daybook.timetables.TimetableFormat;

public record TimetableDto(int id, String groupCode, String typeId, TimetableFormat format) {
}
