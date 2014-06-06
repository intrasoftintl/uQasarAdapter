package eu.uqasar.adapter.model;


public enum uQasarMetric {
    PROJECTS_PER_SYSTEM_INSTANCE ,
    ISSUES_PER_PROJECTS_PER_SYSTEM_INSTANCE,
    FIXED_ISSUES_PER_PROJECT,
    UNRESOLVED_ISSUES_PER_PROJECT,
    UNRESOLVED_BUG_ISSUES_PER_PROJECT,
    UNRESOLVED_TASK_ISSUES_PER_PROJECT,
    
    //  Source code metrics
    NCLOC,                         // lines of code (NC=non comment)
    STATEMENTS,                    // number of statements
    DUPLICATED_LINES,              // number of duplicated lines
    DUPLICATED_LINES_DENSITY,      // the density of duplicated lines (number in [0..100])
    COMPLEXITY,                    // cyclomatic complexity of the project
    UT_COVERAGE,                   // code coverage by unit tests
    AT_COVERAGE,                   // code coverage by acceptance tests
    TEST_SUCCESS_DENSITY,           // ratio of successfully executed tests to the overall number of tests
    
        //Testing framework metrics
    TEST_P,	// executed tests with result: PASSED
    TEST_F,	// executed tests with result: FAILED
    TEST_B,	// executed tests with result: BLOCKED
    TEST_N,	// executed tests with result: NOT RUN
    TEST_TOTAL	// total tests cases
}

