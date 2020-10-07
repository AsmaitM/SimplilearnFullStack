package file_Manager;

import fManagerInterfaces.LockersPvtDetelet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


	public class Delete_File implements LockersPvtDetelet { 

	    
	    @Override
	    public void deleteExistingFile(String folderpath, String filename) throws IOException {  
	    	Delete_File obj = new Delete_File();
	        int count = obj.countFiles(folderpath);
	        if (count > 0) {
	            Path path = Paths.get(folderpath, filename);
	            if (Files.exists(path)) {
	                Files.deleteIfExists(Paths.get(folderpath, filename));
	                System.out.println("File Deleted Successfully");

	            } else {
	                System.out.println("File Doesn't Exist in the Directory");
	            }
	        } else {
	            System.out.println("Directory is Empty");
	        }
	    }

		
		public int countFiles(String FolderPath) {  
		       File FileCount=new File(FolderPath);
		       String files[]=FileCount.list();
		        return files.length;
		    }
	}
