package fManagerInterfaces;

import java.io.File;
import java.io.IOException;

public interface LockersPvtDisplay{
    
    public boolean  isEmpty(String FolderPath);
    public int  countFiles(String FolderPath);
    public void display(String FolderPath) throws IOException;
   

}
