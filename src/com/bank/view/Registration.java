package com.bank.view;
import java.util.*;
import com.bank.modal.User;
import java.io.*;

public class Registration {
	static int count=1;
public static User setInfo(){
	User u=new User();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user details"+count);
	u.setAadharNo(sc.nextLong());
	/*u.setLastname(sc.next());

	u.setFirstname(sc.next());
	u.setPhNo(sc.nextLong());
	u.setAccNo(sc.nextLong());
	u.setAccType(sc.next());
	u.setPanCard(sc.next());
	u.setAddress(sc.next());*/
	count++;
	return u;
	
}
	
	public static void main(String args[]){
		ArrayList<User> ua=new ArrayList<>();
		System.out.println("enter no of users");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		ua.add(setInfo());
		
		System.out.println(ua);
		try {
			FileOutputStream f=new FileOutputStream("E:\\Capg\\UserFile.txt");
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(ua);
			System.out.println("done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

