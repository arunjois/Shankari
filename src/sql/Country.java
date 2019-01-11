package sql;

import javafx.beans.Observable;

import java.sql.*;
import java.util.StringJoiner;
import java.util.List;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class  Country {
    public static ObservableList placeList = FXCollections.observableArrayList();
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        //Demo d = new Demo();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:/home/arun/test.db");
            //Demo d = new Demo();
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }


    }
    public static ArrayList getCountryList()
    {
        ResultSet set;
        Connection c = null;
        Statement stmt = null;
        ArrayList<String> ar =  new ArrayList<String>();
        //String[] ret = new String[ar.length];
        StringJoiner sj = new StringJoiner(",");
        int i=0;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:/home/arun/test.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(
                    //"SELECT name FROM geonames where country_code = \""+ query + "\" " );
                    "SELECT DISTINCT name from countries");

            while(rs.next()) {
                //ret[i] = rs.getString("name");
                ar.add(rs.getString("name"));
                //System.out.println(rs.getString("name"));
                i++;

            }


        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return ar;

    }
    /*public static ObservableList getList(String something)
    {

    }*/
    public static ObservableList getPlace(String Country)
    {
        ResultSet set;
        Connection c = null;
        Statement stmt = null;
        ObservableList<String> ar = FXCollections.observableArrayList();
        String tmp="Hassan";
        /*
         * Get the ISO text to query geonames
         */
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:/home/arun/test.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT iso FROM countries where name=\""+Country+"\"");
            tmp=rs.getString("iso");
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }


        int i=0;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:/home/arun/test.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM geonames where country_code=\""+tmp+"\"");

            while(rs.next()) {
                ar.add(rs.getString("name"));
                i++;

            }

        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return ar;

    }
}