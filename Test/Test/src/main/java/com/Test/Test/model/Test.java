package com.Test.Test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Test implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_test")
    private Integer id;
    @Column(name="test_username")
    private  String userName;
    @Column(name="test_userpass")
    private  String userPassword;
}
