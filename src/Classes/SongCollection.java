import java.util.*;

public class SongCollection {
	private static ArrayList<Song> songcollection = new ArrayList<>();

	public SongCollection(ArrayList<Song> Songs) { // Create a SongCollection containing the songs in the given ArrayList.
		for (int i = 0; i < Songs.size(); i++) {
			songcollection.add(Songs.get(i));
		}
	}

	public static void printSongCollection() { // Prints the SongCollection
		if (songcollection.size() == 0) {
			System.out.println("No matches found!");
		} else {
			for (int i = 0; i < songcollection.size(); i++) {
				System.out.println(songcollection.get(i).toString());
			}
		}
	}

	public static ArrayList<Song> getSongCollection() { // For output usage
		return songcollection;
	}

	public static void restart(ArrayList<Song> song) { // Restores playlist to default
		songcollection = song;
	}

	public static void filterYear(Range r) { // Remove all songs from this collection whose year does not match the given range.
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getYear() >= r.getMin() && songcollection.get(i).getYear() <= r.getMax()) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void filterRank(Range r) { // Remove all songs from this collection whose rank does not match the given range.
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getRank() >= r.getMin() && songcollection.get(i).getRank() <= r.getMax()) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void filterArtist(String artist) { // Remove all songs from this collection whose artist does not contain the given string (case-insensitive).
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getArtist().toLowerCase().contains((artist.toLowerCase()))) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void filterTitle(String title) { // Remove all songs from this collection whose title does not contain the given string (case-insensitive).
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getTitle().contains((title))) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void sortYear() { // Order the songs in this collection by year (ascending).
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getYear() < songcollection.get(j - 1).getYear(); j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
		System.out.println("Completed Sort By Year!");
	}

	public static void sortRank() { // Order the songs in this collection by rank (ascending).
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getRank() < songcollection.get(j - 1).getRank(); j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
		System.out.println("Completed Sort By Ranking");
	}

	public static void sortArtist() { // Order the songs in this collection lexicographically by artist (ascending, case-insensitive).
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getArtist().toLowerCase().compareTo(songcollection.get(j - 1).getArtist().toLowerCase()) < 0; j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
		System.out.println("Completed Sort By Artist");
	}

	public static void sortTitle() { // Order the songs in this collection lexicographically by title (ascending, case-insensitive).
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getTitle().toLowerCase().compareTo(songcollection.get(j - 1).getTitle().toLowerCase()) < 0; j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
		System.out.println("Completed Sort By Title");
	}
}
