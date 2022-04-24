package com.zamuraev.service;

import com.zamuraev.models.Bookmark;
import java.util.List;

public interface BookmarkService {
    Bookmark addBookmark(Bookmark bookmark);
    List<Bookmark> getBookmarkList(String userName);
    void deleteBookmark(Long idBookmark);
}
