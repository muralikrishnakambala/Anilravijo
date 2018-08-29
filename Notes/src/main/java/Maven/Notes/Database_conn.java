package Maven.Notes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_conn 
{

	public static void main(String[] args) throws Exception
	{
		// Database connectivity example
     DriverManager d;
     Class.forName("");
     Connection cn=DriverManager.getConnection("");
     Statement st=cn.createStatement();
     st.execute("Select * from table_name-any insert,update,delete");
     ResultSet rs=st.executeQuery("Select * from table_name-select");
     System.out.println(rs);
	}

}
