import java.util.*;

public class Song {
	private int year;
	private int rank;
	private String artist;
	private String songname;
	public static ArrayList<Song> songs = new ArrayList<>();

	public static Song parse(String s) { // Parse a string of the form “Year\tRank\tArtist\tTitle” and create a Song object with the given values.
		Scanner parse = new Scanner(s).useDelimiter("\t");
		Song song = new Song();
		song.year = parse.nextInt();
		song.rank = parse.nextInt();
		song.artist = parse.next();
		song.songname = parse.next();
		songs.add(song);
		return song;
	}

	public static void toCollection() { // Converts song to Song Collection for Modifications
		new SongCollection(songs);
	}

	public int getYear() { // Return the year of this song.
		return year;
	}

	public int getRank() { // Return the rank of this song.
		return rank;
	}

	public String getArtist() { // Return the artist of this song.
		return artist;
	}

	public String getTitle() { // Return the title of this song.
		return songname;
	}

	public String toString() { // Return a string representation of this song.
		return (getYear() + "\t" + getRank() + "\t" + getArtist() + "\t\t\t\t\t\t" + getTitle());
	}
}
