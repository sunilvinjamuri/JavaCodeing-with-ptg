package p6;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import p5.GetConnection;



public class Cashierprovider implements Productdao {



   @Override
    public ArrayList<Product> displayproduct(Product product) {



           ArrayList<Product>arrayList=new ArrayList<>();
            try {



               Connection con =GetConnection.getConnection();
                java.sql.Statement statement=con.createStatement();
                ResultSet  set=statement.executeQuery("SELECT * FROM student.product_info");
                while(set.next()) {
                    Product p=new Product();
                    p.setP_code(set.getInt(1));
                    p.setP_quan(set.getInt(2));
                    p.setP_cateogory(set.getString(3));
                    p.setP_name(set.getInt(4));
                    p.setP_descrip(set.getInt(5));
                    p.setP_price(set.getFloat(6));
                    arrayList.add(p);
                }



           }catch(Exception e) {
                e.printStackTrace();
            }
            return arrayList;
        }
    
    @Override
    public void addproduct(Product p) {
        try {



           Connection con =GetConnection.getConnection();
            java.sql.Statement statement= con.createStatement();
            String query="INSERT INTO `student`.`product_info` (`p_code`, `p_quan`, `p_cateogory`, ` p_name`, ` p_descrip`, `p_price`) VALUES ('"+p.getP_code()+"','"+p.getP_quan()+"', '"+p.getP_cateogory()+"', '"+p.getP_name()+"', '"+p.getP_descrip()+"', '"+p.getP_price()+"');";
            statement.executeUpdate(query);
            System.out.println("product added successfully");



       }catch(Exception e) {
            e.printStackTrace();
        }



   }
//
//    @Override
//    public void updateproduct() {
//
//
//    }



   @Override
    public void deproduct(Product p) {
        try {
            Connection con =GetConnection.getConnection();
            java.sql. Statement statement=con.createStatement();
            String query="DELETE FROM  `student`.`product_info` WHERE (`p_code` ='"+p.getP_code()+"' )";




            statement.executeUpdate(query);
            System.out.println("product delete successfully");
        }catch(Exception e) {
            e.printStackTrace();
        }  // TODO Auto-generated method stub



   }

}
