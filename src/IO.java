import java.util.Random;

public class IO implements Constants {

    private Queue ioQueue;
    private Statistics statistics ;
    private long avgIOTime;
    private Gui gui ;
    private Process activeProcess;
    private EventQueue eventqueue;

    public IO(Queue IOQueue, long avgIOTime, Statistics statistics) {
        this.ioQueue = IOQueue;
        this.avgIOTime = avgIOTime;
        this.statistics = statistics;
    }

    public Event addIoRequest(Process requestingProcess, long clock) {
        ioQueue.insert(requestingProcess);
        requestingProcess.calculateTimeToNextIoOperation();
        // TODO:  Check if a new I/O operation can be started
        if(activeProcess == null) {

        }
        return null;
    }

    public Event startIoOperation(long clock) {
        if(activeProcess == null) {
            if(!ioQueue.isEmpty()) {
                activeProcess = (Process) ioQueue.removeNext();
                statistics.nofIoOperations++;
                return new Event(END_IO, clock + activeProcess.getTimeSpentInIo());
            }
        }
        // TODO: Likely not correct
        return null;
    }

    public boolean isIdle(){
        return this.activeProcess == null;
    }

    public Process getActiveProcess(){
        return activeProcess;
    }
}
