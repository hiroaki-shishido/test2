package com.internousdev.webproj4.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internoudev.webproj4.util.DBConnector;
import com.internous.dev.webproj4.dto.HelloStrutsDTO;


public class HelloStrutsDAO {

	List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

	public List<HelloStrutsDTO> select() {
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "select * from users";
    try{
    	PreparedStatement ps =con.prepareStatement(sql);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next()){
    		com.internous.dev.webproj4.dto.HelloStrutsDTO dto=new HelloStrutsDTO();
    		dto.setUserId(rs.getInt("user_Id"));
    		dto.setUserName(rs.getString("user_name"));
    		dto.setPassword(rs.getString("password"));
    		dto.setResult("MySQLと接続できます。");
    		helloStrutsDTOList.add(dto);
    	}
    }catch (SQLException e){
    	e.printStackTrace();
    }
    try{
    	con.close();
    }catch (SQLException e){
    	e.printStackTrace();
    }
    return helloStrutsDTOList;
    }

}
