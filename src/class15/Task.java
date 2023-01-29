package class15;

public class Task {

    /*
    Create a method createEmail(). Based on values of user firstName, lastName and email type,
    your method should return complete email Address. Example: createEmail(John, Snow, gmail)->johnsnow@gmail.com

    return type =>String
    name=>createEmail
    parameter=>String firstName String lastName String emailType

     */

    String createEmail(String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";

    }
}
