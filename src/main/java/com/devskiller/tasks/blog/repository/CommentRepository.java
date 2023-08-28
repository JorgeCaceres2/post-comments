package com.devskiller.tasks.blog.repository;

import com.devskiller.tasks.blog.model.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByPostIdOrderByCreationDateDesc (Long postId);

}
