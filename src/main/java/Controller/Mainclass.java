package Controller;

import java.util.Scanner;
import DAO.Sample;
public class Mainclass {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Sample sample = new Sample();
	boolean flag=true;
	while(flag) {
		System.out.println("1.add emp\n2.fetch emp\n3.remove\n4.update\n5.fetch all\n6.remove all\n7.exit");
		switch (scanner.nextInt()) {
		case 1:{
			System.out.println("enter the emp id");
			int id=scanner.nextInt();
			System.out.println("enter the name");
			String name=scanner.next();
			System.out.println("enter the salary");
			double sal=scanner.nextDouble();
			System.out.println("enter the job role");
			String job=scanner.next();
			sample.addEmp(id, name, sal, job);
			
		}
			
			break;
case 2:{
	System.out.println("enter the emp id");
	int id=scanner.nextInt();
	sample.fetchEmp(id);
		}
			
			break;
case 3:{
System.out.println("enter the emp id");
int id=scanner.nextInt();
sample.removeEmp(id);
}
	
	break;
case 4:{
	System.out.println("enter the emp id");
	int id=scanner.nextInt();
	System.out.println("enter the new salary");
	Double sal=scanner.nextDouble();
	sample.updateEmpsal(id,sal);
}
	
	break;
case 5:{
	sample.fetchAll();
}
	
	break;
case 6:{
	sample.deleteAll();
	
}
	
	break;
case 7:{
	flag=false;
	System.out.println("thank you");
	
}
	
	break;
	
		default:
			System.out.println("invalid option");
			break;
		}
	}
  }	
}
