package com.example.SpringBoard.domain;

public class UserForm {

    private int id;
    private String userid;
    private String userpw;
    private String usernick;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return userid;
    }

    public void setUserid(String id) {
        this.userid = id;
    }

    public String getPassword() {
        return userpw;
    }

    public void setUserpw(String password) {
        this.userpw = password;
    }

    public String getNickname() {
        return usernick;
    }

    public void setUsernick(String nickname) {
        this.usernick = nickname;
    }



}
