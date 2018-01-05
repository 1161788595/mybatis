package com.zking.po;

public class User {
    private int id;
    private String username;
    private String userpwd;
    private String usersex;
    private  String uid;

    public User(int id, String username, String userpwd, String usersex) {
        this.id = id;
        this.username = username;
        this.userpwd = userpwd;
        this.usersex = usersex;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", usersex='" + usersex + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
