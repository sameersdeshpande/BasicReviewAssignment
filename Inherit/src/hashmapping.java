
import java.util.HashMap;

class hashmapping {
  public static void main(String[] args) {

   
    HashMap<String, Integer> languages = new HashMap<>();  // create a hashmap

    
    languages.put("Java", 8); // add elements to hashmap
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
    languages.replace("Java", 1);
    System.out.println("HashMap after replacing: " + languages);
  }
}