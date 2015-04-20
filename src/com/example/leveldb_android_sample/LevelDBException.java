package com.example.leveldb_android_sample;

public class LevelDBException extends RuntimeException{
    public LevelDBException() {
    }

    public LevelDBException(String error) {
        super(error);
    }

    public LevelDBException(String error, Throwable cause) {
    	
    }
}
