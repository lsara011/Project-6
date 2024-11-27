public class Customer {
    public static final int CUST_NOT_PROCESSED = 0;
    public static final int CUST_ENTERED = 1;

    public static final int CUST_EXITED = 2;

    private int id;
    private int arrival;
    private int enter;
    private int exit;
    private int status;

    public Customer(int Custid, int arrivalTime, int enterStop, int exitStop){
        if (Custid <= 0 || arrivalTime <= 0 || enterStop <= 0 || exitStop <= 0)
            throw new IllegalArgumentException();

        this.id = Custid;
        this.arrival = arrivalTime;
        this.enter = enterStop;
        this.exit = exitStop;
        

    }

    public int getId() {
        return id;
    }

    public int getArrival() {
        return arrival;
    }

    public int getEnter() {
        return enter;
    }

    public int getExit() {
        return exit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status)   {
        if(status < CUST_NOT_PROCESSED){
            throw new IllegalArgumentException();
        }
        else if(status > CUST_EXITED){
            throw new IllegalArgumentException();
        }
        else{
            this.status = status;
        }
        
    }
}


