public class T5Q5 {
    public static void main(String[] args) {
        
        // Write the statements that display the string array name sentence in reverse order.
        // Each string element must be displayed in reverse order as well.

        String[] sentences = {
            "the quick brown fox",
            "jumped over the lazy dog",
            "the dog barked, but the fox ran away",
            "what is the time?",
            "This is a sentence without the target word."
        };

        String[] secnetnes = new String[sentences.length];

        for (int i = sentences.length - 1; i > 0; i--) {
            
            String[] words = sentences[i].split(" ");

            for (int j = words.length - 1; j >= 0; j--) {
                System.out.print(words[j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
