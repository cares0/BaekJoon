package com.baekjoon.b4.q2420;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger abs = a.subtract(b);

		System.out.println(abs.abs());
		
		
		// 각각 a와 b는 int형에 들어갈 수 있지만, a-b는 int형에 들어갈 수 없을 수가 있다.
		// 만약 - 20억과 + 20억의 차이를 계산했다면 int의 최대 표현 범위를 넘어서기 때문에 틀린다.
		
	}

}
