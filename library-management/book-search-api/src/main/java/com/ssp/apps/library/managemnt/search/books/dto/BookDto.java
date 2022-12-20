package com.ssp.apps.library.managemnt.search.books.dto;

import java.util.ArrayList;
import java.util.List;

public class BookDto {
    private Long id;

    private String name;
    private String author;
    private String format;
    private double price;

    private List<String> reviews = new ArrayList<>();
}
