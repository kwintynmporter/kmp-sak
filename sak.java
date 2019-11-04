/*******************************************************************************
 * Copyright (C) 2019 Eric Pogue. All rights reserved. 
 * 
 * This file is part of the SwissArmyKnifeLite (sakl) project.
 * 
 * This file can not be copied and/or distributed without 
 * the express permission of Eric Pogue
 * 
 * This application uses the open source component HttpRequest.java
 ******************************************************************************/
/* Kwintyn Porter 
    Swiss Army Knife
    HTTP Requesting and JSON Data Reading/Handling
    Last Mod: 11/3/2019
*/ 

public class sak {
    public static void main(String[] args) {
        System.out.println("");
        if (args.length < 1) {
            System.out.println("Nothing received. Type \" -Help \" more information.");         
        } 
        else if (args[0].equalsIgnoreCase("-Help")) {
            System.out.println("V-- HELP: STARTING SUCCESSFULLY --V");
            Help.printHelp();          
        } 

        // Building the -HttpRequest command with console timing
        else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            System.out.println("V-- HTTPREQUEST: STARTING SUCCESSFULLY --V");
            if (args.length <2) {
                System.out.println("Man, check those parameters and try again bro.");
            } else {
                String URL = args[1]; 
                HttpRequest request = new HttpRequest();
                long startTime = System.nanoTime();
                if (request.readURL(URL)) {
                    System.out.println(request);
                    System.out.println("---------------------------------------------------------------");
                    long elapsedTime = System.nanoTime() - startTime; 
                    System.out.println("\nTime required to complete this Request Command: " + elapsedTime/10000000 + " milliseconds.");
                }           
            }
        }   

        //Building the -HTTTPRequestIndex command with console timing
        else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
             System.out.println("V--- HTTPREQUEST INDEX: STARTING SUCCESSFULLY ---V");   
             System.out.println("\nHere are your URLs."); 
             System.out.println("\nSelect and copy the line to get individual JSON data");  
            if (args.length != 2) {
                System.out.println("Please check your parameters and try again, man.");
            } else {
                String indexURL = args[1];
                HttpRequestURLs request = new HttpRequestURLs();
                long startTime = System.nanoTime();
                if (request.readURL(indexURL)) {
                    System.out.println(request);
                    System.out.println("---------------------------------------------------------------");
                    long elapsedTime = System.nanoTime() - startTime; 
                    System.out.println("\nTime required to complete this Index Command: " + elapsedTime/10000000 + " milliseconds.");
                }  
            }
        }       

        System.out.println("");
    }
} 

        // I implemeneted both an -HTTPRequestURLs class and an HTTPRequestIndex, 
        // because I was confused on what to implement where and what
        // we'll be using in thunderbird since this program is the
        // starting basis for it. Both function exactly the same.

        // else if (args[0].equalsIgnoreCase("-HTTPRequestURLs")) {
        //         System.out.print("v-- HTTPRequestURLs starting below.");
        //     if (args.length <2) {
        //         System.out.println("Valid parameters needed."); 
        //     }
        //     else {
        //         String URL = args[1];
        //         HttpRequestURLs urlRequest = new HttpRequestURLs();  
        //         System.out.println(); 
        //         System.out.println("\nv-- URLs found in Index: ");
        //         System.out.println("-----------------------------------------------"); 
        //         if (urlRequest.readURL(URL)) {
        //             System.out.println(urlRequest);  
        //         } 
        //     }
        // }