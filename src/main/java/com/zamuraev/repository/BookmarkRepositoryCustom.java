package com.zamuraev.repository;

import com.zamuraev.models.Bookmark;
import java.util.List;

public interface BookmarkRepositoryCustom {
    List<Bookmark> getBookmarkList(String userName);
}
