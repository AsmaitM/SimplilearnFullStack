package file_Manager;
import fManagerInterfaces.LockersPvtAdd; 
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Add_File  implements LockersPvtAdd{  

    
    @Override
    public void addMyFiles(String Foldername, String FileName) throws IOException { 
    	Add_File obj = new Add_File();
        int count = obj.countFiles(Foldername);
        if (count >= 0) {
            if(!Files.exists(Paths.get(Foldername,FileName))){
                Files.createFile(Paths.get(Foldername,FileName));
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File Already Exists in the Directory");
            }
        }

    }

    public int countFiles(String FolderPath) {  
	       File FileCount=new File(FolderPath);
	       String files[]=FileCount.list();
	        return files.length;
	    }
}