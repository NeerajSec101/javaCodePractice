package arrays.Searching.LinearSearch;
//Based on leaner Search

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Neeraj";
        char target = 'k';
        //System.out.println(Search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean Search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(str.charAt(ch)==target){
                return true;
            }

        }
        return false;
    }

    static boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }

        }
        return false;
    }
}

