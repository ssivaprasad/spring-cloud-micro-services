package com.ssp.apps.book.review.mapper;

import com.ssp.apps.book.review.dto.BookReviewDto;
import com.ssp.apps.book.review.entity.BookReview;
import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BookReviewMapper extends GenericMapper<BookReview, BookReviewDto> {
}
