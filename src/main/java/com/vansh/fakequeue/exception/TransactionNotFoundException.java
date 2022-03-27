package com.vansh.fakequeue.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(String message){
        super(message);
    }
}
