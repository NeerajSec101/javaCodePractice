package strings;

/*Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        Example :
        original = “eabcdef’ ; result = “iabcdif”
        Original = “xyz” ; result = “xyz”*/


public class replacement {
    public static void main(String[] args) {
        String org = "xyz";
        String result = "";

        for(int i=0;i<org.length();i++){
            if(org.charAt(i)=='e'){
                result += 'i';
            }else{
                result += org.charAt(i);
            }
        }
        System.out.println(result);
    }
}
