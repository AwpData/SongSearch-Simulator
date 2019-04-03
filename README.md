# Song Searching Simulator

-Sort a playlist by year, rank, artist, or title <br />
-Filter playlists by inputted year, rank, artist, and/or title <br /> 
-Outputs the contents to a file to save for future use <br />

# Installation Instructions

-On Eclipse (I prefer this one) make 4 classes for GazillionSongs.java, Song.java, SongCollection.java, and Range.java. <br />
-Make sure that you create 2 text files (.txt), one for the input (GazillionSongs.txt), and one for the output file (Output.txt). <br />
-Hit the run button! <br />

-You can modify the GazillionSongs.txt file to suit your needs but make sure it follows this format! <br />
```
<Year> \t <Rank> \t <Artist> \t <Title>
```

# Directions / Important Notes

-Inputs should be entered with a **hyphen** preceding the command (ex. -filteryear 1970). <br />
-All inputs have to be entered correctly as they are **CASE SENSITIVE** and considered invalid input (ex. -Filteryear 1970). <br />
-Title inputs are **CASE SENSITIVE** so entering "-filtertitle i" would only filter songs with a lowercase "i". <br />
-More than one command can be inputted at a time (ex. -filteryear 1970 -filtertitle Love -sortby artist). <br />
-You can filter by a range of years or ranks. Make sure you use a **"/"** to seperate the two (ex. -filterank 1/10 -filteryear 1970/1972). <br />

# User Commands
```
-print (Prints the playlist to console <br />
-filteryear [YEAR1/YEAR2] or [YEAR1] (Filters songs between one or more years) 
-filterrank [RANK#/RANK#] or [RANK#] (Filters songs with this rank(s))
-filterartist [ARTIST NAME] (Filters songs by this artist)
-filtertitle [SONG NAME] (Filters songs that have this keyword in it)
-sortby [year] or [rank] or [artist] or [title] (sorts by \"year\", \"rank\", \"artist\", or \"song\" in acsending order)
-restart (Sets playlist back to default)
-quit (Quits the program) 
```
