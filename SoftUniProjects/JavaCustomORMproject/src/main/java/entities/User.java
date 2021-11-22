package entities;

import annotation.Column;
import annotation.Entity;
import annotation.Id;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.LocalDate;

@Entity(name = "users", tableName = "home")
public class User {

    @Id
    private long id;
    @Column(name = "username", columnDefinition = "VARCHAR(100)")
    private String userName;
    @Column(name = "age", columnDefinition = "INT")
    private int age;
    @Column(name = "registration", columnDefinition = "DATE")
    private LocalDate registration;

    public User(){

    }

    public User(String userName, int age, LocalDate registration) {
        this.userName = userName;
        this.age = age;
        this.registration = registration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }
}
