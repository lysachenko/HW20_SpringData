package com.lysachenko.service;

import com.lysachenko.model.Notebook;
import com.lysachenko.repository.NotebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotebookService {

    private final NotebookRepository notebookRepository;

    @Autowired
    public NotebookService(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    public void save(Notebook notebook) {
        notebookRepository.save(notebook);
    }

    public void delete(Notebook notebook) {
        notebookRepository.delete(notebook);
    }

    public List<Notebook> getAll() {
        return notebookRepository.findAll();
    }

    public List<Notebook> getAllOrderByManufacturer() {
        return notebookRepository.getNotebooksOrderByManufacturer();
    }

    public List<Notebook> getNotebooksByMemoryAfter(int value) {
        return notebookRepository.getNotebooksByMemoryAfter(value);
    }

    public List<Notebook> getNotebooksByWasInUse() {
        return notebookRepository.getNotebooksByWasInUseTrue();
    }

    public Notebook getById(Long id) {
        return notebookRepository.getOne(id);
    }
}
