package com.resurrected.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.resurrected.enums.Description;
import com.resurrected.enums.Dress;
import com.resurrected.enums.RawMaterials;
import com.resurrected.enums.Status;
import com.resurrected.enums.Waist;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id_product")
	private String id;
	@Column(name = "dv_name")
	private String name;
	@Column(name = "dv_status")
    private Status status;
	@Column(name = "dv_waist")
    private Waist waist;
	@Column(name = "dv_dress")
    private Dress dress;
	@Column(name = "dv_description")
    private Description description;
	@Column(name = "dv_rawMaterials")
    private RawMaterials rawMaterials;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dv_publishedDate")
	private Date publisherDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dv_createDate")
	private Date createDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dv_updateDate")
	private Date updateDate;
	@Column(name = "dv_cost")
	private Double cost;	
	@Column(name = "dv_price")
	private Double price;
	@Column(name = "dv_stock")
	private Integer stock;
	@Column(name = "dv_iva")
	private Double iva;
	@ManyToOne
	@JoinColumn(name = "ticket")
	private Ticket ticket;

	@OneToOne
	private Photo photo;
	
	
	

}
