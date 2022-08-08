package ru.vo1d.web.data.entities.daybook.timetables.sessions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dated_sessions")
public final class DatedSession extends Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @NonNull
    private LocalDateTime dateTime;

    @Column(nullable = false)
    @NonNull
    private ZoneId timeZone;
}
