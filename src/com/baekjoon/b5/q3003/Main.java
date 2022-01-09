package com.baekjoon.b5.q3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] chess = new int [6];
		int [] piece = new int [6];
		chess [0] = 1;
		chess [1] = 1;
		chess [2] = 2;
		chess [3] = 2;
		chess [4] = 2;
		chess [5] = 8;
		
		for(int i=0;i<piece.length;i++) {
			piece[i] = sc.nextInt();			
		}
		
		for(int i =0;i<chess.length;i++) {
			System.out.println(chess[i] - piece[i]);
		}
		
		
	}

}
