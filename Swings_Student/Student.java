import java.util.*;
import java.awt.*;
import javax.swing.*;


public class Student {
	String USN,name,address,category;
	int age;
	double g1,g2,g3,cgpa;
	Scanner sc = new Scanner(System.in);
	public Student(String name,String usn,String addr, String cat,int age,double g1,double g2,double g3){
		this.address = addr;
		this.name = name;
		this.USN = usn;
		this.age = age;
		this.category = cat;
		this.g1 = g1;
		this.g2=g2;
		this.g3=g3;
	}
	public void setCGPA(double g) {
		this.cgpa = g;
	}
	public String toString() {
		return "Name: "+name+" USN: "+USN+" Age:"+age+" address: "+address+" category:"+category+" CGPA:"+cgpa;
	}
}
