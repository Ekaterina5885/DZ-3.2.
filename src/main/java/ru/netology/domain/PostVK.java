package ru.netology.domain;

import ru.netology.Like;
import ru.netology.ViewsInfo;

public class PostVK {
    private int id;
    private String fromId;
    private int ownerId; // поле из документации;
    private int createdBy; // поле из документации;
    private int replyOwnerId; // поле из документации;
    private int replyPostId; // поле из документации;
    private boolean friendsOnly;
    private String date;
    private String text;
    private String postType;
    private String imageUrl;
    private String videoUrl;
    private String linkUrl;
    private Like like;
    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private Repost repost;
    private Geo geo;
    private PostSourse postSourse; // поле из документации;
    private int signerId; // поле из документации;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds; // поле из документации;
    private boolean isFavorite; // поле из документации;
    private boolean postponedId; // поле из документации;

// + get/set на все поля
}
