package processManagemet.org;

public class Main {
    public static void main(String[] args) {
        ProcessManager processManager = new ProcessManager();

        // Adding processes
        processManager.addProcess(new Process(1, "Process 1", "Pending"));
        processManager.addProcess(new Process(2, "Process 2", "Running"));
        processManager.addProcess(new Process(3, "Process 3", "Completed"));

        // Listing all processes
        System.out.println("All Processes:");
        for (Process process : processManager.listAllProcesses()) {
            System.out.println(process);
        }

        // Searching for a process
        System.out.println("Search Process with ID 2:");
        System.out.println(processManager.searchProcess(2));

        // Updating process status
        System.out.println("Updating status of Process 2 to 'Completed'");
        processManager.updateProcessStatus(2, "Completed");

        // Listing all processes again
        System.out.println("All Processes:");
        for (Process process : processManager.listAllProcesses()) {
            System.out.println(process);
        }

        // Getting pending processes history
        System.out.println("Pending Processes History:");
        for (Process process : processManager.getPendingProcessesHistory()) {
            System.out.println(process);
        }

        // Getting completed processes history
        System.out.println("Completed Processes History:");
        for (Process process : processManager.getCompletedProcessesHistory()) {
            System.out.println(process);
        }

        // Removing a process
        System.out.println("Removing Process with ID 1:");
        processManager.removeProcess(1);

        // Listing all processes again
        System.out.println("All Processes:");
        for (Process process : processManager.listAllProcesses()) {
            System.out.println(process);
        }
    }
}