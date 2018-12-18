package com.springboot.entity;
/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月17日 下午4:54:52
* 类说明
*/
public class Orders {
   private int id;
   private String name;
   private int status;
   private int version;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
@Override
public String toString() {
	return "Orders [id=" + id + ", name=" + name + ", status=" + status + ", version=" + version + "]";
}
public Orders() {
	super();
	// TODO Auto-generated constructor stub
}
public Orders(int id, String name, int status, int version) {
	super();
	this.id = id;
	this.name = name;
	this.status = status;
	this.version = version;
}
   
}
