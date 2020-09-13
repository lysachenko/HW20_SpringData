package com.lysachenko.service;

import com.lysachenko.model.Notebook;
import com.lysachenko.repository.NotebookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotebookService {

    private final NotebookRepository notebookRepository;

    public void save(Notebook notebook) {
        notebookRepository.save(notebook);
    }

    public void update(Notebook notebook) {
        Notebook notebookFromDB = notebookRepository.getOne(notebook.getId());
        notebookFromDB.setModel(notebook.getModel());
        notebookFromDB.setManufacturer(notebook.getManufacturer());
        notebookFromDB.setProcessor(notebook.getProcessor());
        notebookFromDB.setMemory(notebook.getMemory());
        notebookFromDB.setWasInUse(notebook.isWasInUse());
        notebookFromDB.setHullType(notebook.getHullType());
        notebookFromDB.setPrice(notebook.getPrice());
        notebookFromDB.setDateOfIssue(notebook.getDateOfIssue());
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
