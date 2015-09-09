/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarypredictor.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import salarypredictor.helpers.Race;

/**
 *
 * @author kuba
 */
public class DataReader {

    private static final Logger log = Logger.getLogger(DataReader.class.getName());
    private static Statement stmt = null;
    private static Connection conn = null;
    private static String tableName = "mytable";
    public void run() {

        String dataTable[][] = new String[30163][16];
        
        
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/datasetTable");

           
        } catch (SQLException ex) {
            log.info(ex.getLocalizedMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataReader.class.getName()).log(Level.SEVERE, null, ex);
        }

        selectItems("Race","White");
    }
    
    private static void selectItems(String restrictedColumnName, String restrictedValue)
    {
        try
        {
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select * from " + tableName+ " WHERE "+restrictedColumnName+"='"+restrictedValue+"'");
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

            System.out.println("\n-------------------------------------------------");
            parseResultToSingleRow(results);
            
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static SingleRow parseResultToSingleRow(ResultSet results){
        try {
            while(results.next())
            {
                SingleRow sr = new SingleRow();
                sr.setId(results.getInt("id"));
                sr.setAge(results.getInt("age"));
                sr.setCapitalgain(results.getInt("capitalgain"));
                sr.setCapitalloss(results.getInt("capitalloss"));
                sr.setEducationnum(results.getInt("education"));
                sr.setFnlwgt(results.getInt("fnlwgt"));
                sr.setHuorsperweek(results.getInt("hoursperweek"));
                sr.setMaritalStatus(results.getString("maritalstatus"));
                sr.setNativeCountry(results.getString("nativecountry"));
                sr.setOccupation(results.getString("occupation"));
                sr.setRace(Race.WHITE);
                
                String restName = results.getString(2);
                String cityName = results.getString(3);
                //System.out.println(id + "\t\t" + restName + "\t\t" + cityName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
