package file.objectcreation;

import java.io.File;

public class DirectoryDelete {

	public static void directoryDelete(String file) {

		directoryDelete(new File(file));
	}

	public static void directoryDelete(File dir) {
		// TODO Auto-generated method stub

		try {

			if (dir != null) {

				File dirList[] = dir.listFiles();

				if (dirList != null) {

					for (int i = 0; i < dirList.length; i++) {

						File file = dirList[i];

						if (file.isFile()) {

							file.delete();

						} else {

							directoryDelete(file);

						}
					}
				}
				dir.delete();
				System.out.println("directory is deleted");

			} else {
				System.out.println("directory is null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
