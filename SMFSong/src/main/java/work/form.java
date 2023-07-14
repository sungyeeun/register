//공정기법 색상 사이즈 형태

package work;

public class form {
    public static void main(String[] args) {
        String processTechnique = "CNC"; // 공정기법
        String color = "Red"; // 색상
        String size = "L"; // 사이즈
        String shape = "Circle"; // 형태

        String workOrderCode = generateWorkOrderCode(processTechnique, color, size, shape);
        System.out.println("작업지시 코드: " + workOrderCode);
    }

    private static String generateWorkOrderCode(String processTechnique, String color, String size, String shape) {
        // 예시로 각 요소의 첫 글자와 4자리의 랜덤한 숫자를 조합하여 작업지시 코드 생성
        StringBuilder sb = new StringBuilder();
        sb.append(processTechnique.charAt(0));
        sb.append(color.charAt(0));
        sb.append(size.charAt(0));
        sb.append(shape.charAt(0));
        sb.append(generateRandomNumber(1000, 9999));
        return sb.toString();
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

