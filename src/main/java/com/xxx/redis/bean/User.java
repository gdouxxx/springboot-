package com.xxx.redis.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userName;
    private String passWord;
    private Integer sex;
    private Date birthday;

    //setter and  getter method
}
