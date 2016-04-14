public class CPU {

    private Queue queue;
    private Statistics statistics;
    private long maxCpuTime;
    private Gui gui;
    private Process activeProcess;

    public CPU(Queue cpuQueue, Statistics statistics, long maxCpuTime, Gui gui) {
        this.queue = cpuQueue;
        this.statistics = statistics;
        this.maxCpuTime = maxCpuTime;
        this.gui = gui;
        this.activeProcess = null;
    }

    public Event switchProcess(long clock) {
        if(activeProcess != null) {
            if(!queue.isEmpty()) {
                queue.insert(activeProcess);
                activeProcess = (Process) queue.removeNext();
                // TODO: Update statistics
            }
        }
        else {
            if(!queue.isEmpty()) {
                activeProcess = (Process) queue.removeNext();
            }
            return    
        }
    }

    public boolean isIdle() {
        return this.activeProcess == null;
    }

    public void insertProcess(Process process) {
        queue.insert(process);
    }
}
