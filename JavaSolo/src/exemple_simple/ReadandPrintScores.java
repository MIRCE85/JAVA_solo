/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple_simple;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mircea
 */
public class ReadandPrintScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   {	try
	{   Scanner s = new Scanner( new File("E:\\Desktop\\Al Dahra.docx") );
	    while( s.hasNextInt() )
	    {	System.out.println( s.nextInt() );
	    }
	}
	catch(IOException e)
	{	System.out.println( e );
	}
    }
    }
    
}
