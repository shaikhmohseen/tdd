package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String str) {
        int vowel_count =0 ;
        for (int i =0; i<str.length() ;i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
                vowel_count ++;
            }


        }
        return vowel_count;
    }

}
