package com.ohgiraffers.chap02securityjwt.user.model;

import com.ohgiraffers.chap02securityjwt.user.model.entity.OhgiraffersRole;

public class UserDTO {
    private String userID;
    private String userPass;
    private String userName;
    private OhgiraffersRole role;

    public UserDTO() {
    }

    public UserDTO(String userID, String userPass, String userName, OhgiraffersRole role) {
        this.userID = userID;
        this.userPass = userPass;
        this.userName = userName;
        this.role = role;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OhgiraffersRole getRole() {
        return role;
    }

    public void setRole(OhgiraffersRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userID='" + userID + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userName='" + userName + '\'' +
                ", role=" + role +
                '}';
    }
}
