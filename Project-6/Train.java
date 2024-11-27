import java.util.ArrayList;

public class Train {
    private int stops; //Num of stops made train has made in route
    private int madeStops; // num of stops the train made to process all cust
    private int currTime; // Time train made to process all cust
    private ArrayList<Customer> custList; //Store list of cust to process simulation

    public Train(int trainStops, ArrayList<Customer> cust){
        this.stops = trainStops;
        this.custList = cust;
    }

    public void simulate(){
        this.currTime = 1;
        this.stops = 1;

        boolean loopAgain = true;
        for(int i = 0; i < custList.size();i++){

        }
    }

    public void displayStops(){
        System.out.println("Train made" + madeStops + " stops and it took " + currTime + " to process all customers");
    }



}

