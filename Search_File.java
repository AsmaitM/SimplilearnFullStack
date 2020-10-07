package file_Manager;
import fManagerInterfaces.LockersPvtSearch;
import java.io.File;
import java.io.IOException;


public class Search_File implements LockersPvtSearch{

    
    @Override
    public String searchMyFile(String FolderPath,String FileName) throws IOException { // create a method in the interface searchMyFile(String FolderPath,String FileName)
    	Search_File obj =new Search_File();
        int count=obj.countFiles(FolderPath);
        String DirectoryName=FolderPath+"\\";
        String fileFound=null;
        if(count>0) {
            File file =new File(DirectoryName+FileName);
            if(file.exists()){
                fileFound=DirectoryName+FileName;
                System.out.println("File Exists"+" "+DirectoryName+FileName);
            }
            else{
                fileFound=null;
                System.out.println("File Not Found");
            }
        }
        else{
            System.out.println("Directory is empty");
        }

        return fileFound;
    }

    public int countFiles(String FolderPath) {  
	       File FileCount=new File(FolderPath);
	       String files[]=FileCount.list();
	        return files.length;
	    }

}