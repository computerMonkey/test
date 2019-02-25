package hello.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Demo {
    public String name;
    @JSONField(serialize = false)
    public int age;
    @JSONField(format = "yyy-MM-dd HH:mm:ss")
    public Date date;

    public Demo(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }
}
