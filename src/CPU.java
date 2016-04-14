public class CPU {

    private Queue queue;
    private Statistics statistics;
    private long maxCPUtime;
    private Gui gui;
    private Process activeProcess;
    private EventQueue eventQueue;
    private long lastEvent ;

    public CPU(Queue CPUqueue, Statistics statistics, long maxCPUtime, Gui gui, EventQueue eventqueue) {
        this.queue = CPUqueue;
        this.statistics = statistics;
        this.maxCPUtime = maxCPUtime;
        this.gui = gui;
        this.activeProcess = null;
        this.eventQueue = eventqueue;
        lastEvent = 0 ;
    }

    public boolean isIdle(){
        return this.activeProcess==null;
    }


}
