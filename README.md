uQasarAdapter
=============

Generic uQasarAdapter


uQasarAdapter proposes an interface to be implemented by all interesed System Adapters (ex. JiraAdapter,SonarAdapter...etc)

the methods the uQasarAdapter proposes are:

addSystemBindingInformation : add a quality control system instance (Jira,sonar..etc) at uQasarBinding database

getBindedSystems : retrieve all binded Instances that are registered at uQasarBinding database

query : invokes a specific query to a specified bindedSystem using the credentials of a specific user and 
returns a list of measurements depending on the metric the query contains


----------------------------------------------------------------------

uQasarAdapter proposes a serie of Metrics to by queried by the interpreter Adapters:

    RESOURCES_PER_BINDING

    ISSUES_PER_RESOURCE_PER_BINDING

    FIXED_ISSUES

    UNRESOLVED_ISSUES

    UNRESOLVED_BUG_ISSUES

    UNRESOLVED_TASK_ISSUES
 

---------------------------------------------------------------------

uQasarAdapter manages certain uQuasarExceptionTypes

UQASAR_DB_CONNECTION_REFUSED (when the is a problem with uQuasar database connection)

BINDING_SYSTEM_CONNECTION_REFUSED (when a binding system refuses the connection to the JiraAdapter)

BINDING_SYSTEM_BAD_URI_SYNTAX, (when the binding system base url is mal formed)

UQASAR_NOT_EXISTING_METRIC (when the queried metric is not an uQuasarMetric)

--------------------------------------------------------------------
