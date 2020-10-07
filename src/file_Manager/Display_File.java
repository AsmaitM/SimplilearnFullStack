package file_Manager;

import fManagerInterfaces.LockersPvtDisplay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Display_File implements LockersPvtDisplay {
	

    @Override
    public boolean isEmpty(String FolderPath) {  
        File FileCount=new File(FolderPath);
        String files[]=FileCount.list();
        if (files.length>0){
            return false;
        }
        else {
            return true;
        }
    }
    
    @Override
    public int countFiles(String FolderPath) {  
       File FileCount=new File(FolderPath);
       String files[]=FileCount.list();
        return files.length;
    }


    @Override
    public void display(String FolderPath) throws IOException {     	
     Files.list(Paths.get(FolderPath)).filter(Files::isRegularFile).sorted().forEach(System.out::println);
        
   }
   

    
    

}