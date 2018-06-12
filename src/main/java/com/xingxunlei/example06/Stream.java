package com.xingxunlei.example06;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Stream {

    @PostConstruct
    public void init () {
        List<A> list = new ArrayList<>();
        list.add(new A("a","b","c"));
        list.add(new A("a1","b1","c1"));
        list.add(new A("a2","b2","c2"));

        Map<String, String> result1 = list.stream().collect(Collectors.toMap(A::getName, A::getAge));
        System.out.println(result1);

        Map<String, A> result2 = list.stream().collect(Collectors.toMap((a) -> a.getName() + a.getAge(), v -> v));
        System.out.println(result2);
    }
    public static void main(String[] args) {
        Stream stream = new Stream();
    }
}

class A {

    private String name;
    private String age;
    private String sex;

    public A(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("A{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
