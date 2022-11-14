package com.csvRead.test.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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

    @Id @GeneratedValue
    private Integer id;
    private String name;
    private String job;
    private Integer age;
    private String city;
    private Double salary;
}
