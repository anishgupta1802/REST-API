package com.example.rest.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
public class user {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id;
     @Column
     String firstName;

     @Column
     String lastName;

     @Column
     int age;
     @Column
     String occupation;


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


     public long getId(){
         return id;
     }
     public void setId(long id){
         this.id=id;
     }

    public String getFirstName(){
            return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getage(){
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
}
