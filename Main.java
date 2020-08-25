import java.util.*;
//https://crunchify.com/how-to-read-convert-csv-comma-separated-values-file-to-arraylist-in-java-using-split-operation/
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.io.FileReader;
import java.util.List;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //get the user's name
    /*
    System.out.println("What is your name?");
    String name = scan.nextLine();
    //get their main interests 
    */

   //messageOutline(scan);
   recruiterMatch();
   //readData();
    //System.out.println(recruiter);
    /*
    List<Recruiters> recruiters = readRecruitersFromCSV("tech.csv"); // let's print all the person read from CSV file 
    for (Recruiters b : recruiters) { 
      System.out.println(b); 
      } 
      */


    // BufferedReader buffer = null;

    // try { ih
    
    //   String recruiterLine; 
      
    //   buffer = new BufferedReader(new FileReader ("tech.txt"));
    //   while ((recruiterLine = buffer.readLine()) != null) {
    //     System.out.println("Raw CSV data: " + recruiterLine);
		// 		System.out.println("Converted ArrayList data: " + CSVtoArrayList(recruiterLine) + "\n");
    //    }
    // }
    //   catch (IOException e) {
    //     e.printStackTrace();
    // }

    //   finally {
    //     try{
    //       if (buffer != null) buffer.close();
    //     }
    //     catch (IOException crunchifyException) {
    //       crunchifyException.printStackTrace();
    //   }
    // }
  }


  public static ArrayList<String> CSVtoArrayList(String recruiterCSV) {
    ArrayList<String> result = new ArrayList<String>();
    if (recruiterCSV != null) {
			String[] splitData = recruiterCSV.split("\\s*,\\s*");
    
      for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
          result.add(splitData[i].trim());
      }
    }
  }
  return result;
}


public static boolean linkedinPremium() {
  Scanner scan = new Scanner(System.in);
  System.out.println("Do you have Linkedin Premium? Enter yes or no. \n ");
  String premium = scan.nextLine();
  String yes = "yes";
  String no = "no";
    boolean xyz = true;
    if(yes.equalsIgnoreCase(premium)) {
      xyz = true;
    }
    else if(no.equalsIgnoreCase(premium)) {
      xyz = false;
    }
    return xyz;
    }  

public static void recruiterMatch() {
  Scanner scan = new Scanner(System.in);
  System.out.println("What is your name? \n");
    String userName = scan.nextLine();
  System.out.println("Enter an adjective to describe yourself. \n ");
    String adjOne = scan.nextLine();
  System.out.println("Enter a final adjective to describe yourself. \n ");
    String adjTwo = scan.nextLine();
  System.out.println("Enter a technical skill you are proud of! (ex. java)\n ");
    String skill = scan.nextLine();
  System.out.println("What tech company are you interested in?  (Ex. Yelp) \n " );
    String companyName = scan.nextLine();

      //implement name-finding method from database
      if (linkedinPremium() == true) {
        System.out.println("What is the latest company you have worked for? Enter none if not applicable. \n ");
        String lastCompany = scan.nextLine();
        System.out.println("What is your phone number? \n ");
        String phoneNumber = scan.nextLine();
        String notApplicable = "none";
        if(!lastCompany.equalsIgnoreCase(notApplicable)){
          System.out.println("USE BELOW MESSAGE TO REACH OUT TO A RECRUITER: \n");
          System.out.println("Hi! My name is " + userName + " , and I'm a " + adjOne + " and " + adjTwo + " individual. I'm currently working for " + lastCompany+ ", but looking to take on a new challenge and transition to a new company such as " + companyName + " . If you have a minute, I'd love the opportunity to discuss how my " + skill + " skills and experiences in the tech industry might match up with positions you're recruiting for. Would love to hop on the phone to discuss. Please feel free to reach out to me at " + phoneNumber + ". Looking forward to chatting with you! \n ");

          System.out.println("Here is the list of tech recruiters for the company you entered: \n");
        }
        else if(lastCompany.equalsIgnoreCase(notApplicable)){
          //no job previous
          System.out.println("USE BELOW MESSAGE TO REACH OUT TO A RECRUITER \n");
          System.out.println("Hi! My name is " + userName+ ", and I'm a " + adjOne + " and " + adjTwo + " individual. I'm looking to take on a new challenge and transition to a new company such as " + companyName + " . If you have a minute, I'd love the opportunity to discuss how my " + skill + " and experiences in the tech industry might match up with positions you're recruiting for. Would love to hop on the phone to discuss. Please feel free to reach out to me at " + phoneNumber + ". Looking forward to chatting with you! \n");

          System.out.println("Here is the list of tech recruiters for the company you entered: \n");
        }
      
    }
     else if (linkedinPremium() == false) {
        System.out.println("USE BELOW MESSAGE TO REACH OUT TO A RECRUITER: \n \n");
        System.out.println("Hi! My name is " + userName + " and I'm a " + adjOne + " and " + adjTwo + " individual. If you have a second, I would love the chance to discuss how my " + skill+ " skills and experiences might match the tech internship I've applied for at " + companyName + ". Thanks for connecting! \n");

        System.out.println("Here is the list of tech recruiters for the company you entered: \n");
      }
  String recruiterLine = "";
  
  BufferedReader buffer = null;

    try {
      buffer = new BufferedReader(new FileReader ("tech.txt"));
      while ((recruiterLine = buffer.readLine()) != null) {
       // if(companyName.equalsIgnoreCase(recruiterLine)) {
         // System.out.println(recruiterLine);
        //}
        for(int i = 0; i < (CSVtoArrayList(recruiterLine).size())/4; i++) {
          if(CSVtoArrayList(recruiterLine).contains(companyName)) {

            System.out.println(CSVtoArrayList(recruiterLine));
        }
      }
        //System.out.println("Raw CSV data: " + recruiterLine);
				//System.out.println("Converted ArrayList data: " + CSVtoArrayList(recruiterLine) + "\n");
       }

    }
      catch (IOException e) {
        e.printStackTrace();
    }

      finally {
        try{
          if (buffer != null) buffer.close();
        }
        catch (IOException crunchifyException) {
          crunchifyException.printStackTrace();
      }
    }

//   ArrayList<String> output = new ArrayList<String>();
//   ArrayList<String> result = CSVtoArrayList(recruiterLine);
//   /*
//   for(int i = 0; i < result.size(); i++){
//     if(result.contains(companyName)){
//       output.add(result.get(i));
//     }
//   }
//   */
//   boolean abc = true; 
//   if(companyName.equalsIgnoreCase(recruiterLine)){
//     abc = true;
//   }
//   else {
//     abc = false;
//   }
//     if(abc = true){
//       return recruiterLine;
// }  
//   return recruiterLine;
} 
}
/*
  public static List<String[]> readData() throws IOException { 
    int count = 0;
    String file = "tech.txt";
    List<String[]> content = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line = "";
        while ((line = br.readLine()) != null) {
            content.add(line.split(","));
        }
    } 
    return content;
}
*/


  /*
  
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
*/