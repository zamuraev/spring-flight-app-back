package com.zamuraev.repository.impl;

import com.zamuraev.models.Bookmark;
import com.zamuraev.repository.BookmarkRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookmarkRepositoryImpl implements BookmarkRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Bookmark> getBookmarkList(String userName) {
        CriteriaBuilder cbuild = entityManager.getCriteriaBuilder();
        CriteriaQuery<Bookmark> cquery = cbuild.createQuery(Bookmark.class);
        Root<Bookmark> bookmark = cquery.from(Bookmark.class);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cbuild.equal(bookmark.get("account").get("username"),userName));
        return entityManager.createQuery(cquery).getResultList();
    }
}
