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
     *   The query method accepts a System-specific query-Expression and Returns a UQasar-specific Result
     */
   public List<Measurement> query(BindedSystem bindedSystem, User user, QueryExpression queryExpression) throws uQasarException;

   public List<Measurement> query(String bindedSystemURL, String credentials, String queryExpression) throws uQasarException;

    }//EoClass SystemAdapter
