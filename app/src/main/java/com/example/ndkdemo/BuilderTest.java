package com.example.ndkdemo;

/**
 * @author qiuyawei
 * @createTime 2020/8/5 4:11 PM
 * @describe
 */
class BuilderTest {
    private BuilderTest() {
    }

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

    public void showPersonInfo() {
        System.out.println("name:"+name+"\n"+"age:"+age);
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAage(int age) {
            this.age = age;
            return this;
        }

        public BuilderTest create() {
            BuilderTest builderTest = new BuilderTest();
            builderTest.age = age;
            builderTest.name = name;
            return builderTest;
        }
    }
}
