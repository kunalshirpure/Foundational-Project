import java.sql.DriverManager;
import java.util.Scanner;

public class Main extends user {

	public static void main(String[] args)
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/kunall";
			String user="root";
			String password="Kunal@123";
			con=DriverManager.getConnection(url,user,password);
	      }
		catch(Exception e)
		{
			System.out.println(e);
		}
       Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Admin  2.User");
		int kkkk=sc.nextInt();
		
		try
		{
		
		switch(kkkk)
		{
		    case 1:
		      { 
		    	 
		         System.out.println("1.Insert Product   2.Show Product ");
		         int choose=sc.nextInt();
		         switch(choose)
		           {
		 
		             case 1:
		             add();
		             break;
		             case 2:
		             show();
		             break;
		             /* case 3:
		             update();*/
		           }
		        break;
		       }
		    case 2:
		     {
			      System.out.println("Customer Name ");
			      String s=sc.nextLine();
				
			      System.out.println("Mobile Number ");
			      String phone =sc.nextLine();
				
				  int choice=sc.nextInt();
			      switch(choice)
		          {
			       case 1:
				   insertRecord();
				   break;
			       case 2:
			       selectRecord();
			       break; 
		          }
			     break;
		        }
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}