package com.zamuraev.repository;

import com.zamuraev.models.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark,Long>,BookmarkRepositoryCustom{
}
