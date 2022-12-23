package com.ssp.apps.book.review.service;

import com.ssp.apps.book.review.entity.BookReview;
import com.ssp.apps.book.review.repository.BookReviewRepository;
import com.ssp.apps.crud.api.common.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class BookReviewService extends GenericService<BookReview, Long> {
    public BookReviewService(BookReviewRepository repository) {
        super(repository);
    }
}
