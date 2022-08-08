package ru.vo1d.web.data.entities.daybook.groups;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "groups")
public final class Group {
    @Id
    @Column(name = "code", nullable = false, updatable = false)
    private String code;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "level_id", nullable = false)
    private GraduationLevel level;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "degree_id")
    private GraduationDegree degree;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "form_id", nullable = false)
    private EducationForm form;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "group_types",
            joinColumns = @JoinColumn(name = "group_code"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<TableType> types = new LinkedHashSet<>();
}