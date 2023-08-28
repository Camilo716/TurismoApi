package com.example.TurismoApi.Validators;

import java.util.List;

public class ListSizeRangeValidator<T> implements  IValidable<List<T>>{
    int minSize;
    int maxSize;

    public ListSizeRangeValidator(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @Override
    public Boolean validate(List<T> users) throws Exception {
        boolean maxSizeReached = users.size() <= maxSize;

        if (maxSizeReached)
            throw new Exception("Users per reservation can not be higher than " + maxSize);

        return true;
    }
}
