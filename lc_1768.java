public class lc_1768 {
    public static void main(String[] args) {
        String word1 = "abcdefghijklmn";
        String word2 = "123456";

        String s = mergeAlternately(word1, word2);

        System.out.println(s);

    }

    static String mergeAlternately(String word1, String word2) {
        int wl1 = word1.length();
        int wl2 = word2.length();
        String s = "";

        int length = Math.max(wl1, wl2);

        for(int i = 0; i < length; i++){

            if(i < wl1){
                s = s + word1.charAt(i) ;
            }

            if(i < wl2){
                s = s + word2.charAt(i);
            }
        }
        return s;
    }
}
