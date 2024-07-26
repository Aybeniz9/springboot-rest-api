package az.edu.turing.springdataapplication.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Data
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor


public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name1", nullable = false, columnDefinition = "TEXT")
    private String name1;

    @Column(name = "surname", nullable = false)
    private String surname;


    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "student_number", nullable = false, unique = true)
    private String studentNumber;

}
