package az.edu.turing.springdataapplication.controller;

import az.edu.turing.springdataapplication.entity.Student;
import az.edu.turing.springdataapplication.repository.StudentRepository;
import az.edu.turing.springdataapplication.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);

    }

    @PutMapping("/edit/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

}
