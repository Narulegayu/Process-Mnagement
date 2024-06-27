package processManagemet.org;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ProcessManager {
    private List<Process> processList = new ArrayList<>();
    private LinkedList<Process> pendingProcessHistory = new LinkedList<>();
    private LinkedList<Process> completedProcessHistory = new LinkedList<>();

  
    public void addProcess(Process process) {
        processList.add(process);
        if (process.status.equals("Pending")) {
            addPendingProcess(process);
        } else if (process.status.equals("Completed")) {
            addCompletedProcess(process);
        }
    }

 
    public boolean removeProcess(int processId) {
        for (Process process : processList) {
            if (process.processId == processId) {
                processList.remove(process);
                return true;
            }
        }
        return false;
    }

    public Process searchProcess(int processId) {
        for (Process process : processList) {
            if (process.processId == processId) {
                return process;
            }
        }
        return null;
    }

 
    public List<Process> listAllProcesses() {
        return new ArrayList<>(processList);
    }

   
    public boolean updateProcessStatus(int processId, String newStatus) {
        for (Process process : processList) {
            if (process.processId == processId) {
                process.status = newStatus;
                if (newStatus.equals("Pending")) {
                    addPendingProcess(process);
                } else if (newStatus.equals("Completed")) {
                    addCompletedProcess(process);
                }
                return true;
            }
        }
        return false;
    }

  
    public void addPendingProcess(Process process) {
        pendingProcessHistory.add(process);
    }

 
    public void addCompletedProcess(Process process) {
        completedProcessHistory.add(process);
    }

   
    public List<Process> getPendingProcessesHistory() {
        return new LinkedList<>(pendingProcessHistory);
    }


    public List<Process> getCompletedProcessesHistory() {
        return new LinkedList<>(completedProcessHistory);
    }
}
