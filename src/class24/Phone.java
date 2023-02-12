package class24;

  public abstract class Phone {
    /*
    create a phone class lets create abstract methods like displayPictures
    unlockPhone
    SendText
    2 child classes Iphone Samsung Google and provide implementation
    lets write code to achieve runtime polymorphism
     */
     abstract void displayPictures();

     abstract void unlockPhone() ;



     abstract void sendText();

         }




 class Iphone extends Phone{

     @Override
     void unlockPhone() {
         System.out.println("FaceId to unlock the Phone");
     }

     @Override
     void sendText() {
         System.out.println("Lets use IMessage to send the text");

     }

     @Override
     void displayPictures() {
         System.out.println("Iphotos to browse the pictures");

     }
 }
 class Samsung extends Phone{
     @Override
     void displayPictures() {
         System.out.println("");

     }

     @Override
     void unlockPhone() {
         System.out.println("Using fingerPrint sensor or camera");

     }

     @Override
     void sendText() {
         System.out.println("Messages app to send the message");

     }
 }
