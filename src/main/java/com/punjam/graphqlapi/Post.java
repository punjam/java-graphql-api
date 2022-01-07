package com.punjam.graphqlapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
