/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author said
 */
public class FilesReader {

  public static String loadFileIntoString(String filePath) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(filePath);
        
        String fileContent = null;
        
        try {
            fileContent = IOUtils.toString(file,"UTF-8") ;
        } catch (IOException ex) {
            Logger.getLogger(FilesReader.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fileContent ;
        
    }
    
}
