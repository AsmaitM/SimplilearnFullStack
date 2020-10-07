package fManagerInterfaces;

import java.io.IOException;

public interface LockersPvtDetelet {
   

    public void deleteExistingFile(String folderpath, String filename) throws IOException;
}
