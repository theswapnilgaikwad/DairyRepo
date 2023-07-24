package com.dairy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity


public class MilkCollection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String inwardDate ;
	private String rateType ;
	private String warehouse ;
	private String sansthaCode ;
	private String canQty ;
	private String weight ;
	private String milkType ;
	private String collectionType ;
	private String sansthaName ;
	private String sampleNo ;
	private String sourCanQty ;
	private String address ;
	private String routeName ;
	private String SourWeight ;
	private String mobileNo ;
	private String fDate ;
	private String tDate ;
	private String gDate ;
	public String getgDate() {
		return gDate;
	}
	public void setgDate(String gDate) {
		this.gDate = gDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInwardDate() {
		return inwardDate;
	}
	public void setInwardDate(String inwardDate) {
		this.inwardDate = inwardDate;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getSansthaCode() {
		return sansthaCode;
	}
	public void setSansthaCode(String sansthaCode) {
		this.sansthaCode = sansthaCode;
	}
	public String getCanQty() {
		return canQty;
	}
	public void setCanQty(String canQty) {
		this.canQty = canQty;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}
	public String getSansthaName() {
		return sansthaName;
	}
	public void setSansthaName(String sansthaName) {
		this.sansthaName = sansthaName;
	}
	public String getSampleNo() {
		return sampleNo;
	}
	public void setSampleNo(String sampleNo) {
		this.sampleNo = sampleNo;
	}
	public String getSourCanQty() {
		return sourCanQty;
	}
	public void setSourCanQty(String sourCanQty) {
		this.sourCanQty = sourCanQty;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getSourWeight() {
		return SourWeight;
	}
	public void setSourWeight(String sourWeight) {
		SourWeight = sourWeight;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	
	

}
