package lab1_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4: ������\n");
		System.out.print("���� ���� �Է�: ");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int a[]=new int[i];
		System.out.print("5���� ���� �Է�: ");
		for(int c=0;c<i;c++) {
			a[c]=s.nextInt();
		}
		double r=getAverage(a);
		System.out.print("��� = "+r);
	}
	public static double getAverage(int n[]) {
		double s=0;
		for(int i=0;i<n.length;i++) {
			s+=n[i];
		}
		return s/n.length;
	}
}
