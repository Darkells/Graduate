package com.dark.graduate.lesson.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vo.R;

@FeignClient("graduate-user")
public interface UserFeignService {
    @RequestMapping("/user/student/list")
    public R StudentList(@RequestParam Integer pagenum,@RequestParam Integer pagesize,@RequestParam String query);
}
