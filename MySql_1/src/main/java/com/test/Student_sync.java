package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Student_sync {
	 
    private static final String URL = "jdbc:mysql://localhost:3306/Stud";
    private static final String USER = "root";
    private static final String PASS = "root@39";
    
    public static Connection getCon() {
    	 
        Connection con = null;
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return con;
    }
    
    
    
    public void StudDet(Student s) {
    	 
        String sql = "INSERT INTO student_details(id,name) VALUES (?, ?)";
 
        try (Connection con = getCon();
             PreparedStatement pst = con.prepareStatement(sql)) {
 
            pst.setInt(1, s.getId());
            pst.setString(2, s.getName());
 
            pst.executeUpdate();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public List<Student> getAllStudents() {
    	 
        List<Student> studList = new ArrayList<>();
 
        String sql = "select * from student_details";
        
 
        try (Connection con = getCon()){
             PreparedStatement pst1 = con.prepareStatement(sql);
             ResultSet rs = pst1.executeQuery();
 
             while (rs.next()) {
 
                Student st = new Student();
 
                st.setId(rs.getInt("id"));
                st.setName(rs.getString("name"));
                
                studList.add(st);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return studList;
    }
    
    public void updateStudent(Student s) {
    	try {
    		String sql = "update student_details set name = ? where id = ?";
    		PreparedStatement pst = EmpDao.getCon().prepareStatement(sql);
    		pst.setString(1, s.getName());
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    public void deleteStudent(Student s) {
    	try {
    		String sql = "delete from student_details where id = ?";
    		PreparedStatement pst = EmpDao.getCon().prepareStatement(sql);
    		pst.setInt(1, s);
    		pst.execute();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    
}
