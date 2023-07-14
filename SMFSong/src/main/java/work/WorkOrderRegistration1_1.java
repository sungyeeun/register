//작업지시 조회/신규/수정/복사 기능
// DB

package work;

class WorkOrder {
    private String workOrderNumber;
    private String productName;
    private String manager;
    private String processInformation;
    private String railInformation;

    public WorkOrder(String workOrderNumber, String productName, String manager) {
        this.workOrderNumber = workOrderNumber;
        this.productName = productName;
        this.manager = manager;
    }

    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getManager() {
        return manager;
    }

    public String getProcessInformation() {
        return processInformation;
    }

    public void setProcessInformation(String processInformation) {
        this.processInformation = processInformation;
    }

    public String getRailInformation() {
        return railInformation;
    }

    public void setRailInformation(String railInformation) {
        this.railInformation = railInformation;
    }
}
