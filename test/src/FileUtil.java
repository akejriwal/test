

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Random;

public class FileUtil 
{
	private static Random r = new Random(System.currentTimeMillis());
	public static boolean copyFile(File file, String ToFileName)
	{
		
		if( (new Date().getTime()- file.lastModified())<1000*60)
		{
			return false;
		}
		
		
	    boolean retVal = true;
	    final int BufSize = 1024*64;     // 65 Kb buff.
	    byte Buf[] = new byte[BufSize];
	    try{
	      if(file != null && file.exists() && file.isFile() && file.canRead()){
	        InputStream InFileStream = new FileInputStream(file);
	        boolean EOFFlag = false;
	        int RealSize = 0;
	        try{
	          OutputStream OutFileStream = new FileOutputStream(ToFileName);
	            try{
	              do {
	                if((RealSize = InFileStream.read(Buf, 0, Buf.length)) == -1){
	                  EOFFlag = true;
	                 
	                }
	                else {
	                  OutFileStream.write(Buf, 0, RealSize);
	                }
	              } while(!EOFFlag);
	            }
	            catch(Exception e){ retVal = false; e.printStackTrace();}
	            finally{
	              OutFileStream.close();
	              try{
	                new File(ToFileName).setLastModified(file.lastModified());
	              }
	              catch(Exception e){ retVal = false; e.printStackTrace();}
	            }
	        }
	        catch(Exception e){ retVal = false;e.printStackTrace(); }
	        finally{
	          InFileStream.close();
	        }
	      }
	      else{
	    	  retVal=false;
	      }
	    }
	    catch(Exception e){ retVal = false; e.printStackTrace();}
	    return retVal;
	  }
	
	
	public static void verifyDirectory(String directory)
	{
		File downloadFolder=new File(directory);
		if(!downloadFolder.isDirectory())
		{
			boolean flag=downloadFolder.mkdirs();
			if(flag==false)
			{
				throw new RuntimeException("Unable to create folder structure");
			}
		}
	}
	
	public static String writeContentsToFile(String contents,String prefixFileName,String directoryPath) throws IOException
	{
		if(prefixFileName==null)
			prefixFileName="";
		File file=new File(directoryPath+ "\\" +prefixFileName+unicFN()+".str");
		FileWriter writer=new FileWriter(file);
		writer.write(contents);
		writer.close();
		return file.getAbsolutePath();
	}
	
	public static String unicFN() {
		return Long.toString(System.currentTimeMillis())
				+ Long.toString(Math.abs(r.nextLong()));
	}
	

}
