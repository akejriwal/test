import java.io.File;


public class Main 
{
	public static void main(String[] args) 
	{
		File file=new File("c:\\abhi\\testfile.txt");
		System.out.println(file.getPath());
		//WriteFile.write(file);
		System.out.println("copy file");
		//System.out.println(FileUtil.copyFile(file, "c:\\abhi\\textfilecopy.txt"));
		
	}

}
