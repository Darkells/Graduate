package com.dark.graduate.user.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Student {
    @TableId(type = IdType.AUTO)
    private Integer Id;

    private String Uid;

    private String Name;

    private String Password;

    private String Faculty;

    private String Phone;

    private String Email;

    private String Country;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Regist;

    private String Province;

    private String Openid;

}
