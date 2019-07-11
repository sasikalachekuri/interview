package Interview_topics;

import java.io.File;
import java.io.IOException;

public class CurrentDirectory {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir");//Gives current
		// Directory
//     String path2 ="\\test-output\\index.html";
	// String path =
		// System.getProperty("user.dir"+"path2");
	//	String path = System.getProperty("C:\\Users\\amrit\\Documents\\workSpace_RS\\Janaki_Practice\\test-output\\testng-results.xml");
		System.out.println(path);

		//
		// String Directory = "ScreenShot";
		// File file = new File(Directory);
		// if (file.isDirectory()==false){
		// file.mkdir();
		// }
		// File fs =new File(path+"\\Screenshot\\Method1.jpg");
		// fs.createNewFile();
		// }
		//
		//

		// String Directory = "ScreenShot";
		// File file = new File(Directory);
		// if (file.isDirectory()==false){
		// if(file.mkdirs()){
		// File fs =new File(path+"\\Screenshot\\Method.jpg");
		// fs.createNewFile();
		// }else{
		// System.out.println("Dir not created");
		// }
		// }
		// else {
		// System.out.println("Dir already exist");
		// }

	}

}
