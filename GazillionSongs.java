import java.util.*;
import java.io.*;

//Enter INPUT file as MySongs or you will never exit the loop! (For Testing)

public class GazillionSongs {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Song> songs = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String choice = "";
		Scanner file = new Scanner(new File("src/GazillionSongs.txt"));
		System.out.println("Welcome to the program!\nEnter the name of your playlist:");
		String filename = input.nextLine(); // Placeholder that hides the actual name
		while (!filename.equals("MySongs")) { // TEST LOOP REMOVE LATER
			System.out.println("File does not exist! Try again!");
			filename = input.nextLine();
		}
		System.out.println("File found! Loading " + filename + ".txt...\n");
		while (file.hasNextLine()) { // Adds songs to temp array
			String s = file.nextLine();
			songs.add(Song.parse(s));
		}
		Song.toCollection();
		System.out.println(filename + ".txt loaded!"); // Psst! Non-existent file
		System.out.println(songs.size() + " songs loaded!\n");
		System.out.println("Creating File...Enter the name of the file you will output to:");
		String outputfilename = input.nextLine();
		System.out.println(outputfilename + ".txt created!");

		while (!choice.contains("-quit")) {
			PrintStream output = new PrintStream("src/Output.txt");
			output.println("Year\tRank\t\tArtist\t\t\t\t\t\t\t\t\tTitle");
			output.println("====\t====\t==============\t\t\t\t=====================================");
			for (int i = 0; i < SongCollection.getSongCollection().size(); i++) {
				output.println(SongCollection.getSongCollection().get(i).toString());
			}
			System.out.println("\nWhat would you like to do with your playlist?");
			System.out.println("-print (Prints the playlist to console)");
			System.out.println("-filteryear [YEAR1/YEAR2] or [YEAR] (Filters songs between one or more years)");
			System.out.println("-filterrank [RANK#/RANK#] or [RANK#] (Filters songs with this rank(s))");
			System.out.println("-filterartist [ARTIST NAME] (Filters songs by this artist)");
			System.out.println("-filtertitle [SONG NAME] (Filters songs that have this keyword in it)");
			System.out.println("-sortby [year] or [rank] or [artist] or [title] (sorts by \"year\", \"rank\", \"artist\", or \"song\" in acsending order)");
			System.out.println("-restart (Sets playlist back to default)");
			System.out.println("-quit (Quits the program)\n");
			choice = input.nextLine();
			Scanner split = new Scanner(choice).useDelimiter("\\s-");
			boolean invalid = false; // checks for invalid commands
			while (split.hasNext() && !invalid) {
				String word = split.next();
				word = word.toLowerCase();
				if (word.contains("print")) {
					System.out.println("\nYear\tRank\t\t\tArtist\t\t\t\t\t\t\t\tTitle");
					System.out.println("====\t====\t\t======================\t\t\t\t=====================================================");
					SongCollection.printSongCollection();
				} else if (word.contains("filteryear")) {
					Range range = Range.parse(word.substring((word.indexOf("filteryear") + 11), word.length()));
					SongCollection.filterYear(range);
				} else if (word.contains("filterrank")) {
					Range range = Range.parse(word.substring((word.indexOf("filterrank") + 11), word.length()));
					SongCollection.filterRank(range);
				} else if (word.contains("filterartist")) {
					SongCollection.filterArtist(word.substring((word.indexOf("filterartist") + 13), word.length()));
				} else if (word.contains("filtertitle")) {
					SongCollection.filterTitle(word.substring((word.indexOf("filtertitle") + 12), word.length()));
				} else if (word.contains("sortby year")) {
					System.out.println("Sorting by year...");
					SongCollection.sortYear();
				} else if (word.contains("sortby rank")) {
					System.out.println("Sorting by rank...");
					SongCollection.sortRank();
				} else if (word.contains("sortby artist")) {
					System.out.println("Sorting by artist...");
					SongCollection.sortArtist();
				} else if (word.contains("sortby title")) {
					System.out.println("Sorting by title...");
					SongCollection.sortTitle();
				} else if (word.contains("restart")) {
					SongCollection.restart(songs);
					System.out.println("Restored playlist!");
				} else if (word.contains("quit")) {
					break;
				} else {
					invalid = true;
					System.out.println("Invalid Input! Try again");
				}
			}
		}
		System.out.println("Program terminated.");
	}
}
