uQasarAdapter
=============

Generic uQasarAdapter


This project proposes an interface that has to be implemented by all third party  Systems that provide information to uQasar (e.g. JIRA,Sonar etc.)

Indicative methods that are proposed by uQasarAdapter are:


	query : invokes a specific query to a specified binded system-instance using the credentials of a specific user while in parallel it returns a list of measurements (metric-value)


----------------------------------------------------------------------

An initial list  of Metrics to be queried by the implemented Adaptees are:

	PROJECTS_PER_SYSTEM_INSTANCE

	ISSUES_PER_PROJECTS_PER_SYSTEM_INSTANCE

	FIXED_ISSUES_PER_PROJECT

	UNRESOLVED_ISSUES_PER_PROJECT

	UNRESOLVED_BUG_ISSUES_PER_PROJECT

	UNRESOLVED_TASK_ISSUES_PER_PROJECT

Note: This list will be extended according to the level of maturity of each implemented adapter
 

---------------------------------------------------------------------

uQasarAdapter manages certain uQuasarExceptionTypes


    BINDING_SYSTEM_CONNECTION_REFUSED (thrown when a binding system refuses the connection to the third party Adapter)

    BINDING_SYSTEM_BAD_URI_SYNTAX, (thrown when the binding system base url is malformed)

    UQASAR_NOT_EXISTING_METRIC (thrown when the queried metric is not a proper uQasarMetric)

