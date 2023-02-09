package class22;

public class Degree {
    /*
 Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes
     */
    void getPrerequisite() {
        System.out.println("To get a Degree we need a High school Diploma");
    }
}
class Bachelors extends Degree {
}
class Masters extends Degree{
    @Override
    void getPrerequisite() {
        super.getPrerequisite();
        System.out.println("To get a Masters Degree we need a Bachelors Degree First");
    }
}

class DegreeTester{
    public static void main(String[] args) {
        Degree degree= new Degree();
        degree.getPrerequisite();
        Bachelors bachelors= new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}
