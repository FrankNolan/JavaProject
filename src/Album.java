import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Album extends StoreItem {
	
	private String albumName;
	private Song[] songArray;

	public Album(String fileName,String albumName) throws FileNotFoundException{
		
		this.songArray = populateSongs(fileName);
		this.albumName = albumName;
	}

	public Song[] populateSongs(String fileName) throws FileNotFoundException {
		int counter = 0;

		Scanner file = new Scanner(new FileReader(fileName));

		while (file.hasNext()) { // until end of file
			file.nextLine(); // skip a line
			counter++; // counter number of songs
		}
		
		file.close(); // close so can re-poen at top
		
		Song[] songArray = new Song[counter];
		// create correctly sized array
		
		file = new Scanner(new FileReader(fileName));
		
		
		for(int i = 0; i < songArray.length; i++){
			
			String artist = file.next();
			String format = file.next();
			int year = file.nextInt();
			double length = file.nextDouble();
			String genre = file.next();
			String name = file.nextLine();
			// take in information in same order as the file
			
			songArray[i] = new Song(name,artist,format,year,length,genre);
			// call constructor with all paramters to make array of songs
			
		} // for
	
		file.close(); // close file for second time
		
		return songArray;
	}
	
	public void printAlbum(){
		for(int i = 0; i < songArray.length;i++){
			songArray[i].display();
			System.out.println();
		}
	}

	public String getAlbumName() {
		return albumName;
	}

	public Song[] getSongArray() {
		return songArray;
	}

}
