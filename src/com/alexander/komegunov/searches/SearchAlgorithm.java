package com.alexander.komegunov.searches;

public interface SearchAlgorithm {
    <T extends Comparable<T>> int find(T[] array, T key);
}
