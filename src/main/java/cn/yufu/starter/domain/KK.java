package cn.yufu.starter.domain;

import org.springframework.beans.factory.annotation.Value;

public class KK {

    @Value("aa")
    private String name;

    @Value("${age}")
    private Integer age;

    public KK(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "KK{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public KK() {
    }
}
