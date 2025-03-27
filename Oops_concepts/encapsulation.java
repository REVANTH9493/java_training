public class encapsulation {
    public static void main(String[] args) {
        Student revanth = new Student(1, "revanth", "revanthnagidi@gmail.com");
        Student venkatesh = new Student(2, "Venkatesh", "venkatesh@gmail.com");
        revanth.details();
        venkatesh.details();
        revanth.setName("Nagidi Revanth");
        venkatesh.setName("Rachakonda Venkatesh");
        revanth.details();
        venkatesh.details();
        revanth.setName("Nagidi$Revanth");
        revanth.details();
    }
}

class Student{
    int Id;
    private String name;
    String email;
    Student(int Id, String name, String email){
        this.Id = Id;
        this.name = name;
        this.email = email;
    }

    String getName(String name){
        return name;
    }

    private boolean containsOnlyAlpha(String str){
        for(char letter: str.toCharArray()){
            if(!((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122) || (letter == 32))){
                return false;
            }
        }
        return true;
    }

    void setName(String new_name){
        if(new_name.length() <= 5)    throw new Error("The name should be greater than 5 characters!");
        if(new_name.length() >= 50)     throw new Error("The name should be less than 50 characters!");
        if(containsOnlyAlpha(new_name))     throw new Error("The name should not contain special characters!!!");
        name = new_name;
    }

    void details(){
        System.out.println("Id : "+ Id);
        System.out.println("Id : "+ name);
        System.out.println("Id : "+ email);
    }
}