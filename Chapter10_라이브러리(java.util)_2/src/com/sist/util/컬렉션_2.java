package com.sist.util;
import java.util.*;
public class 컬렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        // add(Object) => 어떤 데이터든지 다 받을 수 있어 장점일 수 있지만 데이터가 통일성이 없어서 단점일수도?
        // 반복문은 패턴이 있는 경우에만 사용이 가능
        list.add(100);
        list.add("홍길동");
        list.add('A');
        list.add(true);
        list.add(10.5);
        // 데이터형을 첨부 => 관리가 어렵다, 반복문이 어렵다 => 다 달라서 루프 돌리기가 불편
        int a=(int)list.get(0);
        String name=(String)list.get(1);
        char c=(char)list.get(2);
        boolean b=(boolean)list.get(3);
        double d=(double)list.get(4);
        // => 가급적이면 => 동일한 데이터형을 저장해서 사용한다 => 그래야 추가하기가 편하겠지
        // 형변환이 부담스럽다
        // 338p => 제네릭
        
	}

}
