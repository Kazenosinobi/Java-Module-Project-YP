public class RubEnding {
    private static final String R1 = " рублей.";
    private static final String R2 = " рубля.";
    private static final String R3 = " рубль.";

    public String generateEnding(float score) {
        int iscore = (int) score;
        int a = iscore % 10;
        int b = iscore % 100;
        if (iscore >= 11 && iscore <= 14 || b >= 11 && b <= 19) {
            return R1;
        } else if (a >= 2 && a <= 4) {
            return R2;
        } else if (a == 1) {
            return R3;
        } else {
            return R1;
        }
    }
}
