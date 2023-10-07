package com.systechafrica.part4.funtionalprogramming;

public class StudentDto {
    private String name;
    private String regNO;

    
    public StudentDto(String name, String regNO) {
        this.name = name;
        this.regNO = regNO;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegNO() {
        return regNO;
    }
    public void setRegNO(String regNO) {
        this.regNO = regNO;
    }
    @Override
    public String toString() {
        return "StudentDto [name=" + name + ", regNO=" + regNO + "]";
    }
    
}
