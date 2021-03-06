package lk.uom.cse14.dsd.comm.response;

import lk.uom.cse14.dsd.msghandler.QueryResultSet;
import lk.uom.cse14.dsd.msghandler.RoutingEntry;

public class QueryResponse extends Response {
    private QueryResultSet queryResultSet;
    public QueryResponse(String source, int sourcePort, String destination, int destinationPort) {
        super(source, sourcePort, destination, destinationPort);
    }

    public QueryResultSet getQueryResultSet() {
        return queryResultSet;
    }

    public void setQueryResultSet(QueryResultSet queryResultSet) {
        this.queryResultSet = queryResultSet;
    }
}
