package org.example.Actividad2.exception;

public class FileWithoutExtensionException extends Exception {

    private static final long serialVersionUID = 5995400511304261724L;


    public FileWithoutExtensionException() {
        super();
    }

    public FileWithoutExtensionException(String message) {
        super(message);
    }

    public FileWithoutExtensionException(Throwable cause) {
        super(cause);
    }

    public FileWithoutExtensionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileWithoutExtensionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
