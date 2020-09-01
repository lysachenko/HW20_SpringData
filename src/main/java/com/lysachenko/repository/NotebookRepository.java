package com.lysachenko.repository;

import com.lysachenko.model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {

    List<Notebook> getNotebooksByMemoryAfter(int value);

    @Query(value = "SELECT n from Notebook n order by n.manufacturer")
    List<Notebook> getNotebooksOrderByManufacturer();

    List<Notebook> getNotebooksByWasInUseTrue();
}
