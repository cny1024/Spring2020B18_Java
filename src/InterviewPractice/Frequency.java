package InterviewPractice;

public class Frequency {
    // FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == nonDup.charAt(i)) {
                    count++;
                }
                result += nonDup.charAt(j) + "" + count;
            }

        }
        return result;
    }
}
