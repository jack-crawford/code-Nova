public class Dawg {
   private String name;
   private int age; 
   
   public Dawg(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getName() {
      return name;
   }
   public int getPersonAge() {
     return 7 * age;
   }
   public String toString() {
      return "this cute dog is " + name + ", they're " + age + " years old!";
   }
}