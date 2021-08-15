/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Godot
 */

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;


public class HospitalClass {
    
    
    
    public String hospitalDB(){
     
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
.executeQuery("SELECT * FROM hospital");

while (resultSet.next()) {
s+=resultSet.getString("hospital_id")+"\t"+ resultSet.getString("hospital_name")+"\t\t"+ 
     resultSet.getString("hospital_adress")+"\n";
}
return s;
} catch (Exception e) {
e.printStackTrace();
}

 
return s; }
    
    
    
    
    
    
    
    
    
    public void hospitalInsert(String hospital_id,String hospital_name,String hospital_adress){
               
          
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:"
            + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
            .executeQuery("insert into hospital(hospital_id, hospital_name, hospital_adress)values ('"+hospital_id+"','"+ hospital_name+"','"+hospital_adress+"') ");






            } catch (Exception e) {
            e.printStackTrace();
            }

        
      
        
    }
    
    public void hospitalUpdate(String hospital_id,String hospital_name,String hospital_adress){
               
          
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("SELECT * FROM hospital WHERE hospital_id='"+hospital_id+"'");
   
resultSet.next();
    
     if(hospital_id.isEmpty())
      hospital_id+=resultSet.getString("hospital_id");
    
      if(hospital_name.isEmpty()) 
      hospital_name+= resultSet.getString("manufacturer_id");
  
   
    if(hospital_adress.isEmpty()){
     hospital_adress= resultSet.getString("importer_id");
  }    
    
        

 
//String p="update vaccine set batch_id='B2001', manufacturer_id='M101', importer_id='I21', vaccine_type='VIRAL VECTOR', cost=240, manufacture_name='BioNTech', importer_name='DGDA', batch_quantity=30 where vaccine_id='V1106'";

String s= 
        "update hospital set hospital_id='"+hospital_id+"', hospital_name='"+hospital_name+"', hospital_adress='"+hospital_adress+"' where hospital_id='"+hospital_id+"'" ;

ResultSet rs = statement.executeQuery(s);




 
} catch (Exception e) {
e.printStackTrace();
}

        
      
        
    }
    
}
