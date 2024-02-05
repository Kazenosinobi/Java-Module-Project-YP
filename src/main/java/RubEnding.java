public class RubEnding {

    public String generateEnding(float score) {
        int iscore = (int) score;
        if (iscore >= 11 && iscore <= 14) {
            return " рублей.";
        } else if (iscore % 10 == 2 || iscore % 10 == 3 || iscore % 10 == 4) {
            return " рубля.";
        } else if (iscore % 10 == 1) {
            return " рубль.";
        } else {
            return " рублей.";
        }
    }
}
