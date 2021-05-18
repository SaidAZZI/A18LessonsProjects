/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author said
 */
public class FilesWriter {

    public static void saveStringIntoFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveStringIntoFile(String jsonstudentjson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void  saveStringIntoFile(String filePath, String contentSave) throws IOException {
       
        File file = new File(filePath) ;
        FileUtils.writeStringToFile(file, contentSave, "UTF-8");
        
        
    }
    
}
