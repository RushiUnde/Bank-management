
import java.util.*;

public class FindMissingBigram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] knownBigrams = new String[n];
        for (int i = 0; i < n; i++) {
            knownBigrams[i] = sc.next();
        }
        sc.close();

        // Generate all possible bigrams from a word consisting of only 'a' and 'b'
        List<String> allBigrams = new ArrayList<>();
        for (char i : new char[]{'a', 'b'}) {
            for (char j : new char[]{'a', 'b'}) {
                allBigrams.add("" + i + j);
            }
        }

        // Find the missing bigram
        String missingBigram = "";
        for (String bigram : allBigrams) {
            if (!Arrays.asList(knownBigrams).contains(bigram)) {
                missingBigram = bigram;
                break;
            }
        }

        System.out.println(missingBigram);
    }
}

