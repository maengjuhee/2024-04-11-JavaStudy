package com.sist.temp2;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*EmpDAO dao=new EmpDAO();
        System.out.println("dao="+dao);
        EmpDAO dao1=new EmpDAO();
        System.out.println("dao1="+dao1);*/
        EmpDAO dao=EmpDAO.newInstance();
        ArrayList<EmpVO> list=dao.empListData();
        /*for(EmpVO vo:list)
        {
        	System.out.println(vo.getEmpno()+" "
        			+vo.getEname()+" "
        			+vo.getJob()+" "
        			+vo.getSal()+" "
        			+vo.getDeptno());
        }*/
        for(EmpVO vo:list)
        {
        	System.out.println(vo.getZipcode()+" "
        			+vo.getSido()+" "
        			+vo.getGugun()+" "
        			+vo.getDong()+" "
        			+vo.getBunji());
        }
        System.out.println("=======================================");
        Scanner scan=new Scanner(System.in);
       /* System.out.print("사번 입력");
        int empno=scan.nextInt();
        EmpVO vo=dao.empDetailData(empno);
        System.out.println(vo.getEmpno()+" "
    			+vo.getEname()+" "
    			+vo.getJob()+" "
    			+vo.getSal()+" "
    			+vo.getDeptno());*/
       /* System.out.print("검색어 입력:");    
        String ename=scan.next();
        list=dao.empFind(ename);
        for(EmpVO vo:list)
        {
        	System.out.println(vo.getEmpno()+" "
        			+vo.getEname()+" "
        			+vo.getJob()+" "
        			+vo.getSal()+" "
        			+vo.getDeptno());
        }*/
        System.out.print("동 입력 :");
        String zipcode=scan.next();
        list=dao.empFind(zipcode);
        for(EmpVO vo:list)
        {
        	System.out.println(vo.getZipcode()+" "
        			+vo.getSido()+" "
        			+vo.getGugun()+" "
        			+vo.getDong()+" "
        			+vo.getBunji());
        }
       }
	
	}


