package com.boss.framework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.boss.framework.BaseDrivers;

public class Database extends BaseDrivers {
	static Connection connect = null;
	static Statement statement = null;
	
	public static void getConnection(String databaseName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(
					"jdbc:mysql://"+ DB_IP + ":" + DB_Port + "/" + databaseName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", DB_Username, DB_Password);
        	statement = connect.createStatement();
		} catch (Exception e) {
			System.out.println("Coult not Initiate Connection to the Database. Please refer to the trace below:");
			e.printStackTrace();
		}
	}

	
	public static void executeQuery(String Query) throws SQLException {
		//Select Query Ex: Then Execute SQL Select query as "Select * from country where country_code in ('CA','US')"
       ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(Query);
            //Process resultSet if it is a select query
    		while (resultSet.next()) {
    			System.out.println(resultSet.getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3)
    					+ "  " + resultSet.getString(4) + "  " + resultSet.getString(5));
    		}
    		if (resultSet != null) {
    			try {
    				resultSet.close();
    			} catch (Exception e) {
    			}
    		}
    		if (statement != null) {
    			try {
    				statement.close();
    			} catch (Exception e) {
    			}
    		}
    		if (connect != null) {
    			try {
    				connect.close();
    			} catch (Exception e) {
    			}
    		}
        } catch (SQLException e) {
        	System.out.println("Error while executing query. Plz check connection & query:");
        	e.printStackTrace();
        }
        finally {
      		if (connect != null) {
    			try {
    				connect.close();
    			} catch (Exception e) {
    			}
    		}
        }
	}
	
   public static boolean executeUpdate(String Query) {
	 //Insert, Update or Delete Query
        try {
        	statement.executeUpdate(Query);
        	connect.commit();
        } catch (SQLException e) {
            return false;
        }finally {
      		if (connect != null) {
    			try {
    				connect.close();
    			} catch (Exception e) {
    			}
    		}
        }
        return true;
    }
	   
	
}
