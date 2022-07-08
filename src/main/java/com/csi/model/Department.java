package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue
    private long departmentId;

    @NotNull
    private String departmentName;

    @NotNull
    private String departmentCode;

    @NotNull
    @Column(length = 100, unique = true)
    private String emailId;

    @NotNull
    @Column(length = 100)
    private String encryptedPassword;



}
