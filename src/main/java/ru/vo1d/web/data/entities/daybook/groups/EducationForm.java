package ru.vo1d.web.data.entities.daybook.groups;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "education_forms")
public final class EducationForm {
    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String title;
}