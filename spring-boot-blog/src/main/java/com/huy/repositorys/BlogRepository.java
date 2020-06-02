package com.huy.repositorys;

import com.huy.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    // hien thi cac bai viet thuoc 1 danh muc
    Page<Blog> findByCategory_Id(Integer id, Pageable pageable);
    List<Blog> findByCategory_Id(Integer id);
    Page<Blog> findAllByOrderByCreatedAtDesc(Pageable pageable);
    Page<Blog> findAllByTitleContainingOrderByCreatedAtDesc(String title,Pageable pageable);
    Page<Blog> findAllByTitleContaining(String title,Pageable pageable);
}
