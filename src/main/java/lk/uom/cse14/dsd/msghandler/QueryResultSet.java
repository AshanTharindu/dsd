package lk.uom.cse14.dsd.msghandler;

import java.util.ArrayList;

public class QueryResultSet {
    private RoutingEntry routingEntry;
    private ArrayList<String> fileNames;

    public QueryResultSet(){
        this.fileNames = new ArrayList<>();
    }

    public RoutingEntry getRoutingEntry() {
        return routingEntry;
    }

    public void setRoutingEntry(RoutingEntry routingEntry) {
        this.routingEntry = routingEntry;
    }

    public ArrayList<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(ArrayList<String> fileNames) {
        this.fileNames = fileNames;
    }
}
