
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
 * @author Godot
 */
public class InventoryClass {
    
     public String inventoryDB(){
     
  String s="";
  
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("SELECT * FROM inventory");

while (resultSet.next()) {
s+=resultSet.getString("hospital_id")+"\t"+ resultSet.getString("vaccine_id")+"\n";
}
return s;
} catch (Exception e) {
e.printStackTrace();
}

 
return s; }
    
    
    
    
    
    
    
    
    
    public void inventoryInsert(String hospital_id,String vaccine_id){
               
          
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:"
            + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
            .executeQuery("insert into inventory(hospital_id, vaccine_id)values ('"+hospital_id+"','"+vaccine_id+"') ");






            } catch (Exception e) {
            e.printStackTrace();
            }

        
      
        
    }
    
    public void inventoryUpdate(String hospital_id,String vaccine_id){
               
          
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("SELECT * FROM inventory WHERE hospital_id='"+hospital_id+"'");
   
resultSet.next();
    
     if(hospital_id.isEmpty())
      hospital_id+=resultSet.getString("hospital_id");
    
      if(vaccine_id.isEmpty()) 
      vaccine_id+= resultSet.getString("vaccine_id");
  
   
    
    
        

 
//String p="update vaccine set batch_id='B2001', manufacturer_id='M101', importer_id='I21', vaccine_type='VIRAL VECTOR', cost=240, manufacture_name='BioNTech', importer_name='DGDA', batch_quantity=30 where vaccine_id='V1106'";

String s= 
        "update inventory set hospital_id='"+hospital_id+"', vaccine_id='"+vaccine_id+"' where hospital_id='"+hospital_id+"'" ;

ResultSet rs = statement.executeQuery(s);




 
} catch (Exception e) {
e.printStackTrace();
}

        
      
        
    }
    
}
