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
  /**
   * The query method accepts a System-specific query-Expression and
   * Returns a UQasar-specific Result
   *
   * @param bindedSystem The adapted system
   * @param user The credentials needed to access the system
   * @param queryExpression The (uQuasar-specific) query to send to the system.
   */
  public  List<Measurement> query(BindedSystem bindedSystem, User user,
                                  QueryExpression queryExpression) throws uQasarException;
  
  /**
   * The query method accepts a System-specific query-Expression and
   * returns a UQasar-specific Result
   *
   * @param bindedSystem The URL of the adapted system
   * @param credentials The credentials needed to access the adapted system.
            The syntax is adapter specific.
   * @param queryExpression The query to send to the adapted system. The syntax is:
   *        <uquasar_metric_name> [, <<uquasar_metric_name>, ...]
   *
   * @return List containing Measurement objects. Measurement.measurement is JSON-Formatted data,
   *         the structure is adapter specific.
   */
  public List<Measurement> query(String bindedSystemURL, String credentials, String queryExpression) throws uQasarException;
}//EoClass SystemAdapter
