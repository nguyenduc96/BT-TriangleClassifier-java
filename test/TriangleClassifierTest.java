import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    public void testTriangleEquilateral() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;

        String expected = TriangleClassifier.TRIANGLEEQUILATERAL;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleIsoscelesAtBC() {
        int sideA = 3;
        int sideB = 2;
        int sideC = 2;

        String expected = TriangleClassifier.TRIANGLEISOSCELES;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleIsoscelesAtAB() {
        int sideA = 9;
        int sideB = 9;
        int sideC = 7;

        String expected = TriangleClassifier.TRIANGLEISOSCELES;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleIsoscelesAtAC() {
        int sideA = 5;
        int sideB = 3;
        int sideC = 5;

        String expected = TriangleClassifier.TRIANGLEISOSCELES;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleBasic() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 2;

        String expected = TriangleClassifier.NORMALTRIANGLE;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testNotTriangle() {
        int sideA = 4;
        int sideB = 8;
        int sideC = 2;

        String expected = TriangleClassifier.NOTTRIANGLE;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testNotTriangleBecauseSideNegativeAtA() {
        int sideA = 0;
        int sideB = 2;
        int sideC = 2;

        String expected = TriangleClassifier.NOTTRIANGLE;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testNotTriangleBecauseSideNegativeAtB() {
        int sideA = 3;
        int sideB = -1;
        int sideC = 2;

        String expected = TriangleClassifier.NOTTRIANGLE;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    public void testNotTriangleBecauseSideNegativeAtC() {
        int sideA = 1;
        int sideB = 2;
        int sideC = -2;

        String expected = TriangleClassifier.NOTTRIANGLE;
        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}