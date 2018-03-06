package com.example.model;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.persistence.*;

import com.amazonaws.services.identitymanagement.model.User;

/**
 * Created by Wayne.
 */
@Table(name="orders")
@Entity
@IdClass(OrderKey.class)
public class Orders {
//	@Id
//	@Column(name = "ordersid")
//	public Integer ordersid;
//	@Id
//	@Column(insertable = false, updatable = false)
//	public Integer userid;
//	@Id
//	@Column(name = "menuid")
//    public Integer menuid;
	
	@Id
	@Column(name = "ordersid")
	public Integer ordersid;
	@Id
	@Column(insertable = false, updatable = false)
	public Integer userid;
	@Id
	@Column(name = "menuid")
	public Integer menuid;
	
	
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(name="o_m",
//		  joinColumns={ @JoinColumn(name = "Ordersid", referencedColumnName="ordersid", insertable = false, updatable = false),
//		   @JoinColumn(name = "Menuid", referencedColumnName="menuid", insertable = false, updatable = false),
//		   @JoinColumn(name = "Userid", referencedColumnName="userid",insertable = false, updatable = false)
//		},  inverseJoinColumns={@JoinColumn(name="Menuid",referencedColumnName="menuid")})
//	@OneToMany(fetch=FetchType.LAZY)
//	@JoinTable(name="o_m",joinColumns={ @JoinColumn(name = "Ordersid", referencedColumnName="ordersid", insertable = false, updatable = false),
//		   @JoinColumn(name = "Menuid", referencedColumnName="menuid", insertable = false, updatable = false),
//			   @JoinColumn(name = "Userid", referencedColumnName="userid",insertable = false, updatable = false)})
//	public List<Menuitems> menuitems;
//	public Menuitems menuitems;
	
	




//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="userid")
//	public Users users;
	
	
//	public List<Menuitems> getMenuitems() {
//		return menuitems;
//	}
//
//	public void setMenuitems(List<Menuitems> menuitems) {
//		this.menuitems = menuitems;
//	}

//	public List<Menuitems> getMenuitems() {
//		return menuitems;
//	}
//
//	public void setMenuitems(List<Menuitems> menuitems) {
//		this.menuitems = menuitems;
//	}

//	public Users getUser() {
//		return users;
//	}
//
//	public void setUser(Users user) {
//		this.users = users;
//	}
	
	

	@Transient
	public String timeString;

	@Transient
	public String dateString;

	@Column(name = "time")
	public Time sqlTime;

	@Column(name = "date")
	public Date sqlDate;

	@Column(name = "quantity")
	public int quantity=1;

	@Column(name = "status")
	public String status;

	@Transient
	public OrderKey orderKey;

	@Transient
	public String convertDate;

	@Transient
	public String convertTime;

	public OrderKey getOrderKey() {
		return orderKey;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Integer getordersid() {
		return ordersid;
	}

	public void setordersid(Integer ordersid) {
		this.ordersid = ordersid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getMenuid() {
		return menuid;
	}

	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	public String getTime() {
		return timeString;
	}

	public void setTime(String timeString) {
		this.timeString = timeString;
	}

	public String getDate() {
		return dateString;
	}

	public void setDate(String dateString) {
		this.dateString = dateString;
	}


	public Time getSqlTime() {
		return sqlTime;
	}

	public void setSqlTime(Time sqlTime) {
		this.sqlTime = sqlTime;
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
		convertDate = timeFormat.format(sqlTime);

	}

	public Date getSqlDate() {
		return sqlDate;
	}

	public void setSqlDate(Date sqlDate) {
		this.sqlDate = sqlDate;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		convertDate = dateFormat.format(sqlDate);
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
