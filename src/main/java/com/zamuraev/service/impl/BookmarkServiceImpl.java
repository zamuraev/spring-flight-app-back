package com.zamuraev.service.impl;

import com.zamuraev.models.Bookmark;
import com.zamuraev.repository.BookmarkRepository;
import com.zamuraev.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookmarkServiceImpl implements BookmarkService {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Override
    public Bookmark addBookmark(Bookmark bookmark) {
        return bookmarkRepository.save(bookmark);
    }

    @Override
    public List<Bookmark> getBookmarkList(String userName) {
        return bookmarkRepository.getBookmarkList(userName);
    }

    @Override
    public void deleteBookmark(Long idBookmark) {
        bookmarkRepository.deleteById(idBookmark);
    }

}
