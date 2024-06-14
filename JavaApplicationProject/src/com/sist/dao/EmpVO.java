package com.sist.dao;
import java.util.*; //오라클 데이터형 => DATE => java.util.Date

import lombok.Data;


public class EmpVO {
   private int empno;
   private String ename,job;
   private Date hiredate;
   private int sal,mgr,comm,deptno;
   // 부서 정보 => JOIN
   private DeptVO dvo=new DeptVO(); // 포함 클래스를 만든다
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public int getMgr() {
	return mgr;
}
public void setMgr(int mgr) {
	this.mgr = mgr;
}
public int getComm() {
	return comm;
}
public void setComm(int comm) {
	this.comm = comm;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public DeptVO getDvo() {
	return dvo;
}
public void setDvo(DeptVO dvo) {
	this.dvo = dvo;
}
  
  
}
