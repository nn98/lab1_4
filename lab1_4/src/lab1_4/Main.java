package lab1_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4: 김윤서\n");
		System.out.print("정수 개수 입력: ");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int a[]=new int[i];
		System.out.print("5개의 정수 입력: ");
		for(int c=0;c<i;c++) {
			a[c]=s.nextInt();
		}
		double r=getAverage(a);
		System.out.print("평균 = "+r);
	}
	public static double getAverage(int n[]) {
		double s=0;
		for(int i=0;i<n.length;i++) {
			s+=n[i];
		}
		return s/n.length;
	}
}
