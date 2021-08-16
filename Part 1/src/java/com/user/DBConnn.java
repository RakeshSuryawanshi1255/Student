package com.user;

import armdb.ConnectHost;
import armdb.QueryResult;
import armdb.SQLQuery;
import armdb.SQLQueryException;
import armdb.SQLUpdate;
import armdb.SQLUpdateException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class DBConnn 
{
    String fileURL = "http://localhost:8012/xampp/rakesh/handleSQL.php";  //offline
    ConnectHost con;
    SQLUpdate update;
    QueryResult qr;
    SQLQuery query;

    String urlString;
    URL url;
    BufferedReader reader;

    void nonQuery(String query) throws SQLUpdateException 
    {
               
        con = new ConnectHost(fileURL, "localhost", "root", "", "collegedatabase");
        update = new SQLUpdate(con);
        try {
            update.statement(query);
        } catch (SQLUpdateException e) {
            System.out.println(e.getMessage());
        }
    }

    void selectQuery(String selquery) {
        
       
        con = new ConnectHost(fileURL, "localhost", "root", "", "collegedatabase");
        query = new SQLQuery(con);
        try {
            qr = query.statement(selquery);		//execution of query statement
        } catch (SQLQueryException e) {						//catch exception if occurred
            System.out.println(e.getMessage());					//print exception message 
        }

    }

    
    
}
