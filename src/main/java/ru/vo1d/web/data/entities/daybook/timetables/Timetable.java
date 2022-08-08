package ru.vo1d.web.data.entities.daybook.timetables;

import lombok.*;
import ru.vo1d.web.data.entities.daybook.groups.Group;
import ru.vo1d.web.data.entities.daybook.groups.TableType;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "timetables")
public final class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "group_code", nullable = false)
    private Group group;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private TableType type;

    @Column(nullable = false)
    private TimetableFormat format;
}
