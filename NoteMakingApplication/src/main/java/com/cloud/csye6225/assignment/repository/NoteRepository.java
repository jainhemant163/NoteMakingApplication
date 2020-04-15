package com.cloud.csye6225.assignment.repository;

import com.cloud.csye6225.assignment.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jainh
 *
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
