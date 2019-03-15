import java.util.*;

public class Song {
	private int year;
	private int rank;
	private String artist;
	private String songname;
	public static ArrayList<Song> songs = new ArrayList<>();

	public static Song parse(String s) { // "constructor"
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

	public int getYear() {
		return year;
	}

	public int getRank() {
		return rank;
	}

	public String getArtist() {
		return artist;
	}

	public String getTitle() {
		return songname;
	}

	public String toString() {
		return (getYear() + "\t" + getRank() + "\t" + getArtist() + "\t\t" + getTitle());
	}
}
