package ru.vo1d.web.data.dto.daybook.timetables.sessions;

import java.time.LocalDateTime;
import java.time.ZoneId;

public record DatedSessionDto(
        int id,
        String subject,
        String instructor,
        String place,
        int typeId,
        LocalDateTime dateTime,
        ZoneId timeZone,
        int quantity
) {
}
