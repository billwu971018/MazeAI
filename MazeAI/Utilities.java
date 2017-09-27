import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class Utilities{
  public static void fileReader(){
  	BufferedReader reader = null;

	try {
	    File file = new File("BigMaze.txt");
	    reader = new BufferedReader(new FileReader(file));

	    String line;

	    MazeMap mazemap = new MazeMap();
	   	
	    int line_times = 0;
	 	while ((line = reader.readLine()) != null) {
	        // System.out.println(line);
	        mazemap.width = line.length();
	        for (int i = 0; i < line.length(); i++ ) {
	        	mazemap.curr_map.add(line.charAt(i));
	        	
	        }
	    }
	    mazemap.printMap();

	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    try {
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
  }
  
  public static void transformation(String curr_maze){
    for (int i = 0;i< curr_maze.length() ; i++ ) {
        System.out.print(curr_maze.charAt(i));
    }
  }


}
