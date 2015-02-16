package eu.uqasar.adapter.exception;


import eu.uqasar.adapter.model.BindedSystem;

public class uQasarException extends Exception {

    public enum UQasarExceptionType {

        BINDING_SYSTEM_CONNECTION_REFUSED,
        BINDING_SYSTEM_BAD_URI_SYNTAX,
        UQASAR_NOT_EXISTING_METRIC, 
        ERROR_PARSING_JSON

    }
    /*
    * Comment this override in order to print full Exception StackTrace
    * */
    @Override
    public Throwable fillInStackTrace() {
        return null;
    }

    public uQasarException(String message) {
        super(message);
    }

    public uQasarException(UQasarExceptionType uQasarExceptionType) {
        super(uQasarExceptionType.name());
    }

    public uQasarException(UQasarExceptionType uQasarExceptionType,BindedSystem bindedSystem,Throwable exceptionCause) {

         super(uQasarExceptionType.name() + " of Binded System:" + bindedSystem.getUri(),exceptionCause);

    }

    public uQasarException(UQasarExceptionType uQasarExceptionType,String metric) {

        super(uQasarExceptionType.name() + " : " + metric);

    }
  
    public uQasarException(String message, Throwable exceptionCause) {
         super(message + exceptionCause);
    }
}
