/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.framework.utils;

import java.io.*;
import java.util.*;



public class GeneralUtils {

	/**
	 * Gets the current working directory.
	 * @return current working directory
	 */
	public static String getCurrentDirectory()
	{
		String dirStr = null;
		try
		{
	        File curDir = new File(".");
	        dirStr = curDir.getCanonicalPath();
		}
		catch (IOException e)
		{
			System.out.println("Error trying to get current directory.");
		}
		return dirStr;
	}
		
	public static Properties readConfig(){
        Properties props=new Properties();
        //File directory = new File("testcases");
        //String fileName=directory.getAbsolutePath()+"\\Config.Properties";
        String fileName = "Config.Properties";
        
        try {
            props.load(new FileInputStream(fileName));
        } catch (IOException ioe) {
            System.err.println("I/O Exception on loading "+fileName+" file:\n"+ioe.getMessage());
            System.exit(1);
        }
        return props;
    }
	
	public static String readConfig(String ConfigParameter){
        Properties props=new Properties();
        //File directory = new File("testcases");
        //String fileName=directory.getAbsolutePath()+"\\Config.Properties";
        String fileName = "Config.Properties";        
        String value=null;
        try {
            props.load(new FileInputStream(fileName));
            value=props.getProperty(ConfigParameter, String.valueOf(ConfigParameter));
        } catch (IOException ioe) {
            System.err.println("I/O Exception on loading "+fileName+" file:\n"+ioe.getMessage());
            System.exit(1);
        }
        return value;
    }
	
    public static void Sleep(int timeout_millisecond)
	{
		try {
			Thread.sleep(timeout_millisecond);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
    
    public static void KillProcess(String exe)
    {
    	try {
    	    Runtime.getRuntime().exec("taskkill /F /IM "+ exe);
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    }

}
	
