package eu.uqasar.adapter.model;


public enum uQasarMetric {
    PROJECTS_PER_SYSTEM_INSTANCE ,
    ISSUES_PER_PROJECTS_PER_SYSTEM_INSTANCE,
    FIXED_ISSUES_PER_PROJECT,
    UNRESOLVED_ISSUES_PER_PROJECT,
    UNRESOLVED_BUG_ISSUES_PER_PROJECT,
    UNRESOLVED_TASK_ISSUES_PER_PROJECT,

    //  Source code metrics
    NCLOC,                    // lines of code (NC=non comment)
    LINES,                    // lines (i.e. all lines)
    COMMENT_LINES,            // number of comment lines
    STATEMENTS,               // number of statements
    CLASSES,                  // number of classes
    FILES,                    // number of files
    DIRECTORIES,              // number of directories
    FUNCTIONS,                // number of functions
    COMMENT_LINES_DENSITY,    // the density of comment lines (number in [0..100])

    DUPLICATED_LINES,         // number of duplicated lines
    DUPLICATED_LINES_DENSITY, // the density of duplicated lines (number in [0..100])
    COMPLEXITY,               // cyclomatic complexity of the project
    FUNCTION_COMPLEXITY,      // the average cyclomatic complexity of a function
    FILE_COMPLEXITY,          // the average cyclomatic complexity of a source code file
    CLASS_COMPLEXITY,         // the average cyclomatic complexity of a class
    UT_COVERAGE,              // code coverage by unit tests
    AT_COVERAGE,              // code coverage by acceptance tests
    OVERALL_COVERAGE,         // code coverage by both, unit and acceptance tests
    PACKAGE_TANGLES,          // Number of file dependencies to cut in order to remove all cycles between directories.
    PACKAGE_TANGLE_INDEX,     // Level of directory interdependency. Best value (0%) means that there is no cycle and worst value (100%) means that directories are really tangled.
    TEST_SUCCESS_DENSITY,     // ratio of successfully executed tests to the overall number of te
    TEST_FAILURES,            // number of failed tests (failure = test could be run and is failed)
    TEST_ERRORS,              // number of errored tests (error = test could not be run)
    TESTS,                     // number of tests
    
    // Cubes expression metrics
    AGGREGATE,
    FACT,
    MEMBERS,
    CUBES,
    MODEL,
    CELL,
    FACTS,
    
    // Gitlab metrics
    GIT_COMMITS,			  // Gitlab commits
    GIT_PROJECTS,			  // Gitlab projects
}

