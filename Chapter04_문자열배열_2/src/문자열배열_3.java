
public class 문자열배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] lotto= {
        		4,24,27,35,37,45,
        		3,10,24,33,38,45,
        		7,10,22,25,34,40,
        		11,23,25,30,32,40,
        		8,13,19,27,40,45,
        		13,20,24,32,36,45,
        		4,7,12,14,22,33,
        		14,19,27,28,30,45,
        		22,26,29,30,34,45,
        		5,17,26,27,35,38,
        		21,26,30,32,33,35,
        		6,12,31,35,38,43,
        		3,5,13,20,21,37,
        		6,12,17,21,32,39,
        		2,20,33,40,42,44,
        		7,16,25,29,35,36,
        		6,14,15,19,21,41,
        		12,17,20,26,28,36,
        		3,5,12,22,26,31,
        		5,14,15,23,34,43,
        		6,7,9,11,17,18,
        		8,16,26,29,31,36,
        		2,3,6,19,36,39,
        		7,16,24,27,37,44,
        		2,14,15,22,27,33,
        		2,5,22,32,34,45,
        		9,14,34,35,41,42,
        		26,31,32,33,38,40,
        		3,11,15,20,35,44,
        		1,6,12,19,36,42,
        		6,7,22,32,35,36,
        		2,5,11,17,24,29,
        		12,30,32,37,39,41,
        		5,7,12,13,18,35,
        		14,16,27,35,39,45,
        		5,12,13,31,32,41,
        		8,9,20,25,29,33,
        		9,18,20,22,38,44,
        		10,14,16,18,29,35,
        		5,6,11,29,42,45,
        		12,15,17,24,29,45,
        		12,27,29,38,41,45,
        		1,4,13,17,34,39,
        		3,19,21,25,37,45,
        		12,18,22,23,30,34,
        		15,26,28,34,41,42,
        		14,23,31,33,37,40,
        		3,11,14,18,26,27,
        		21,22,26,34,36,41,
        		5,11,18,20,35,45,
        		1,9,12,26,35,38,
        		9,12,15,25,34,36,
        		15,23,29,34,40,44,
        		9,11,30,31,41,44,
        		8,11,16,19,21,25,
        		8,11,15,16,17,37,
        		8,13,18,24,27,29,
        		7,15,30,37,39,44,
        		1,4,29,39,43,45,
        		17,25,33,35,38,45,
        		6,10,12,14,20,42,
        		2,8,19,22,32,42,
        		1,3,9,14,18,28,
        		13,17,18,20,42,45,
        		4,7,14,16,24,44,
        		6,11,15,24,32,39,
        		1,4,13,29,38,39,
        		1,3,8,24,27,35,
        		6,14,16,18,24,42,
        		12,20,26,33,44,45,
        		13,18,25,31,33,44,
        		2,4,25,26,36,37,
        		17,18,21,27,29,33,
        		2,13,20,30,31,41,
        		2,4,15,23,29,38,
        		7,10,16,28,41,42,
        		17,21,23,30,34,44,
        		3,10,23,35,36,37,
        		13,23,26,31,35,43,
        		5,7,13,20,21,44,
        		27,36,37,41,43,45,
        		3,13,16,23,24,35,
        		7,11,16,21,27,33,
        		1,7,15,32,34,42,
        		2,9,10,14,22,44,
        		4,12,14,25,35,37,
        		7,8,9,17,22,24,
        		1,2,11,16,39,44,
        		22,26,31,37,41,42,
        		3,6,17,23,37,39,
        		2,6,17,18,21,26,
        		9,11,16,21,28,36,
        		3,9,10,29,40,45,
        		2,5,12,14,24,39,
        		1,6,13,37,38,40,
        		1,21,25,29,34,37,
        		2,13,25,28,29,36,
        		6,21,36,38,39,43,
        		6,12,19,23,34,42,
        		1,18,28,31,34,43,
        		11,20,29,31,33,42,
        		2,18,24,30,32,45,
        		1,14,15,24,40,41,
        		2,9,10,16,35,37,
        		4,15,24,35,36,40,
        		10,11,20,21,25,41,
        		4,9,23,26,29,33,
        		1,9,26,28,30,41,
        		7,9,22,27,37,42,
        		4,12,22,24,33,41,
        		2,12,30,31,39,43,
        		3,4,15,22,28,40,
        		14,21,35,36,40,44,
        		13,18,30,31,38,41,
        		3,8,17,20,27,35,
        		9,18,19,30,34,40,
        		9,10,15,30,33,37,
        		2,13,16,19,32,33,
        		1,8,13,36,44,45,
        		10,12,18,35,42,43,
        		12,14,25,27,39,40,
        		3,15,20,22,24,41,
        		4,11,28,39,42,45,
        		4,8,10,16,31,36,
        		2,10,13,22,29,40,
        		7,11,13,17,18,29,
        		4,10,20,32,38,44,
        		1,3,30,33,36,39,
        		23,27,29,31,36,45,
        		1,6,15,36,37,38,
        		14,15,23,25,35,43,
        		8,21,25,38,39,44,
        		7,9,12,15,19,23,
        		3,4,10,20,28,44,
        		4,15,22,38,41,43,
        		10,16,18,20,25,31,
        		13,24,32,34,39,42,
        		3,11,34,42,43,44,
        		3,17,18,23,36,41,
        		2,6,13,17,27,43,
        		5,7,12,22,28,41,
        		2,3,26,33,34,43,
        		9,14,17,18,42,44,
        		7,11,12,31,33,38,
        		1,3,23,24,27,43,
        		6,21,22,32,35,36,
        		2,6,11,13,22,37,
        		16,19,24,33,42,44,
        		6,14,16,21,27,37,
        		5,8,18,21,22,38,
        		4,5,12,14,32,42,
        		1,11,17,27,35,39,
        		7,24,29,30,34,35,
        		3,16,21,22,23,44,
        		21,27,29,38,40,44,
        		2,5,14,28,31,32,
        		3,4,16,27,38,40,
        		2,6,8,26,43,45,
        		2,15,16,21,22,28,
        		7,19,23,24,36,39,
        		5,18,20,23,30,34,
        		7,13,16,18,35,38
        };
        int[] result=new int[46];
        // 0은 제외 
        for(int i=0;i<lotto.length;i++)
        {
        	// 7,13,16,7,7,7
        	result[lotto[i]]++;
        	/*
        	 *  result[7]++
        	 *  result[13]++
        	 *  result[16]++
        	 */
        }
        
        for(int i=1;i<result.length;i++)
        {
        	System.out.println(i+":"+result[i]);
        }
        
	}

}