package com.dark.graduate.lesson.mapeper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dark.graduate.lesson.pojo.Lesson;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LessonMapper extends BaseMapper<Lesson> {
}
