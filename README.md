# AssessedLab
Data Structures assessed lab - a playlist

You are required to write a program that maintains a Playlist of favourite songs. 
The Playlist should hold for each song, the song title, artist and year. 
 
You will need Input.java, ArrayUtility.java and InsertionSort.java from the Library folder on Moodle.  
 
You are required to implement a Song class, and a PlayList class with appropriate attributes and methods. 
The main method should be in a class called PlayListTest. 
 
You should develop the program one step at a time and keep a copy of working versions. 
For steps 1 and 2, you can assume that there is space available in the array to add a song object and that song titles will be unique. 

Step 1 (functionality is worth 7 marks)
 create a Song class with suitable attributes to represent the song title, artist and year 
 create a PlayList class that will maintain an array of Song objects 
 create a main method in PlayListTest that instantiates a PlayList object and offers options to add a song object and to display the details of the songs 
 keep a copy of this version of the programme. 

Step 2 (additional functionality is worth 10 marks) 
 update the program to allow the song details to be sorted by year (in descending order) 
  and if there is more than one song for a year, then to sort by song title (in ascending order). 
  Song titles should not be case sensitive.
 keep a copy of this version of the programme 

Step 3 (additional functionality is worth 8 marks) 
 create two Junit classes. 
  One to test the sorting of songs from Step 2 above and the other to test the exception handling below. 
 update the program to use exception handing to trap attempts to overfill the array and to ensure that song titles are unique 
 format the information to make the output more presentable 
 e.g. Input Enter song title: Galway Girl Enter artist: Ed Sheeran Enter year: 2017 
             Enter song title: Bruises Enter artist: Lewis Capaldi Enter year: 2019 
             Enter song title: Homesick Enter artist: Dua Lipa Enter year: 2017 
             Enter song title: Someone you loved Enter artist: Lewis Capaldi Enter year: 2018 
             Enter song title: Take me back to London Enter artist: Ed Sheeran Enter year: 2019 
 
after sorting, the display should look like: 
YEAR   SONG TITLE    ARTIST 
2019  Bruises    Lewis Capaldi 
2019  Take me back to London   Ed Sheeran 
2018  Someone you loved   Lewis Capaldi 
2017  Galway Girl    Ed Sheeran 
2017  Homesick    Dua Lipa 

 keep a copy of this version of the programme 
 
 
 step 1 
        display array empty message if appropriate 1      
        can add a song object 2      
        displays headings 1      
        displays all song info (title, artist, date) 1      
        only displays occupied slots 1      
        traps invalid menu options 1 
         / 7          
    
step 2 
        sort on year 2         
        in descending order 2         
        if match on year sort on title 2            
        in ascending order 2            
        not case sensitive 2 
         / 10  
                
step 3 
        exception handling           
        check space in array  1            
        suitable error message 1         
        check song title unique 1            
        not case sensitive 1            
        suitable error message 1     
        Junit classes 2      
        suitable formatting          
        Year, song title & artist left adjusted 1
         / 8          
style 
        code layout/indentation 1      
        meaningful names 1      
        appropriate use of public/private 1      
        use of this to identify object components 1      
        adherence to structured programming 1
         / 5 



