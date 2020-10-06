package view;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num=0;
		
		System.out.println("Digite o termo Fibonnacci: ");
		num = leitor.nextInt();
		
		for(int i=1; i<= num; i++){
			System.out.println(fibo(i));
		}

	}

	 static int fibo(int num) {
		
		if(num ==1 || num ==2){
			return 1;
		}else{
		return fibo(num-1) + fibo(num-2);
		}
	}

}
