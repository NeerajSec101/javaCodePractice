package strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = "neeraj";
//        String sname = "sharma";
//        //compare case 2
//        // 1 name>sname = +ve
//        //2. name==sname = 0
//        //3. name<snam = -ve
//
//        System.out.println(name);
//        System.out.println(name.length());
//        for(int i=0;i<name.length();i++){
//            System.out.print(name.charAt(i)+" ");
//        }
//        System.out.println();
////        if(name.compareTo(sname)==0){
////            System.out.println("string are equals");
////        }else{
////            System.out.println("string are not equals");
////        }
//
//        String sentent = "My name is neeraj";
//        System.out.println(sentent.substring(11));
//        String str = "123";
//        int n = Integer.parseInt(str);
//        System.out.println(n);
//
//        String num = Integer.toString(n);
//        System.out.println(num);

        //Take an array of Strings input
        // from the user & find the cumulative (combined) length of all those strings.

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength=0;

        for(int i = 0;i<size;i++){
            array[i]= sc.nextLine();
            totLength += array[i].length();
        }
        System.out.println(totLength);


    }
}
