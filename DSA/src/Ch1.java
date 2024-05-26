public class Ch1 {
    public boolean isUnique(String str) {
        if(str.length() > 128) return false;
        //assuming its noraml ascii string
        boolean[] char_arr = new boolean[128];
        for(int i = 0;i < str.length();i++ ){
            char c = str.charAt(i);
            if(char_arr[i]) return false;
            char_arr[i] = true;
        }
        return  true;

    }
    public boolean isPermutation(String s , String t) {
       if(s.length() != t.length()) return  false;

       int[] char_arr = new int[128];

       char[] str_array = s.toCharArray();

       for(char c : str_array) {
           char_arr[c]++;

       }
       for(int i = 0 ; i < t.length(); i++){
           int asciiChar = (int) t.charAt(i);
           char_arr[asciiChar]--;
           if(char_arr[asciiChar] < 0) return false;
       }
       return true;
    }
    public String Urlify(char[] str , int actualLength) {
        int spcCount = 0,newLength= 0;
        for (int i= 0;i < actualLength; i++){
            if (str[i] == ' ') {
                spcCount++;
            }
        }

        newLength = actualLength + spcCount * 2;
        

    }
}
