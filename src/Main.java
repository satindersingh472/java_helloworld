public class Main {
    public static void main(String[] args){
        String literal1 = "abc";
        String literal2 = "abc";

        String object_string1 = new String("abc");
        String object_string2 = new String("abc");

        System.out.println(literal1 == literal2);
        System.out.println(object_string1 == object_string2);

    }
}
