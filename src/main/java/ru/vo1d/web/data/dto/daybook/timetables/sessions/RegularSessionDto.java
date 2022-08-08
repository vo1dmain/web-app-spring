package ru.vo1d.web.data.dto.daybook.timetables.sessions;

public record RegularSessionDto(
        int id,
        String subject,
        String instructor,
        String place,
        int typeId,
        int startTimeId,
        int quantity
) {
}
