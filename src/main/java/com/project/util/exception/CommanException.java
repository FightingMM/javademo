package com.project.util.exception;

/**
 * @author Aiden
 * @date 2022/06/27 9:39
 */
public class CommanException extends RuntimeException {

    public CommanException(){
        super();
    }

    public CommanException(String message){
        super(message);
    }

    public CommanException(String message, Throwable cause) {
        super(message, cause);
    }

}
