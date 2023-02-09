package class20;

public class UserClass {
    /*
  Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
 Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
   Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int phoneNumber;
    UserClass(String name,int phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public void display(){
        System.out.println(name+" this phone is " +phoneNumber);
    }
}
    class UserInfo extends UserClass{
     String UserAddress;
     UserInfo(String name, int phoneNumber,String UserAddress){
         super(name, phoneNumber);
         this.UserAddress=UserAddress;
     }

     void UserDetails(){
         System.out.println("Name: " + name);
         System.out.println("phoneNumber: " + phoneNumber);
         System.out.println("UserAddress: " + UserAddress) ;
     }

}
