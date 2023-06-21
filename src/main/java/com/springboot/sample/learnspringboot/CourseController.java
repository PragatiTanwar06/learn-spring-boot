package com.springboot.sample.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1234,"test- 1"),
                new Course(1235,"test- 2"),
                new Course(1236,"test- 3"),
                new Course(1237,"test- 4")
        );
    }
}
