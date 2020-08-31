package com.lysachenko;

import com.lysachenko.repository.NotebookRepository;
import com.lysachenko.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Hw20SpringDataApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(Hw20SpringDataApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        NotebookService notebookService = appContext.getBean(NotebookService.class);
        NotebookRepository notebookRepository = appContext.getBean(NotebookRepository.class);
        //notebookService.getAllOrderByManufacturer().forEach(System.out::println);

        //notebookRepository.getNotebooksByWasInUseTrue().forEach(System.out::println);
    }
}
