package hr.school.schoolbook.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
@Table
public class Student {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    // check if UUID is creating id in code, and AUTO creates in table
    public UUID id;
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Column
    public Date dateOfBirth;
    @Column
    public Map<Subject,Grade> gradesList;
}
