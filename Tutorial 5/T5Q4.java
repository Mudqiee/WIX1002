public class T5Q4 {
    public static void main(String[] args) {
        
        // Write the statements that display the number of occurrence of the word "the" 
        //(case sensitive) in a string array name sentence.

        int the_count = 0;

        String[] sentences = {
            "the quick brown fox",
            "jumped over the lazy dog",
            "the dog barked, but the fox ran away",
            "what is the time?",
            "This is a sentence without the target word."
        };

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals("the")) {
                    the_count++;
                }
            }
        }
        System.out.printf("The count for the word 'the' is %d\n", the_count);


    }
}
