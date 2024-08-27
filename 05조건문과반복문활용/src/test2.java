
/*
 문제. 아래의 다중 for문을 while문으로 변경 하시오.

출력결과
*
**
***
****
*****
******
*******
********
*********
**********
***********
*/
public class test2 {

	public static void main(String[] args) {

		int i = 0;
		
		while(i <= 10) {
			int j = 0;
			
			while(j <= i) {
				System.out.print("*");
				
				j++;
			}
			System.out.println();
			
			i++;
		}
	}

}
