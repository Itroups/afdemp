package ex19_11_18_a;

public class Person {
    private String Name;
    private int Age;
    private String Lastname;
    private String Colour;
    public Person(){
        
    }
    public Person(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
    public Person(String Name,int Age,String Lastname,String Colour){
        this.Name=Name;
        this.Age=Age;
        this.Lastname=Lastname;
        this.Colour=Colour;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
      this.Name=Name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public String getLastname(){
        return Lastname;
    }
    public void setLastname(String Lastname){
        this.Lastname=Lastname;
    }
    public String getColour(){
        return Colour;
    }
    public void setColour(String Colour){
        this.Colour=Colour;
    }
    
    @Override
    public String toString(){
      // return "My name is "+Name+" and my age is "+Age; 
    return "Person{ "+"Name: "+Name+" Lastname: "+Lastname+" Age: "+Age+" Colour: "+Colour+" }"; 
    }
}
