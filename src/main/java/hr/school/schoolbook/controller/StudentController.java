package hr.school.schoolbook.controller;

import hr.school.schoolbook.model.Student;
import hr.school.schoolbook.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
