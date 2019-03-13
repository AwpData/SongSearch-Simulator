import java.util.*;
import java.io.*;

public class GazillionSongs {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Song> songs = new ArrayList<>();
		File testifexists = new File("src/GazillionSongs.txt");
		Scanner output = new Scanner(new File("src/GazillionSongs.txt"));

		if (!testifexists.canRead() || !testifexists.exists()) {
			System.out.println("Cannot read file try again");
		}

		Scanner FullSong = new Scanner(output.nextLine()); // Used to sort rank 2008 2007
		String s = 
		songs.add(Song.parse(s));
		System.out.println(songs.get(0));
	}
}
