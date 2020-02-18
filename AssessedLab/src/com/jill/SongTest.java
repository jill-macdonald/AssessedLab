package com.jill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @Test
    void testSort() throws SongTitleNotUniqueException{
        //set the environment
        Song fastForward = new Song ("Fast Forward", "You Me At Six", 2018);
        Song likeAGhost = new Song ("Like A Ghost", "Deaf Havana", 2017);
        Song leftBehind = new Song ("Left Behind", "Bonfires", 2015);

        PlayList testItem = new PlayList(3); // new test array with 3 items
        //add the songs
        testItem.addSong(fastForward);
        testItem.addSong(likeAGhost);
        testItem.addSong(leftBehind);

        //set up the input and stimulate the test item
        testItem.sort();

        //compare outputs
        Song[] aux = testItem.getSongs();
        assertEquals(leftBehind, aux[0]); //should be at 0
        assertEquals(likeAGhost, aux[1]); //should be at 1
        assertEquals(fastForward, aux[2]); // should be at 2

    }


}