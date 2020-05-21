package com.huy.repositorys;

import com.huy.models.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class BlogRepositoryImp implements BlogRepository {
    @PersistenceContext
    private EntityManager entityManager;
    TypedQuery<Blog> query;

    @SuppressWarnings("unchecked")
    @Override
    public List<Blog> getAll() {
       // query = entityManager.createQuery("select blog from Blog blog", Blog.class);
      //  return query.getResultList();

        // dung @NamedQuery : khai bao NamedQuery tai models.Blog
       Query query =  entityManager.createNamedQuery("getAllBlog");
       return query.getResultList();
    }

    @Override
    public Blog getById(Integer idBlog) {
        query = entityManager.createQuery("select blog from Blog blog where blog.id=:id", Blog.class);
        query.setParameter("id", idBlog);
        return query.getSingleResult();
    }

    @Override
    public void create(Blog blog) {
        if (blog.getId() != null) {
            entityManager.merge(blog);
        } else {
            entityManager.persist(blog);
        }
    }

    @Override
    public void delete(Integer idBlog) {
        Blog blog = getById(idBlog);
        if(blog != null){
            entityManager.remove(blog);
        }
    }
}
