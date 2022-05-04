import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class user extends admin {
	
	public static Connection con  = null;
	public static void insertRecord() throws Exception 
	{
		
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many perticulars you want to inserted");
	    int l=sc.nextInt();
	    for(int i=1;i<=l;i++)
	    {
		System.out.println("Enter Perticulars");
        String n=sc.nextLine();
		System.out.println("Quantity");
		int pri=sc.nextInt();
		
		String s1="insert into shop values(?,?,?)";
		PreparedStatement pre= con.prepareStatement(s1);
		pre.setInt(1,1);
		pre.setString(2,n);
		pre.setInt(3,pri);
		
		int rows =pre.executeUpdate();
			System.out.println("Record inserted succesfully");
	    } }
	catch(Exception e)
	{
		System.out.println("Oopss product is not available");
	}
	}
	public static void selectRecord() throws Exception
	 {
			String sq="select predef.nam as Per,shop.qua as P,predef.price as Q,predef.disc as R,shop.qua*(predef.price-predef.disc) as total from shop INNER JOIN predef ON shop.nam=predef.nam";
			Statement st= con.createStatement();
			ResultSet rt=st.executeQuery(sq);
			System.out.println("Perticulars   Quantity   Price   Total");
			while(rt.next())
			{
				System.out.println(rt.getString("Per")+"            "+rt.getInt("P")+"          "+rt.getInt("Q")+"      "+rt.getInt("total"));

	        }
	   }	
	
}
