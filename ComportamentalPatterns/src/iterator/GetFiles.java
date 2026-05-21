package iterator;

import java.io.File;
import java.util.Iterator;

public class GetFiles {
	private String path;
	private File[] file;
	private int cursor = 0;
	
	public GetFiles(String path) {
		this.path = path;
	}
	
	public Iterator<File> iterator(){
		File f = new File(path);
		file = f.listFiles();
		
		return new Iterator<File>() {
			@Override
			public boolean hasNext() {
				return file.length > cursor;
			}
			@Override
			public File next() {
				return file[cursor++];
			}
			
		};
		
	}
	
	

	
	
}
