package ru.vo1d.web.data.entities.daybook.timetables.sessions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.vo1d.web.data.entities.daybook.timetables.time.StartTime;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "regular_sessions")
public final class RegularSession extends Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "start_time_id", nullable = false)
    private StartTime startTime;
}
