package com.newer.pojo;

import java.io.Serializable;

public class Student  implements Serializable{
    private  int userId;
    private  String userName;
    private  String passWord;
    private  String email;
    private  String sex;
    private  Integer userType;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Student(int userId, String userName, String passWord, String email, String sex, Integer userType) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.sex = sex;
        this.userType = userType;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", userType=" + userType +
                '}';
    }
}
