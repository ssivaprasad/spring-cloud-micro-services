package com.ssp.apps.book.review.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookReviewDto {

    private long id;

    private long bookId;

    private String userName;
    private String rating;
    private String comment;

}
