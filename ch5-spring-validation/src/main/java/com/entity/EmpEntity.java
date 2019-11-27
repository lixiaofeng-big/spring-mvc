package com.entity;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-13 11:12
 **/
public class EmpEntity {
    private Integer id;
    @Size(min = 3,max = 8,message = "名字格式不正确")
    private String name;
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号格式不正确")
    @NotBlank(message = "手机号不能为空")
    private String phone;
    @Email(message = "邮箱格式不正确")
    private String email;
    @Past(message = "生日不能为空")
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
