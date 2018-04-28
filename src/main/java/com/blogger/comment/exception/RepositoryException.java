package com.blogger.comment.exception;

/**
 * It is designed to handle all Exception on DAO layer operations.
 *
 * @author Rohit
 */
public class RepositoryException extends ServiceException {

    private static final long serialVersionUID = -3068271122911679640L;

    /**
     * The default constructor
     */
    public RepositoryException() {
        super();
    }

    /**
     * @param message The error message for this exception
     */
    public RepositoryException(final String message) {
        super(message);
    }

    /**
     * constructor Which construct object with variables and messages.
     *
     * @param message The error message for this exception
     */
    public RepositoryException(final String message, final Object... args) {
        super(message, args);
    }

    /**
     * constructor which construct object with messages and Actual exception.
     *
     * @param message The error message for this exception.
     * @param exception The root exception that was triggered originally .
     */
    public RepositoryException(final String message,
            final Throwable exception) {
        super(message, exception);
    }

    /**
     * constructor which construct object with messages and Actual exception.
     *
     * @param message The error message for this exception.
     * @param exception The root exception that was triggered originally .
     * @param Object Object array of arguments for message.
     */
    public RepositoryException(final String message, final Throwable exception,
            final Object... args) {
        super(message, exception, args);
    }
}