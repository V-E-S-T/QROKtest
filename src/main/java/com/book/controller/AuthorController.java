package com.book.controller;

import com.book.dto.AuthorDTO;
import com.book.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/author/info/short/{id}")
    public String getAuthorInfo(@PathVariable("id") int id) {

        //ModelAndView mv = new ModelAndView("authorInfo");
        //mv.addObject("title", "Author Info");

        AuthorDTO authorDTO = new AuthorDTO(authorService.get(id));

        //mv.addObject("authorDTO", authorDTO);

        return authorDTO.getAuthorInfo();
    }
}
