public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String strtest = "One TWo tHRee world";
        System.out.println(capVowelsLowRest(strtest));
        String strtest2 = "  Intro to coMPUter sCIEncE ";
        System.out.println(camelCase(strtest2));
        String strtest3 = "Hello world";
        char ctest = 'l';
        System.out.println (toString(allIndexOf(strtest3, ctest)));
        
    }

    public static String capVowelsLowRest (String string) {
        char[] vowels = {'A', 'a', 'E', 'e', 'U', 'u', 'I', 'i', 'O', 'o'};
        int n = string.length();
        String str1 = "";

        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
    
            boolean isVowel = false;
            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
    
            if (isVowel) {
                if (c >= 'a') {
                    c = (char) (c - 'a' + 'A');
                }
            } else {
                if (c <= 'Z' && c >= 'A') {
                    c = (char) (c - 'A' + 'a');
                }
            }
            str1 += c;
        } return str1;
    }

    public static String camelCase (String string) {
        int n = string.length();
        String str1 = "";
        String str2 = "";
        boolean capitalizeNext = false;
        
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            } 
            str1 += c;
        }  

        for (int i = 0; i < n; i++) {
            char c = str1.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (capitalizeNext) {
                    c = (char) (c - 'a' + 'A');
                    capitalizeNext = false;
                }
                str2 += c;
            } else if (c == ' ') {
                capitalizeNext = true;
            }
        }
        if (str2.charAt(0) >= 'A' && str2.charAt(0) <= 'Z') {
            char c = str2.charAt(0);
            c = (char) (c - 'A' + 'a');
            str2 = c + str2.substring(1);
        }
        return str2;
    }
        
    

    public static int[] allIndexOf (String string, char chr) {
        int[] indexed;
        int n = string.length();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        indexed = new int[counter];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == chr) {
                indexed[j] = i;
                j++; 
            }
        }

        return indexed;
    }

    public static String toString (int[] indexed) {
        String str = "Output : {";
        int arraylength = indexed.length;

        for (int i =0; i < arraylength; i++) {
            if (i == arraylength -1) {
                str += i;
            } else {
            str += i + ", ";
            }
        }
        str += "}";
        return str;
    }
}   