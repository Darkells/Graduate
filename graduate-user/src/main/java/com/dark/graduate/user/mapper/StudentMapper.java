package com.dark.graduate.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dark.graduate.user.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {
}
