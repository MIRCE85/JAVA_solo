/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordCount;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mircea
 */
public class SimpleWordCounter {
    
    public static void main(String[] args) {
        try {
          Scanner  sc = new Scanner(getFile());
            // sc.useDelimiter("[^a-zA-Z']+");
            Map<String, Integer> wordCount = new TreeMap<String, Integer>();
            while(sc.hasNext()) {
                String word = sc.next();
                if(!wordCount.containsKey(word))
                    wordCount.put(word, 1);
                else
                    wordCount.put(word, wordCount.get(word) + 1);
            }
            
            // show results
            for(String word : wordCount.keySet())
                System.out.println(word + " " + wordCount.get(word));
            System.out.println(wordCount.size());
        }
        catch(IOException e) {
            System.out.println("Unable to read from file.");
        }
        
        
        }
                
        
    private static File getFile() {
        // create a GUI window to pick the text to evaluate
        JFileChooser chooser = new JFileChooser();
         FileNameExtensionFilter filter = new FileNameExtensionFilter("txt files","txt");
         chooser.setFileFilter(filter);
         chooser.setDialogTitle("Alege un fisier txt");
       
        
        int retval = chooser.showOpenDialog(null);
        File f =null;
        chooser.grabFocus();
        if (retval == JFileChooser.APPROVE_OPTION)
                   f = chooser.getSelectedFile();
       
        
        return f;
        
        
        
    }
    
}
