package ru.vo1d.web.data.entities.daybook.groups;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "table_types")
public final class TableType {
    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TableType tableType = (TableType) o;
        return id != null && Objects.equals(id, tableType.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}