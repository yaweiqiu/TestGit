package com.example.ndkdemo;

/**
 * @author qiuyawei
 * @createTime 2020/8/12 9:39 AM
 * @describe
 */
class Children {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Children(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
