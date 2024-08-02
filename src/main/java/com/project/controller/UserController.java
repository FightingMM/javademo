package com.project.controller;

import com.project.util.BaseResponse;
import org.springframework.web.bind.annotation.*;


/**
 * @author Aidenf
 * @date 2022/06/23 9:47
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {


    @PostMapping("/test")
    public BaseResponse test() {
        try {
            return new BaseResponse().success("");
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse().fail(e.getMessage());
        }
    }



}