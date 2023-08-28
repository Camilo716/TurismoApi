package com.example.TurismoApi.Validators;

public interface IValidable<T> {
    Boolean validate(T input) throws Exception;
}
