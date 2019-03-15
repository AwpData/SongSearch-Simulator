import java.util.*;
import java.io.*;

// Can parse each song
// Can sort
// Can get range of years (needs ranks)
public class GazillionSongs {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Song> songs = new ArrayList<>();
		PrintStream output = new PrintStream("Output.txt");
		// File testifexists = new File("src/GazillionSongs.txt");
		Scanner input = new Scanner(System.in);
		Scanner file = new Scanner(new File("src/GazillionSongs.txt"));
		System.out.println("Welcome to the program!\nEnter the name of your sick playlist:");
		String filename = input.nextLine(); // Placeholder that hides the actual name
		
		System.out.println("Loading " + filename + ".txt...\n"); 
		while (file.hasNextLine()) { //Adds songs to temp array
			String s = file.nextLine();
			songs.add(Song.parse(s));
		}
		System.out.println(filename + ".txt loaded!"); // Psst! Non-existent file
		System.out.println();
		System.out.println("What would you like to do with your playlist?");
		System.out.println("-print (Prints the playlist)");
		System.out.println("-year \"YEAR1-YEAR2\" (range of years separated with a hyphen) searches for songs between one or more years");
		System.out.println("-rank \"RANK#\" (searches for songs with this rank)");
		System.out.println("-artist \"ARTIST NAME\" (searches for songs by this artist)");
		System.out.println("-title \"SONG NAME\" (searches for songs that have this keyword in it)");
		System.out.println("-sortByA \"PARAMETER\" (sorts by \"year\", \"rank\", \"artist\", or \"song\" in acsending order)");
		System.out.println("-restart (Sets playlist back to normal)");
		System.out.println();
		for (int i = 0; i < songs.size(); i++) { //Outputs to file 
			output.print(songs.get(i).toString());
		}
	
		//Range range = Range.parse("2006");
		//Range range2 = Range.parse("3-1");
		
		//Song.toCollection();
		//SongCollection.getSongCollection();
	}
}
