package com.jill;

public class PlayList {

    //maintain an array of song objects
    private Song[] songs; // create array of song objects
    int index;

    //instantiate playlist object with options to add and display song details
    public PlayList(int sizeOfSongList){
        this.songs = new Song[sizeOfSongList]; //instantiation
        this.index = 0;
    }

    //crud - create, read, update, delete

    //read
    //display the songs
    public Song[] getSongs(){
        return this.songs;
    }

    //update
    //add song to array
    public void addSong(Song s) throws SongTitleNotUniqueException{
        if (index > this.songs.length){
            throw new IndexOutOfBoundsException("Attempt to overflow");
        }
        else if(isSongTitleUnique(s)){
            throw new SongTitleNotUniqueException();
        }
        else{
            this.songs[this.index] = s;
            this.index++;
        }
    }

    public boolean isSongTitleUnique(Song s){
        return false;
    }

    //delete song
    public void removeSong(Song s){

    }

    //read song
    public Song getSongs(Song s){
        return null;
    }

    public void sort() {
        InsertionSort.sort(this.songs);

    }





}
