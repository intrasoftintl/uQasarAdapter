package eu.uqasar.adapter.exception;


import eu.uqasar.adapter.model.BindedSystem;

public class uQasarException extends Exception {

    public enum UQasarExceptionType {
        UQASAR_DB_CONNECTION_REFUSED,
        BINDING_SYSTEM_CONNECTION_REFUSED,
        BINDING_SYSTEM_BAD_URI_SYNTAX,
        UQASAR_NOT_EXISTING_METRIC

    }

    public uQasarException(String message) {
        super(message);
    }

    public uQasarException(UQasarExceptionType uQasarExceptionType) {
        super(uQasarExceptionType.name());
    }


    public uQasarException(UQasarExceptionType uQasarExceptionType,BindedSystem bindedSystem,Throwable exceptionCause) {

         super(uQasarExceptionType.name() + " of Binded System:" + bindedSystem.getBindingInformation().getURI(),exceptionCause);

    }

    public uQasarException(UQasarExceptionType uQasarExceptionType,String metric) {

        super(uQasarExceptionType.name() + " : " + metric);

    }
}
