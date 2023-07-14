// 공정 기계번호

package work;

public class Machinenum {
    public static void main(String[] args) {
        // 공정 기계번호 생성
        String machineNumber = generateMachineNumber();
        System.out.println("공정 기계번호: " + machineNumber);

        // 작업지시 코드 생성
        String workOrderCode = generateWorkOrderCode();
        System.out.println("작업지시 코드: " + workOrderCode);
    }

    private static String generateMachineNumber() {
        int machineNumber = (int) (Math.random() * 90000) + 10000;
        return String.valueOf(machineNumber);
    }

    private static String generateWorkOrderCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char c = (char) (Math.random() * 26 + 'A');
            sb.append(c);
        }
        return sb.toString();
    }
}
