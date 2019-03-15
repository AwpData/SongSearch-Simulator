import java.util.*;
import java.io.*;

// Can parse each song
// Can sort
// Can get range of years (needs ranks)
public class GazillionSongs {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Song> songs = new ArrayList<>();
		PrintStream output = new PrintStream("src/Output.txt");
		// File testifexists = new File("src/GazillionSongs.txt");
		Scanner input = new Scanner(System.in);
		String choice = "";
		Scanner file = new Scanner(new File("src/GazillionSongs.txt"));
		System.out.println("Welcome to the program!\nEnter the name of your sick playlist:");
		String filename = input.nextLine(); // Placeholder that hides the actual name

		System.out.println("Loading " + filename + ".txt...\n");
		while (file.hasNextLine()) { // Adds songs to temp array
			String s = file.nextLine();
			songs.add(Song.parse(s));
		}
		Song.toCollection();
		System.out.println(filename + ".txt loaded!"); // Psst! Non-existent file
		while (!choice.contains("-quit")) {
			System.out.println();
			System.out.println("What would you like to do with your playlist?");
			System.out.println("-print (Prints the playlist to console)");
			System.out.println("-tofile (Prints the playlist to file)");
			System.out.println("-filteryear [YEAR1-YEAR2] or [YEAR] (Filters songs between one or more years)");
			System.out.println("-filterrank [RANK#-RANK#] or [RANK#] (Filters songs with this rank(s))");
			System.out.println("-filterartist [ARTIST NAME] (Filters songs by this artist)");
			System.out.println("-filtertitle [SONG NAME] (Filters songs that have this keyword in it)");
			System.out.println("-sortByA [year] or [rank] or [artist] or [title] (sorts by \"year\", \"rank\", \"artist\", or \"song\" in acsending order)");
			System.out.println("-restart (Sets playlist back to default)");
			System.out.println("-quit (Quits the program)");
			System.out.println();
			choice = input.nextLine();
			if (choice.equals("-print")) {
				SongCollection.printSongCollection();
			} else if (choice.equals("-tofile")) {
				output.flush();
				for (int i = 0; i < songs.size(); i++) {
					output.print(SongCollection.getSongCollection().get(i).toString());
				}
			}
			else if (choice.contains("-filteryear")) {
				Range range = Range.parse(choice.substring(12));
				SongCollection.filterYear(range);
			} else if (choice.contains("-filterrank")) {
				Range range = Range.parse(choice.substring(12));
				SongCollection.filterRank(range);
			} else if (choice.contains("-filterartist")) {
				SongCollection.filterArtist(choice.substring(14));
			} else if (choice.contains("-filtertitle")) {
				SongCollection.filterTitle(choice.substring(13));
			}
		}
	}
}
