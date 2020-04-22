package com.dark.graduate.user;

import com.dark.graduate.user.mapper.StudentMapper;
import com.dark.graduate.user.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GraduateUserApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setUid("123");
        student.setName("曾仕");
        studentMapper.insert(student);
    }

}
