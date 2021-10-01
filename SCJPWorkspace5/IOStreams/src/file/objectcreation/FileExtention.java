package file.objectcreation;

import java.io.File;
import java.io.FilenameFilter;

public class FileExtention implements FilenameFilter {

	String extFile;

	public FileExtention(String extFile) {

		this.extFile = extFile;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(extFile);
	}

}
