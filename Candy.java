// Ayaan Ajmal - September 24
class Candy{
  public String Name;

  Candy(){
    Name = "";
  } //Method one that sets the variable to a black string.

  Candy(String aName){
    aName = Name;
  } //Method 2 that uses a parameter and makes it equal to the variable.

  void setName(String theName) {
    Name = theName;
  } // The mutator method to set the name of the candy.

  String getName() {
    return Name;
  }// The accesor method to get the name of the candy.

  void print(){
    System.out.println(Name);
  } // The print method to get the candy name.

}