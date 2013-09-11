import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile 
{
	public static void write(final File file )
	{
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				FileWriter writer=null;
				try {
					writer=new FileWriter(file);
					int count=0;
					while(count++<100)
					{
						System.out.println("writing file");
						writer.write("Abhishek\n");
						Thread.sleep(100);
					}
					writer.close();
				} catch (IOException | InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
		});
		
		thread.start();
		
		
	}

}
