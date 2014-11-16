package com.ecommerce.subhaay.service.database.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jumange on 11/14/14.
 */
@Document
public class Comment implements Serializable {

    private static final long serialVersionUID = -7788619177798333712L;
    @Id
    private String id;
    private String commentDescription;
    private double rating;
    private String ratersName;
    private Date ratedTimeStamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRatersName() {
        return ratersName;
    }

    public void setRatersName(String ratersName) {
        this.ratersName = ratersName;
    }

    public Date getRatedTimeStamp() {
        return ratedTimeStamp;
    }

    public void setRatedTimeStamp(Date ratedTimeStamp) {
        this.ratedTimeStamp = ratedTimeStamp;
    }
}