/*
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;


public class CSVReaderInJava { 
  public static void main(String... args) { 
    List<Recruiters> recruiters = readRecruitersFromCSV("tech.csv"); // let's print all the person read from CSV file 
    for (Recruiters b : recruiters) { 
      System.out.println(b); 
      } 
    
    }


public static List<Recruiters> readRecruitersFromCSV(String fileName) { 
  List<Recruiters> recruiters = new ArrayList<>(); 
  Path pathToFile = Paths.get(fileName); 
  // create an instance of BufferedReader 
  // using try with resource, Java 7 feature to close resources 
  try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { 
    // read the first line from the text file 
    String line = br.readLine(); 
    // loop until all lines are read 
    while (line != null) { 
      // use string.split to load a string array with the values from 
      // each line of 
      // the file, using a comma as the delimiter 
      String[] attributes = line.split(","); 
      Recruiters recruiter = createRecruiters(attributes); 
      // adding book into ArrayList books.add(book); 
      // read next line before looping 
      // if end of file reached, line would be null 
      line = br.readLine();
    } 
}   catch (IOException ioe) {   
      ioe.printStackTrace(); 
    } return recruiters; 
  }

      
private static Recruiters createRecruiters(String[] metadata) { 
  String company = metadata[0];
  String name = metadata[1]; 
  String title = metadata[2]; 
  String link = metadata[3]; 
  // create and return book of this metadata 
  return new Recruiters(company, name, title, link); 
  }

}

class Recruiters { 
  private String name; 
  private String company;
  private String title; 
  private String link; 
  
  public Recruiters(String company, String name, String title, String link) { 
    this.company = company; 
    this.name = name; 
    this.title = title; 
    this.link = link;
    } 
    
  public String getName() { 
      return name; 
    } 
   
  public String getCompany() { 
     return company; 
    } 
        
  public String getTitle() { 
    return title; 
    } 

  public String getLink() { 
    return link; 
    } 

              
  @Override public String toString() { 
    return "Recruiter [name=" + name + ", company=" + company + ", title=" + title + ", LinkedIn link=" + link + "]"; 
    } 
  }
  */

