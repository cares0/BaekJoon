package com.baekjoon.b5.q1271;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 원래는 BigInteger a = new BigInteger("1234"); 이런식으로 써야하는데
		// sc.nextBigInteger(); 를 하면 알아서 BigInteger타입 객체 하나를 만들어주는 것인가?
		// 맞다고 한다!!!!!!
		// 스캐너 클래스 안에 nextBigInteger안에는 new BigInteger 처럼 객체를 생성해주는게 있고
		// 리턴타입으로 BigInteger 객체를 반환해주는 것이다.
		// 그래서 BigInteger 객체를 새로 만들지 않아도 된다.
		 
		
		// 답안
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
		
		
		// BigInteger의 계산
		BigInteger bigNumber1 = new BigInteger("100000");
		BigInteger bigNumber2 = new BigInteger("10000");
				
		System.out.println("덧셈(+) :" +bigNumber1.add(bigNumber2));
		System.out.println("뺄셈(-) :" +bigNumber1.subtract(bigNumber2));
		System.out.println("곱셈(*) :" +bigNumber1.multiply(bigNumber2));
		System.out.println("나눗셈(/) :" +bigNumber1.divide(bigNumber2));
		System.out.println("나머지(%) :" +bigNumber1.remainder(bigNumber2));
		
		
		// BigInteger의 형 변환
		BigInteger bigNumber = BigInteger.valueOf(100000);
		
		int int_bigNum = bigNumber.intValue(); //BigIntger -> int
		long long_bigNum = bigNumber.longValue(); //BigIntger -> long
		float float_bigNum = bigNumber.floatValue(); //BigIntger -> float
		double double_bigNum = bigNumber.doubleValue(); //BigIntger -> double
		String String_bigNum = bigNumber.toString(); //BigIntger -> String
		
		
		// BigInteger의 두 수 비교 : compareTo 맞으면 0   틀리면 -1
		BigInteger bigNumber3 = new BigInteger("100000");
		BigInteger bigNumber4 = new BigInteger("1000000");
		int compare = bigNumber1.compareTo(bigNumber2);
		System.out.println(compare);
		
		
		
		
		
	}

}
