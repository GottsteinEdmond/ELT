package com.example.smartcatinterview.mapper;

import java.util.List;

public abstract class EntityMapper<T, U> {

    public List<U> map(final List<T> input) {
        return mapToOutput(input);
    }

    protected abstract List<U> mapToOutput(final List<T> input);
}
