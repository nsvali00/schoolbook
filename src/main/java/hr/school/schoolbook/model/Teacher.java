package hr.school.schoolbook.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table
public class Teacher {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;
}
