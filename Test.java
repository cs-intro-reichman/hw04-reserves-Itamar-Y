public class Test {
    
    public static void main(String[] args) {
        String strtest = "vowels are fun";
        System.out.println(capVowelsLowRest(strtest));
    }


    public static String capVowelsLowRest (String string) {
        char[] vowels = {'A', 'a', 'E', 'e', 'U', 'u', 'I', 'i', 'O', 'o'};
        int n = string.length();
        String str1 = "";
        

        for (int i = 0; i < n; i++) {
                char c = string.charAt(i);
            
                boolean isvowel = false;

                    // for (char vowel : vowels) {
            //     if (c == vowel) {
            //         isVowel = true;
            //         break;
        for (int j = 0; j < vowels.length; j++){
            if (c == vowels[j] ) {
                isvowel = true;
                break;
            }
        }

            if (isvowel) {
                if (c > 'a') {
                    c = (char) (c - 'a' + 'A');
                } else {
                    if (c >= 'A' && c <= 'Z') {
                    c = (char) (c - 'A' + 'a');
                    }
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
            // if (c != ' ') {
            str1 += c;
            
        }  

        // for (int i = 0; i < n-1; i++){
        //     char c = str1.charAt(i);
        //     char d = str1.charAt(i+1);
        //     if (c > 'a') {
        //             str2 += c;
        //         } 
        //         if (c == ' ') {
        //             d = (char) (d - 'a' + 'A');
        //             str2 += d;
        //         }
        //     }
        //     str2 += str1.charAt(n - 1);

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
}
