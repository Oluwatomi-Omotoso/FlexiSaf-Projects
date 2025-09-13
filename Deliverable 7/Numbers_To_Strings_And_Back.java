
class ReverseString{
    String reverseText(String input){
        String reversed = "";
        for(int i = input.length()-1; i >=0;i--){
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
class Numbers_To_Strings{
    //Library of numbers as words.
    private static final String[] units = {
            "zero","one","two","three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};


    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    // Convert number -> words
    public String numberToWords(int num) {
        if (num < 20) return units[num];
        if (num < 100) {
            int t = num / 10;
            int u = num % 10;
            if(u == 0)
                return tens[t];
            else {
                return tens[t] +"-"+units[u];
            }

        }
        if (num == 100) return "one hundred";

        return "out of range";
    }

    // Converting words -> number
    public int wordsToNumber(String word) {
        word = word.toLowerCase();

        // Gloss through units to find if word is in fact just a unit.
        for (int i = 0; i < units.length; i++) {
            if (word.equals(units[i])) {
                return i;
            }
        }

        // Gloss through tens to find if word is in fact just in there.
        for (int i = 2; i < tens.length; i++) {
            if (word.equals(tens[i])) {
                return i * 10;
            }
        }

        // Handle hyphenated words like "twenty-one"
        if (word.contains("-")) {
            String[] parts = word.split("-");
            int tensPart = 0, unitPart = 0;

            for (int i = 2; i < tens.length; i++) {
                if (parts[0].equals(tens[i])) {
                    tensPart = i * 10;
                }
            }

            for (int i = 0; i < units.length; i++) {
                if (parts[1].equals(units[i])) {
                    unitPart = i;
                }
            }

            return tensPart + unitPart;
        }

        if (word.equals("one hundred")) return 100;

        return -1; // invalid
}}


public class Numbers_To_Strings_And_Back {
    public static void main(String[] args) {


        //Reversing a string
        ReverseString rs = new ReverseString();

        String text = "hello world!";
        String reversed = rs.reverseText(text);

        System.out.println("Original:" + text);
        System.out.println("Reversed:" + reversed);


        //Convering number to words and back.
        int input = 24;
        Numbers_To_Strings converter = new Numbers_To_Strings();
        System.out.println(converter.numberToWords(input));

        String input2  = "forty-seven";
        System.out.println(converter.wordsToNumber(input2));
    }
}
