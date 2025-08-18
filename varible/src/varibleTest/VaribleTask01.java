package varibleTest;
// 실습 
// 각 데이처에 맞는 타입 선언 후 출력해보기
// S, false, 7845.15, B, 85.10F, 자바, 5, 98590, D, true, 107L 공백무자

public class VaribleTask01 {
	public static void main(String[] args) {
// 		내가 값을 모를때 -> 초기값 선언
//		내가 값을 알대는 -> 초기값 선언하지 않는다.
     int num1 = 0, num2 = 0;
     boolean isFalse = false, isTrue = false;
     double	num3 = 	0.0;
     float num4 = 0.0F;
     char data1 = ' ', data2 = ' ', data3 = ' ', data4 = ' ';
     String str1 = "";
     long num5 = 0L;
     
     
     num1 = 5;
     num2 = 98590;
     num3 = 7845.15;
     num4 = 85.10F;
     data1 = 'B';
     data2 = 'S';
     data3 = 'D';
     data4 = ' ';
     str1 = "자바";
     num5 = 107L;
     
     System.out.println(num1 + num2 + num3 + num4 + data1 + data2 + data3 + data4 + str1 + num5);
		
	}

}
