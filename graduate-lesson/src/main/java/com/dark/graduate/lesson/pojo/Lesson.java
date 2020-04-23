package com.dark.graduate.lesson.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Lesson {
    @TableId(type = IdType.AUTO)
    private Integer Id;

    private Integer Teaid;

    private String Name;

    private LocalDate Startday;

    private LocalDate Endday;

    private String StartTime;

    private String EndTime;

    private String Local;

    private Integer Type;

    private String Desc;
}
