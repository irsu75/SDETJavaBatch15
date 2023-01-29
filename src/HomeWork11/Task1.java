package HomeWork11;

public class Task1 {
    public static void main(String[] args) {
      /*  1) Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        For Example String str=hello =>l

       */
        String name= "Irina";
        int midCar=name.length()/2;

        if(!name.isEmpty()){
            if(name.length()%2 !=0 && name.length()>=3){
                System.out.println(name);
                System.out.println(name.charAt(midCar));
            }
        }
    }
}
