package com.project.project_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "nickname")
    private String nickname;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "age")
    private Object age;
    @Basic
    @Column(name = "sex")
    private Object sex;
    @Basic
    @Column(name = "tel")
    private String tel;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "last_login_time")
    private Timestamp lastLoginTime;
    @Basic
    @Column(name = "act_flag")
    private byte actFlag;

    public Object getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public byte getActFlag() {
        return actFlag;
    }

    public void setActFlag(byte actFlag) {
        this.actFlag = actFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return actFlag == user.actFlag && Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(nickname, user.nickname) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(age, user.age) && Objects.equals(sex, user.sex) && Objects.equals(tel, user.tel) && Objects.equals(createTime, user.createTime) && Objects.equals(lastLoginTime, user.lastLoginTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, nickname, password, email, age, sex, tel, createTime, lastLoginTime, actFlag);
    }
}
