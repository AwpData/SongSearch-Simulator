import java.util.*;

public class Song {
	private String year;
	private String rank;
	private String artist;
	private String songname;
	public static ArrayList<Song> songs = new ArrayList<>();

	public static Song parse(String s) { // "constructor"
		Scanner parse = new Scanner(s).useDelimiter("\t");
		Song song = new Song();
		song.year = parse.next();
		song.rank = parse.next();
		song.artist = parse.next();
		song.songname = parse.next();
		songs.add(song);
		return song;
	}

	public String getYear() {
		return year;
	}

	public String getRank() {
		return rank;
	}

	public String getArtist() {
		return artist;
	}

	public String getSongName() {
		return songname;
	}

	public String toString() {
		return (getYear() + "\t" + getRank() + "\t" + getArtist() + "\t" + getSongName());
	}
}
