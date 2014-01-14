package eu.uqasar.adapter;

import eu.uqasar.adapter.exception.uQasarException;
import eu.uqasar.adapter.model.BindedSystem;
import eu.uqasar.adapter.model.Measurement;
import eu.uqasar.adapter.model.User;
import eu.uqasar.adapter.query.QueryExpression;

import java.util.List;

/**
 * uQasar System Adapter Interface
 */
public interface SystemAdapter {


    /*
     *  Every uQasar System Adapter is considered to handle multiple bindings to physical installations.
     *  The specific method registers a binding to the Adapter. e.g. http://test.jira.eu/testinstallation.
     *
     *
     *  Add a user credentials to specified BindedSystem
     *  Returns the id_user that is binded with the BindedSystem
     *
     *  BindedSystem & User have a one to one relationship
     */
    public   BindedSystem addSystemBindingInformation(BindedSystem bindedSystem, User user) throws uQasarException;


    /*
     *  The specific method returns the valid BindedSystems that have been configured for this adapter
     */
    public List<BindedSystem> getBindedSystems() throws uQasarException;

    /*
     *   The query method accepts a System-specific query-Expression and Returns a UQasar-specific Result
     */
   public List<Measurement> query(BindedSystem bindedSystem, User user, QueryExpression queryExpression) throws uQasarException;

}//EoClass SystemAdapter
