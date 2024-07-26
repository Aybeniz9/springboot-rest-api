package az.edu.turing.springdataapplication.service;

import az.edu.turing.springdataapplication.entity.Student;
import az.edu.turing.springdataapplication.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Integer id, Student student) {
        Optional<Student> foundStudent = studentRepository.findById(id);
        if (foundStudent.isPresent()) {
            Student newStudent = foundStudent.get();
            newStudent.setName1(student.getName1());
            newStudent.setSurname(student.getSurname());
            newStudent.setStudentNumber(student.getStudentNumber());
            newStudent.setDateOfBirth(student.getDateOfBirth());
            return studentRepository.save(newStudent);
        }
        return null;


    }
}
