package strings;

/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        Example :
        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/


import java.util.Scanner;

public class createUsersFromEmail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String email = sc.next();
        String UserName =" ";

        for(int i =0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                UserName += email.charAt(i);

            }
        }
        System.out.println(UserName);
    }
}
