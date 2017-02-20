package com.theironyard.novauc;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Facebook {

    //Menu page for of facebook very simple menu
    public void mainPage() throws IOException {
        System.out.println("##############################################################");
        System.out.println("################                               ###############");
        System.out.println("########                   WELCOME                    ########");
        System.out.println("######                                                  ######");
        System.out.println("########                  TO FACEBOOK                 ########");
        System.out.println("################                              ################");
        System.out.println("##############################################################");
        System.out.println("The only option available is the [ Friends ] menu.");
        String onlyOption = Main.kb.nextLine();
        if (onlyOption.equalsIgnoreCase("friends")) {
            listChoice();
        } else {
            System.out.println("you are a special kind of facebook user and all your " +
                    "friends have now been deleted.");
            System.exit(0);
        }
    }

    //Lets the user decide how they want to list out their friends
    public void listChoice() throws IOException {
        System.out.println("##############################################################");
        System.out.println("################                               ###############");
        System.out.println("########                 FRIENDS MENU                 ########");
        System.out.println("######                                                  ######");
        System.out.println("########   DECIDE HOW YOU WANT TO LIST YOUR FRIENDS   ########");
        System.out.println("################                              ################");
        System.out.println("################                              ################");
        System.out.println("###     [First Name]      [Last Name]       [Country]      ###");
        String listChoice = Main.kb.nextLine().toLowerCase();
        switch (listChoice) {
            case "first name":
                readPeopleRevisedFirst();
                //readPeople("first");
                break;
            case "last name":
                readPeopleRevisedLast();
                break;
            case "country":
                readPeopleRevisedCountry();
                break;
            default://this will list them out by ID number as a testing measure
                //readPeople("id");

                break;
        }
    }


//    //public void readPeopleRevised(){
//        for (String key : Main.friendsHashFirst.keySet()) {
//            System.out.println("IDNumber  " + key + "  values  " + Main.friendsHashFirst.get(key).getCountry());
//        }
//    }


    public void readPeopleRevisedFirst() {
        for (String key : Main.friendsHashFirst.keySet()) {
            System.out.println("Full Name:  " + key +" "+ Main.friendsHashFirst.get(key).getLastName()+" from:  " + Main.friendsHashFirst.get(key).getCountry());
        }

    }
    public void readPeopleRevisedLast() {
        for (String key : Main.friendsHashLast.keySet()) {
            System.out.println("Full Name : Last Name first:  " + key +" , "+ Main.friendsHashLast.get(key).getLastName()+" from:  " + Main.friendsHashLast.get(key).getCountry());
        }

    }
    public void readPeopleRevisedCountry() {
        for (String key : Main.friendsHashCountry.keySet()) {
            System.out.println("Friends from:  " + key +" full name: "+ Main.friendsHashCountry.get(key).getFirstName()+" " + Main.friendsHashCountry.get(key).getLastName());
        }

    }
    public static <T> void testT(T hello){


    }


    //
    public void readPeople(String whichSort) throws IOException {
        File file = new File("people.csv");
        Scanner fileScanner = new Scanner(file);

        String line = fileScanner.nextLine();
        String[] columns = line.split(",");
        while (fileScanner.hasNext()) {
//            String line = fileScanner.nextLine();
//            String[] columns = line.split(",");
//            if (columns[5].equalsIgnoreCase("")){
//
//            }
//          //
            //Friends inputFriends =new Friends(Integer.valueOf(columns[0]),columns[1],columns[2],columns[3],columns[4],columns[5]);


            //Main.friendsList.add(inputFriends);
            //System.out.println(line);
//            for (Friends loopFriends : Main.friendsList) {
//
//                Main.friendsHash.put(loopFriends.getCountry(), loopFriends);
//            }
            //Main.friendsHash.put(columns[5],Main.friendsList.get(i));
            if (whichSort.equalsIgnoreCase("first")) {
//                for (Friends loopFriends : Main.friendsList) {
//                    Main.friendsHashFirst.put(loopFriends.getFirstName(), loopFriends);
//                }
                for (String key : Main.friendsHashFirst.keySet()) {
                    System.out.println("key" + key + "values" + Main.friendsHashFirst.get(key).getCountry());
                }
            } else if (whichSort.equalsIgnoreCase("last")) {
//                for (Friends loopFriends : Main.friendsList) {
//                    Main.friendsHashLast.put(loopFriends.getLastName(), loopFriends);
//                }
                for (String key : Main.friendsHashLast.keySet()) {
                    System.out.println("key" + key + "values" + Main.friendsHashLast.get(key).getCountry());
                }
            } else if (whichSort.equalsIgnoreCase("country")) {
//                for (Friends loopFriends : Main.friendsList) {
//                    Main.friendsHashCountry.put(loopFriends.getCountry(), loopFriends);
//
//                }
                for (String key : Main.friendsHashCountry.keySet()) {
                    System.out.println("key" + key + "values" + Main.friendsHashCountry.get(key).getCountry());
                }
            } else {
//                for (Friends loopFriends : Main.friendsList) {
//                    Main.friendsHashID.put(loopFriends.getIdNumber(), loopFriends);
//                }
                for (int key : Main.friendsHashID.keySet()) {
                    System.out.println("key" + key + "values" + Main.friendsHashID.get(key).getFirstName()+Main.friendsHashID.get(key).getCountry());
                }
            }
        }
//            else{
//                for (Friends loopFriends : Main.friendsList) {
//                    Main.friendsHash.put(loopFriends.getCountry(), loopFriends);
//                }
//            }
//
//
//            for (Friends loopFriends : Main.friendsList) {
//                Main.friendsHash.put(loopFriends.getCountry(), loopFriends);
//            }
    }

    public void loadList() throws IOException {
        File file = new File("people.csv");
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Friends adder = new Friends(Integer.parseInt(columns[0]),columns[1],columns[2],columns[3],columns[4],columns[5]);
            Main.friendsList.add(adder);
        }
    }

    public void loadArrays(){
        for (Friends loopFriends : Main.friendsList) {
            Main.friendsHashFirst.put(loopFriends.getFirstName(), loopFriends);
        }
        for (Friends loopFriends : Main.friendsList) {
            Main.friendsHashLast.put(loopFriends.getLastName(), loopFriends);
        }
        for (Friends loopFriends : Main.friendsList) {
            Main.friendsHashCountry.put(loopFriends.getCountry(), loopFriends);
        }
        for (Friends loopFriends : Main.friendsList) {
            Main.friendsHashID.put(loopFriends.getIdNumber(), loopFriends);
        }
    }

    public void readFirst(){
        for (Friends loopFriends : Main.friendsList) {
            Main.friendsHashFirst.put(loopFriends.getFirstName(), loopFriends);
        }

        for (String key : Main.friendsHashFirst.keySet()) {
            System.out.println("key" + key + "values" + Main.friendsHashFirst.get(key).getCountry());
// for (Map.Entry<String, Object> entry : map.entrySet()) {
//                        String key = entry.getKey();
//                        Object value = entry.getValue();
//                        // ...
        }
    }
//
//
//
//        //
//        Scanner consoleScanner = new Scanner(System.in);
//
//        int replyID=-1;
//        while(true){
//            //loop over posts and print posts with the right replyID
//            int id=0;
//
//            for(Post loopPost: posts){
//                if(loopPost.replyID==replyID) {
//                    System.out.printf("(%d) %s by %s\n", id, loopPost.text, loopPost.authorName);
//                }
//                id++;
//            }
//            //ask the user to type a replyID
//            System.out.println("Type the id you want to see the replies to:");
//            replyID=Integer.valueOf(consoleScanner.nextLine());

}

