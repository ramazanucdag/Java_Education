import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		
         Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/car?user=root&password=Ramazan.4521");
	     Statement st = c.createStatement();
	     
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Araba Ad?: ");
	        String name = scan.nextLine();
	        
	        System.out.println("Araba H?z?: ");
	        int speed = scan.nextInt();  
	    
	     
	   String query = "INSERT INTO cars (cars_name,cars_speed) VALUES ('" + name + "'," + speed + ")";
	     int sonuc = st.executeUpdate(query);
	     System.out.println(sonuc);
	     st.close();   
	     
	

	String q = "INSERT INTO cars (cars_name,cars_speed) VALUES (?,?)";
	PreparedStatement pt = c.prepareStatement(q);
	pt.setInt(2, speed);
	pt.setString(1, name);
	pt.executeUpdate();   
    
ResultSet rs = st.executeQuery("SELECT * FROM cars");
	
	while (rs.next()) {
		System.out.println(rs.getInt("cars_id") + "-" + rs.getString("cars_name") + " - " + rs.getInt("cars_speed"));
	}   
	
	
	
	
	
	
	}

}
