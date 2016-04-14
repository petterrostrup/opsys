public class IO {

    private Queue IOQueue ;
    private Statistics statistics ;
    private long avgIOTime ;
    private Gui gui ;
    private Process activeProcess ;
    private EventQueue eventqueue ;

    public IO(Queue IOQueue, Statistics statistics, Gui gui, EventQueue eventqueue, long avgIOTime) {
        this.IOQueue = IOQueue;
        this.statistics = statistics;
        this.avgIOTime = avgIOTime ;
        this.gui = gui;
        this.eventqueue = eventqueue;
    }

    public boolean isIdle(){
        return this.activeProcess==null;
    }

    public Process getActiveProcess(){
        return activeProcess ;
    }


}
