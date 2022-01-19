package com.resurrected.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

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
	@Column(name = "dv_type")
	private String type;
	@Column(name = "dv_portion")
	private Integer portion;
	@Column(name = "dv_status")
	private Boolean status;
	@Column(name = "dv_price")
	private Integer price;
	@Column(name = "dv_stock")
	private Integer stock;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dv_load")
	private Date load;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dv_edit")
	private Date edit;

//	@OneToOne
//	private Ingredient ingredient;
//	
//	@OneToOne
//	private Menu menu;

	
	@ManyToOne
	@JoinColumn(name = "ticket")
	private Ticket ticket;

	@OneToOne
	private Photo photo;

}
