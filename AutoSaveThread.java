public class AutoSaveThread extends Thread {
    private SRMS system;
    public AutoSaveThread(SRMS system) {
        this.system = system;
    }

    @Override
    public void run() {
        while (true) {
            try {
              
                Thread.sleep(30000);
                
                
                StudentFileManager.saveStudents(system.getStudents());
                System.out.println("\n[Auto-Save] Database backup updated successfully.");
                
            } catch (InterruptedException e) {
                System.out.println("Auto-save thread interrupted: " + e.getMessage());
                break; 
            }
        }
    }
}
