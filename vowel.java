public class vowel{
    public static void main(String[] args) {
        String txt = "Hello World";
        int count=0;

        for (int i = 0; i < txt.length(); i++) {
            char ch = Character.toLowerCase(txt.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                 System.out.print(ch);
            
            }

        }
         System.out.print("the number of vowel is: " + count++);
        
    }
}