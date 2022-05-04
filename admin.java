import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class admin {
 
	public static Connection con = null;
	public static void add() throws Exception 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("How many perticulars you want to inserted");
	    int m=sc.nextInt();
	    for(int i=1;i<=m;i++)
	    {
		System.out.println("Enter Name of product ");
		sc.nextLine();
        String namee=sc.nextLine();
		System.out.println("Enter the Price ");
		int pricee=sc.nextInt();
		
		System.out.println("Enter the Discount ");
		int discountt=sc.nextInt();
		
		String s1="insert into predef values(?,?,?)";
		PreparedStatement pre= con.prepareStatement(s1);
		pre.setString(1,namee);
		pre.setInt(2,pricee);
		pre.setInt(3,discountt);
		
		int rows =pre.executeUpdate();
			System.out.println("Record inserted succesfully");
	 }}
	 
	public static void show() throws Exception  
	{
		String sq="select * from predef ";
		Statement st= con.createStatement();
		ResultSet rt=st.executeQuery(sq);
		System.out.println("Product     Rate     Discount");
		while(rt.next()) 
		{
			
			System.out.println(rt.getString("nam")+"         "+rt.getInt("price")+"        "+rt.getInt("disc"));
	
	    }
	}
}
