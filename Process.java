package processManagemet.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Process {
    int processId;
    String processName;
    String status; // values: "Pending", "Running", "Completed"

    public Process(int processId, String processName, String status) {
        this.processId = processId;
        this.processName = processName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processId=" + processId +
                ", processName='" + processName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}