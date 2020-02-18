package com.jill;

public class PlayListTest {

    public static void main(String[] args) {
        // write your code here

        //make a playlist
        PlayList mySongList = new PlayList(3);

        //create a user menu
        int userInput = -1;
        do{
            showMenu();
            userInput = askTheUserForInput();
            evaluateUserInput(userInput, mySongList);
        }
        while(userInput != 0);
    }

    //menu options
    private static void evaluateUserInput(int userInput, PlayList mySongList){
        switch (userInput){
            case 1:
                addSongToList(mySongList);
                break;
            case 2:
                displaySongs(mySongList);
                break;
            case 3:
                sort(mySongList);
                break;
            case 0:
                break;
            default:
                System.out.println("Please choose a correct option");
                break;
        }
    }

    //sort
    private static void sort(PlayList mySongList){
        mySongList.sort();
    }

    //display songs
    private static void displaySongs(PlayList mySongList){
        Song[] list = mySongList.getSongs();

        System.out.println("List of songs");
        for (int i = 0; i < list.length; i ++){
            Song aux = list[i];
            if(aux != null){
                System.out.println(aux.toString());
            }
        }
    }

    //add songs
    private static void addSongToList(PlayList mySongList){
        try{
            String songName = Input.getString("Enter song name: ");
            String artist = Input.getString("Enter artist: ");
            int year = Input.getInteger("Enter year: ");

            Song toBeAdded = new Song (songName, artist, year);
            mySongList.addSong(toBeAdded);
        }
        catch (IndexOutOfBoundsException ioe){
            System.out.println("Song list is full");
        }
        catch (SongTitleNotUniqueException sne){
            System.out.println("Song already in the system");
        }
    }

    private static int askTheUserForInput(){
        return Input.getInteger("Choose an option: ");
    }

    private static void showMenu(){
        System.out.println("Welcome to the playlist");
        System.out.println("These are the options");
        System.out.println("1: add a song");
        System.out.println("2: display songs");
        System.out.println("3: sort songs");
        System.out.println("0: exit");
    }

}
