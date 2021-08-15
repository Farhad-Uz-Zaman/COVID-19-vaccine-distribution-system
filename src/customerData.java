
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class customerData {
    
    public String customerDB(){
     
        String s="";
  
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection(
        "jdbc:sqlserver://localhost:1433;databaseName=CheckPoint_Two;selectMethod=cursor", "sa", "123456");
        System.out.println("DATABASE NAME IS:"+ connection.getMetaData().getDatabaseProductName());
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
        .executeQuery("SELECT * FROM customer");

        while (resultSet.next()) {
        s+=resultSet.getString("")+"\t"+ resultSet.getString("")+"\t"+ 
             resultSet.getString("")+"\t  "+resultSet.getString("")+"\t"+resultSet.getString("")+"\t\t"+
                resultSet.getString("")+"\t"+resultSet.getString("")+"\t\t"+resultSet.getString("")+"\t  "+resultSet.getString("")+"\n";
        }
        
        return s;
    
        } catch (Exception e) {
        e.printStackTrace();
        }

        return s; 
    }   
    
    
    
    
    
    
    
    public void customerInsert(String customer_id, String customer_adress, String customer_name, String date_of_birth, String gender, String customer_phn_no, String NID, String hospital_id, String transaction_id){
               
          
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
        System.out.println("DATABASE NAME IS:"+ connection.getMetaData().getDatabaseProductName());
        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery("insert into customer(customer_id, customer_adress, customer_name, date_of_birth, "
                + "gender, customer_phn_no, NID, hospital_id, transaction_id) "
                +"values('"+customer_id+"','"+customer_adress+"','"+customer_name+"','"+date_of_birth+"','" 
                +gender+"','"+customer_phn_no+"','" +NID+"','"+hospital_id+"','"+transaction_id+"')");

        

        } catch (Exception e) {
        e.printStackTrace();
        }
    
    }
    
    
}
