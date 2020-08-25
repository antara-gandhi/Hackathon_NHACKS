public class Recruiters { 
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