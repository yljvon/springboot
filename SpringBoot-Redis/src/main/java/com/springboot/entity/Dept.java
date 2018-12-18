package com.springboot.entity;

import java.io.Serializable;



public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; 
	private String 	dname; 
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + "]";
	}
	public Dept(Long deptno, String dname) {
		super();
		this.deptno = deptno;
		this.dname = dname;
	}
	public Dept() {
		super();
	
	}


	
	
}
