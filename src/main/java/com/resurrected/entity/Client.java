package com.resurrected.entity;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_client")
    private String id;
    @Column(name = "dv_name")
    private String name;
    @Column(name = "dv_lastname")
    private String lastname;
    @Column(name = "dv_document")
    private Long document;
    @Column(name = "dv_phoneNumber")
    private String phoneNumber;
    @Column(name = "dv_address")
    private String address;
    @Column(name = "dv_email")
    private String email;
    @Column(name = "dv_password")
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dv_load")
    private Date load;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dv_edit")
    private Date edit;
    @Column(name = "dv_statusClient")
    private Boolean statusClient;
    @Column(name = "dv_rol")
    private Rol rol;

    @OneToOne
    private Photo photo;

}
