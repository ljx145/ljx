package com.csa.num4;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;
//Getter and Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

//空参构造
    public Employee() {
    }
//全参构造
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }
//定义虚方法earning
    abstract void earning();
//重写toString方法
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", number=" + number + ", birthday=" + birthday.toString() + '}';
    }
}
