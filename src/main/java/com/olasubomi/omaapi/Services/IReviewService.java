package com.olasubomi.omaapi.Services;

import com.olasubomi.omaapi.Model.Review;

public interface IReviewService {
    Review createReview(String reviewBody, String imdbId);
}
