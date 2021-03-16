//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
 public static void main( String args[] ) throws IOException
 {
  //add more test cases  
   Scanner file = new Scanner(new File("relatives.dat"));
   int len = file.nextInt();
   file.nextLine();
   Relatives test = new Relatives();
   for(int i =0; i<len;i++)
     test.setPersonRelative(len.nextLine());
   out.println(test);
 }
}