import eu.uqasar.adapter.model.BindedSystem;
import eu.uqasar.adapter.model.HibernateConnector;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/14/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateConnectorTest {


    @Test
    public void getBindedSystemsTest(){

    HibernateConnector hibernateConnector = new HibernateConnector();
    List<BindedSystem> bindedSystems = hibernateConnector.getBindedSystems();
    System.out.println("---BindedSystems---");
    for (BindedSystem bindedSystem : bindedSystems) {
        System.out.println("     ----     ");
        System.out.println(bindedSystem.getUri());
        System.out.println(bindedSystem.getUser().getUsername());
    }
    }

}