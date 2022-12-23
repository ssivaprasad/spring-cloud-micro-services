package com.ssp.apps.book.review.controller;

import com.ssp.apps.book.review.dto.BookReviewDto;
import com.ssp.apps.book.review.entity.BookReview;
import com.ssp.apps.book.review.mapper.BookReviewMapper;
import com.ssp.apps.book.review.service.BookReviewService;
import com.ssp.apps.crud.api.common.controller.GenericController;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class BookReviewController extends GenericController<BookReview, Long, BookReviewDto> {
    public BookReviewController(BookReviewService service) {
        super(service, Mappers.getMapper(BookReviewMapper.class));
    }
}
