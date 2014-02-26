package eu.uqasar.adapter;

import eu.uqasar.adapter.exception.uQasarException;
import eu.uqasar.adapter.model.BindedSystem;
import eu.uqasar.adapter.model.User;
import eu.uqasar.adapter.query.QueryExpression;
import org.codehaus.jettison.json.JSONArray;

/**
 * uQasar System Adapter Interface
 */
public interface SystemAdapter {

    /*
     *   The query method accepts a System-specific query-Expression and Returns a UQasar-specific Result
     */
   public JSONArray query(BindedSystem bindedSystem, User user, QueryExpression queryExpression) throws uQasarException;

   public JSONArray query(String bindedSystemURL, String credentials, String queryExpression) throws uQasarException;

    }//EoClass SystemAdapter
