//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
 private Map<String,Set<String>> map;

 public Relatives()
 {
   map = new TreeMap<String, Set<String>>();
 }

 public void setPersonRelative(String line)
 {
  String[] personRelative = line.split(" ");
  if(map.get(personrelative[0])==null)
  {
    map.put(personrelative[0], new TreeSet<String>());
 }
     map.get(personrealtice[0].add(personrealtive[1]));
 }


 public String getRelatives(String person)
 {
  return ""+map.get(person);;
 }
//idk the point of that method

 public String toString()
 {
  String output="";
   for(String person : map.keySet()){
     output+= person + " is related to ";
     for(String i : map.get(person)){
       output+=i + " "; 
     }
     output+="\n";
   }







  return output;
 }
}