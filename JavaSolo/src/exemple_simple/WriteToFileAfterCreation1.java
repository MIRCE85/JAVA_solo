/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple_simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mircea
 */
public class WriteToFileAfterCreation1 {

        public static void main(String[] args)
               
            
            {
                
            
                       
            try
		{	PrintStream writer = new PrintStream( getFile());
			
                Random r = new Random();
                
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
                      {	
                            
                            
                                writer.print( ";"+r.nextInt() +";"+r.nextInt());
                             
                                
			
                      }
                        
			writer.close();
                        
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
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
