import java.util.*;

public class SongCollection {
	private static ArrayList<Song> songcollection = new ArrayList<>();

	public SongCollection(ArrayList<Song> Songs) { // Creates the SongCollection
		for (int i = 0; i < Songs.size(); i++) {
			songcollection.add(Songs.get(i));
		}
	}

	public static void printSongCollection() { // Prints the SongCollection
		for (int i = 0; i < songcollection.size(); i++) {
			System.out.println(songcollection.get(i).toString());
		}
	}

	public static ArrayList<Song> getSongCollection() {
		return songcollection;
	}

	public static void restart(ArrayList<Song> song) {
		songcollection = song;
	}

	public static void filterYear(Range r) {
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getYear() >= r.getMin() && songcollection.get(i).getYear() <= r.getMax()) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void filterRank(Range r) {
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getRank() >= r.getMin() && songcollection.get(i).getRank() <= r.getMax()) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void filterArtist(String artist) {
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getArtist().toLowerCase().contains((artist.toLowerCase()))) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void filterTitle(String title) {
		ArrayList<Song> tempcollection = new ArrayList<>();
		for (int i = 0; i < songcollection.size(); i++) {
			if (songcollection.get(i).getTitle().toLowerCase().contains((title.toLowerCase()))) {
				tempcollection.add(songcollection.get(i));
			}
		}
		songcollection = tempcollection;
		System.out.println(songcollection.size() + " matches found!");
	}

	public static void sortYear() { // Sorts by Ascending Year
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getYear() < songcollection.get(j - 1).getYear(); j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
	}

	public static void sortRank() { // Sorts by Ascending Rankings
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getRank() < songcollection.get(j - 1).getRank(); j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
	}

	public static void sortArtist() { // Sorts by Ascending Artist
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getArtist().toLowerCase().compareTo(songcollection.get(j - 1).getArtist().toLowerCase()) < 0; j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
	}

	public static void sortTitle() {
		for (int i = 1; i < songcollection.size(); i++) {
			for (int j = i; j > 0 && songcollection.get(j).getTitle().toLowerCase().compareTo(songcollection.get(j - 1).getTitle().toLowerCase()) < 0; j--) {
				Collections.swap(songcollection, j, (j - 1));
			}
		}
	}
}
