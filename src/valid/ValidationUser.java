package valid;
import java.util.*;

import com.bank.modal.User;
import com.bank.view.Registration;

import java.io.*;
public class ValidationUser {
static int count=1;
	public  User setInfo(){
		User u=new User();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new details"+count);
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
			//ArrayList<User> u2=new ArrayList<>();
			User u12=new User();
			ValidationUser validationUser=new ValidationUser();
			u12=validationUser.setInfo();
			//System.out.println(u.getAadharNo());
			try {
				FileInputStream file=new FileInputStream("E:\\Capg\\UserFile.txt");
				ObjectInputStream out=new ObjectInputStream(file);
				ArrayList<User> userlist2=(ArrayList<User>)out.readObject();
				int t=userlist2.size();
				int temp=0;
				for(int i=0;i<t;i++)
				{
					//System.out.println(userlist2.get(i).getAadharNo()+" "+u.getAadharNo());
					long t1=u12.getAadharNo();
					if(userlist2.get(i).getAadharNo()==t1){
						System.out.println("Working");
						break;
					}
						
					else
					{
						temp++;
					}
				}
				if(temp==3){
					System.out.println("Not a registered user");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



