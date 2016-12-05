package com.devendra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ImageDownload {
    public static void main(String[] args){
         String path="c:/users/dell/desktop/";
         Scanner sc=new Scanner(System.in);
         try{
             System.out.println("Enter URL");
             String url1=sc.next();
             URL url=new URL(url1);
             URLConnection conn=url.openConnection();
             InputStream is=conn.getInputStream();
             System.out.println("Enter the filename with extension");
             String filename=sc.next();
             OutputStream os=new FileOutputStream(path+filename);
             byte[] data=new byte[1024*5];
             int i=0;
             while((i=is.read(data))!=-1){
                 os.write(data, 0, i);
             }
             is.close();
             os.close();
         }catch(IOException ioe){
             System.out.println(ioe.getMessage());
         }
    }    
    
}
