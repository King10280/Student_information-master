package com.artisan.dao;

import java.sql.Connection;

import com.artisan.util.DbUtil;

public class BaseDao {
	public Connection con =new DbUtil().getCon();
	

}
