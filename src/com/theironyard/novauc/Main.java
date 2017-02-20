package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;



public class Main {

    public static Scanner kb =new Scanner(System.in);
    public static HashMap<String, Friends> friendsHashFirst = new HashMap<String, Friends>();
    public static HashMap<String, Friends> friendsHashLast = new HashMap<String, Friends>();
    public static HashMap<String, Friends> friendsHashCountry = new HashMap<String, Friends>();
    public static HashMap<Integer, Friends> friendsHashID = new HashMap<Integer, Friends>();
    public static ArrayList<Friends>  friendsList = new ArrayList<Friends>();
    public static Facebook menus = new Facebook();
    public static Friends friendsClass = new Friends();
    public static JsonSerializer serializer=new JsonSerializer();
    public static JsonParser parser = new JsonParser();


//    public static Iterator<Friends> iteratorFriends = friendsHashFirst.iterator;



    public static void main(String[] args) throws IOException{

        menus.loadList();
        menus.loadArrays();

//        File file = new File("people.txt");
//        Scanner fileScanner = new Scanner(file);
//        while(fileScanner.hasNext()) {
//            String line = fileScanner.nextLine();
//            String[] columns = line.split(",");
//            Friends adder = new Friends(Integer.parseInt(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
//            DataRepository<> dataRepo = new DataRepository<>(adder);
//        }
        menus.mainPage();

        genericType(3567689);
        genericType(435453);
        genericType("type anything");
    }
    public static <T> void genericType(T x){
        System.out.println(x);
    }
    public void fileWriteID()throws IOException {
        File file = new File("friendsHashID.json");
        FileWriter fwriter = new FileWriter(file);
        String jsonFormatedItem = Main.serializer.serialize(Main.friendsHashID);
        fwriter.append(jsonFormatedItem);
        fwriter.close();
        System.out.println("Would you like to return to the main menu??");
        System.out.println("YES or YES or 1 ?");
        String worthlessInput1 = Main.kb.nextLine();

    }
}
