package ru.vo1d.web.data.entities.daybook.timetables.sessions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
class Session {
    protected String subject;
    protected String instructor;
    protected String place;

    @ManyToOne
    @JoinColumn(name = "type_id")
    protected SessionType type;

    protected int quantity;
}
