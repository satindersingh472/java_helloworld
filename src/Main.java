public class Main {
    public static void main(String[] args){
        String name = "satinder";
        if(name.isEmpty()){
               System.out.println("There is no name mentioned here");
        } else {
           System.out.println(String.format("The length is %d",name.length()));
           System.out.println(String.format("My name is %s", name));
       }

    }
}
