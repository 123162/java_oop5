
package gradebook;

public class Grade {
   private String courseName;
   public void displayMessage(String courseName){
       System.out.println("Mesaj var " + courseName);
       
   } 
   public void displayMessage(){
       System.out.println("Adım Rabia");
       
   } 
   //Constructor
    public Grade(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
   
}
