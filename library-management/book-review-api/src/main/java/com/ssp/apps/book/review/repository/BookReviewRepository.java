package com.ssp.apps.book.review.repository;

import com.ssp.apps.book.review.entity.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview, Long> {
}
