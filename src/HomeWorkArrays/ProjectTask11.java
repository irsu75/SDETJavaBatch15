package HomeWorkArrays;

public class ProjectTask11 {
    public static void main(String[] args) {

        /*11)Write a program to print out duplicate elements from an Array of Strings? (edited)

         */
        String []vegetables={"Potatoes","Carrot","Onion","Tomato","Carrot"};
           for(int i = 0; i < vegetables.length; i++){
               for(int j = i + 1; j < vegetables.length; j++){
                   if(vegetables[i].equals(vegetables[j])){
                       System.out.println("Duplicate="+vegetables[i]);
                   }
               }
           }




    }
}
