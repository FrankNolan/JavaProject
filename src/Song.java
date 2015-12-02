
public class Song {
	
	// member variables
	private String name;
	private String artist;
	private String format;
	private int releaseDate;
	private double length;
	private String genre;
	// end member variables

	// constructor
	public Song(String name, String artist, String format, int releaseDate, double length, String genre) {
		this.name = name;
		this.artist = artist;
		this.format = format;
		this.releaseDate = releaseDate;
		this.length = length;
		this.genre = genre;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Artist: " + artist);
		System.out.println("Format: " + format);
		System.out.println("Relase Date: " + releaseDate);
		System.out.println("Duration: " + length);
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public String getFormat() {
		return format;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public double getLength() {
		return length;
	}

	public String getGenre() {
		return genre;
	}

}
