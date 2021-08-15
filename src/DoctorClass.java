
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
public class DoctorClass {
    
    
    public String doctorDB(){
     
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
.executeQuery("SELECT * FROM doctor");

while (resultSet.next()) {
s+=resultSet.getString("doctor_id")+"\t"+ resultSet.getString("doctor_name")+"\t"+ 
     resultSet.getString("designation")+"\t  "+resultSet.getString("advising_hour")+"\t"+resultSet.getString("doctor_phn_no")+"\t"+
        resultSet.getString("hospital_id")+"\n";
}
return s;
} catch (Exception e) {
e.printStackTrace();
}

 
return s; }   
    
    
  
 //////////////////////////////////////////////////////////////////////////   
    
    
 public void doctorInsert(String doctor_id,String doctor_name ,String designation,String advising_hour,
         String doctor_phn_no,String hospital_id){
               
          
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("insert into doctor(doctor_id,doctor_name,designation,advising_hour,doctor_phn_no,hospital_id)\n" +
                "values  ('"+doctor_id+"','"+ doctor_name+"','"+designation+"','"+advising_hour+"','"+doctor_phn_no+"',"+"'"
                +hospital_id+"'"+") ");






} catch (Exception e) {
e.printStackTrace();
}

        
      
        
    }
 
 
 //////////////////////////////////////////////////////////////////////////
    
  
  public void doctorUpdate(String doctor_id,String doctor_name ,String designation,String advising_hour,
         String doctor_phn_no,String hospital_id){
               
          
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Checkpoint_Two;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("SELECT * FROM doctor WHERE doctor_id='"+doctor_id+"'");
   
resultSet.next();
    
     if(doctor_id.isEmpty())
      doctor_id+=resultSet.getString("doctor_id");
    
      if(doctor_name.isEmpty()) 
      doctor_name+= resultSet.getString("doctor_name");
  
   
    if(designation.isEmpty()){
      designation= resultSet.getString("designation");
  }    
    
      if(advising_hour.isEmpty()){
      advising_hour= resultSet.getString("advising_hour");
  } 
      
       if(doctor_phn_no.isEmpty()){
      doctor_phn_no= resultSet.getString("doctor_phn_no");
  }  
  
        if(hospital_id.isEmpty()){
      hospital_id= resultSet.getString("hospital_id");
  }       
    

 
//String p="update vaccine set batch_id='B2001', manufacturer_id='M101', importer_id='I21', vaccine_type='VIRAL VECTOR', cost=240, manufacture_name='BioNTech', importer_name='DGDA', batch_quantity=30 where vaccine_id='V1106'";

String s= 
        "update doctor set doctor_id='"+doctor_id+"', doctor_name='"+doctor_name+"', designation='"+designation+"', advising_hour='"+advising_hour+"', doctor_phn_no='"+ doctor_phn_no+"', hospital_id='"+hospital_id+"'  where doctor_id='"+doctor_id+"'" ;

ResultSet rs = statement.executeQuery(s);




 
} catch (Exception e) {
e.printStackTrace();
}

        
      
        
    }  
    
}
