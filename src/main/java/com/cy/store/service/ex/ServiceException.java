package com.cy.store.service.ex;

/**
 * 业务层异常的基类 ：throws new ServiceException()
 */
public class ServiceException extends RuntimeException{
    public ServiceException() {
        super();
    }

    /**
     * 常用以下2种
     */
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
