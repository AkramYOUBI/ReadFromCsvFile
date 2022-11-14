package com.csvRead.test.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String id;
    private String name;
    private String job;
    private Integer age;
    private String city;
    private Double salary;
    private Date createdAt;

    @PrePersist
    private void onPrePresiste(){
        if(this.id == null){
            this.setId("employee"+ UUID.randomUUID().toString());
        }
        this.setCreatedAt(new Date());
    }
}
