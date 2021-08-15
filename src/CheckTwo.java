/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;


//////////////////////////////////////////////////////////////////////////


public class CheckTwo {
    
    public String vaccineDB(){
     
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
.executeQuery("SELECT * FROM vaccine");

while (resultSet.next()) {
s+=resultSet.getString("vaccine_id")+"\t"+ resultSet.getString("batch_id")+"\t"+ 
     resultSet.getString("manufacturer_id")+"\t  "+resultSet.getString("importer_id")+"\t"+resultSet.getString("vaccine_type")+"\t\t"+
        resultSet.getString("cost")+"\t"+resultSet.getString("manufacture_name")+"\t\t"+resultSet.getString("importer_name")+"\t  "+resultSet.getString("batch_quantity")+"\n";
}
return s;
} catch (Exception e) {
e.printStackTrace();
}

 
return s; }   
    
    
  
 //////////////////////////////////////////////////////////////////////////   
    
    
 public void vaccineInsert(String vaccine_id,String batch_id,String manufacturer_id,String importer_id,
         String vaccine_type,String cost,String manufacture_name,String importer_name,String batch_quantity){
               
          
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("insert into vaccine(vaccine_id, batch_id, manufacturer_id, importer_id, vaccine_type, cost, manufacture_name, "
        + "importer_name, batch_quantity)values ('"+vaccine_id+"','"+ batch_id+"','"+manufacturer_id+"','"+importer_id+"','"+vaccine_type+"',"+cost+",'"
                +manufacture_name+"','"+importer_name+"',"+batch_quantity+") ");






} catch (Exception e) {
e.printStackTrace();
}

        
      
        
    }
 
 
 //////////////////////////////////////////////////////////////////////////
    
  
  public void vaccineUpdate(String vaccine_id,String batch_id,String manufacturer_id,String importer_id,
         String vaccine_type,String cost,String manufacture_name,String importer_name,String batch_quantity){
               
          
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("SELECT * FROM vaccine WHERE vaccine_id='"+vaccine_id+"'");
   
resultSet.next();
    
     if(batch_id.isEmpty())
      batch_id+=resultSet.getString("batch_id");
    
      if(manufacturer_id.isEmpty()) 
      manufacturer_id+= resultSet.getString("manufacturer_id");
  
   
    if(importer_id.isEmpty()){
      importer_id= resultSet.getString("importer_id");
  }    
    
      if(vaccine_type.isEmpty()){
      vaccine_type= resultSet.getString("vaccine_type");
  } 
      
       if(cost.isEmpty()){
      cost= resultSet.getString("cost");
  }  
  
        if(manufacture_name.isEmpty()){
      manufacture_name= resultSet.getString("manufacture_name");
  }       
    
        if(importer_name.isEmpty()){
     importer_name= resultSet.getString("importer_name");
  } 
        
       if(batch_quantity.isEmpty()){
     batch_quantity= resultSet.getString("batch_quantity");
  }  

 
String p="update vaccine set batch_id='B2001', manufacturer_id='M101', importer_id='I21', vaccine_type='VIRAL VECTOR', cost=240, manufacture_name='BioNTech', importer_name='DGDA', batch_quantity=30 where vaccine_id='V1106'";

String s= 
        "update vaccine set batch_id='"+batch_id+"', manufacturer_id='"+manufacturer_id+"', importer_id='"+importer_id+"', vaccine_type='"+vaccine_type+"',cost="+cost+", manufacture_name='"+ manufacture_name+"', importer_name='"+importer_name+"', batch_quantity="+ batch_quantity+"  where vaccine_id='"+vaccine_id+"'" ;

ResultSet rs = statement.executeQuery(s);




 
} catch (Exception e) {
e.printStackTrace();
}

        
      
        
    }  
  
 //////////////////////////////////////////////////////////////////////////
 
 
 
 
 
 
 
 
 
 
 
}
