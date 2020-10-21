package com.alexander.komegunov.streams;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Main {

    interface Book {
        String getCategory();
        int getPrice();
    }

    static Map<String, Integer> getLowestBookPriceByCategory(List<Book> list) {
        return list.stream().collect(Collectors.toMap(Book::getCategory, Book::getPrice,
                BinaryOperator.minBy(Comparator.naturalOrder())));
    }
}
