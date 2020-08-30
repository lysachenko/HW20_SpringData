package com.lysachenko.controller;

import com.lysachenko.model.Notebook;
import com.lysachenko.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notebooks")
public class NotebookController {

    private final NotebookService notebookService;

    @Autowired
    public NotebookController(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @GetMapping
    public List<Notebook> getAll() {
        return notebookService.getAll();
    }

    @GetMapping("ordered-by-manufacturer")
    public List<Notebook> getAllOrderByManufacturer() {
        return notebookService.getAllOrderByManufacturer();
    }

    @GetMapping("memory")
    public List<Notebook> getNotebookThereMemoryMore(@RequestParam("value") int value) {
        return notebookService.getNotebooksByMemoryAfter(value);
    }
}
