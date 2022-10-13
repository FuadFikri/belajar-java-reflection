package com.fikri.data;

public class Data<T ,Z extends AutoCloseable>  {

    private T data;

    public T getData() {
        return data;
    }

    public Data() {
    }

    public void setData(T data) {

        this.data = data;
    }
}
