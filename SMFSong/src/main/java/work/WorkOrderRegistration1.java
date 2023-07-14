// 작업지시 조회/신규/수정/복사 기능

package work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class WorkOrderRegistration1 {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USER = "SMFUSER";
    private static final String DB_PASSWORD = "SMFUSER";

    public static void main(String[] args) {
        // 작업지시 등록
        WorkOrder workOrder = createWorkOrder();
        saveWorkOrder(workOrder);

        // 작업지시 번호 및 공정 정보 자동 생성
        String generatedNumber = generateWorkOrderNumber();
        assignProcessInformation(workOrder, generatedNumber);

        // 공정정보 수정
        String newProcessInfo = "New process information";
        updateProcessInformation(workOrder, newProcessInfo);

        System.out.println("작업지시 등록이 완료되었습니다.");
    }

    private static WorkOrder createWorkOrder() {
        // 작업지시 생성 로직
        String workOrderNumber = generateWorkOrderNumber(); // 작업지시 번호를 생성하도록 수정
        String productName = "Product 1";
        String manager = "John Doe";

        return new WorkOrder(workOrderNumber, productName, manager);
    }

    private static void saveWorkOrder(WorkOrder workOrder) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // 작업지시 데이터베이스에 저장
            String sql = "INSERT INTO work_orders (work_order_number, product_name, manager) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, workOrder.getWorkOrderNumber());
            statement.setString(2, workOrder.getProductName());
            statement.setString(3, workOrder.getManager());
            // ...

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void assignProcessInformation(WorkOrder workOrder, String generatedNumber) {
        workOrder.setProcessInformation("Process information for " + generatedNumber);
    }

    private static void updateProcessInformation(WorkOrder workOrder, String newProcessInfo) {
        workOrder.setProcessInformation(newProcessInfo);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // 작업지시 데이터베이스 업데이트
            String sql = "UPDATE work_orders SET process_info = ? WHERE work_order_number = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, newProcessInfo);
            statement.setString(2, workOrder.getWorkOrderNumber());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static String generateWorkOrderNumber() {
        // 작업지시 번호를 생성하는 로직을 구현
        return UUID.randomUUID().toString();
    }
}
