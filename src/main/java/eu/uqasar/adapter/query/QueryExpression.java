package eu.uqasar.adapter.query;

/*
 *  The query str represents the System-specific query that is
 */
public abstract class QueryExpression {

    String query;

    protected QueryExpression(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}//EoClass QueryExpression
