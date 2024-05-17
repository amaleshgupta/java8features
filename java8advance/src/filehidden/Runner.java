package filehidden;

import java.io.File;

public class Runner {

	public static void main(String[] args) {
		File[] hiddenfiles=new File("C://Users//GUPTA").listFiles(File::isHidden);
		
		for (File file : hiddenfiles) {

			System.out.println(hiddenfiles);
		}

	}

}
