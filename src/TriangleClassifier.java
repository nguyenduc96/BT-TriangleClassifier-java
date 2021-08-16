public class TriangleClassifier {

    public static final String NOTTRIANGLE = "Day khong phai tam giac";
    public static final String TRIANGLEEQUILATERAL = "Tam giac deu";
    public static final String TRIANGLEISOSCELES = "Tam giac can";
    public static final String NORMALTRIANGLE = "Tam giac thuong";

    public static String classifyTriangle(int sideA, int sideB, int sideC) {
        boolean sideAEqualB = sideA == sideB;
        boolean sideAEqualC = sideA == sideC;
        boolean sideBEqualC = sideB == sideC;
        String result = "";
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA) || sideA <= 0 || sideB <= 0 || sideC <= 0) {
            result = NOTTRIANGLE;
        } else {
            result = getResultIsTriangle(sideA, sideB, sideC, sideAEqualB, sideAEqualC, sideBEqualC);
        }
        return result;
    }

    private static String getResultIsTriangle(int sideA, int sideB, int sideC, boolean sideAEqualB, boolean sideAEqualC, boolean sideBEqualC) {
        String result;
        if (sideAEqualB && sideAEqualC) {
            result = TRIANGLEEQUILATERAL;
        } else {
            if ((sideAEqualB && sideA != sideC) || (sideAEqualC && sideA != sideB) || sideBEqualC && sideC != sideA) {
                result = TRIANGLEISOSCELES;
            } else {
                result = NORMALTRIANGLE;
            }
        }
        return result;
    }
}
