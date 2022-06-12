package test2;

import java.sql.*;
import java.util.Scanner;

public class DBcon2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee id");
			String eid = sc.nextLine();
			System.out.println("Enter the Employee name");
			String ename = sc.nextLine();
			System.out.println("Enter the Employee edesg");
			String edesg = sc.nextLine();
			System.out.println("Enter the Employee baic salary");
			int bsal = sc.nextInt();
			Float totsal = bsal+(0.93F*bsal)+(0.63F*bsal);

							
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "student");
				Statement stm = con.createStatement();
				int k = stm.executeUpdate("insert into Employee values('"+eid+"','"+ename+"','"+edesg+"',"+bsal+","+totsal+")");
				if(k>0)
				{
					System.out.println("Employee details registered");
				}
				sc.close();
							
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}
