package edu.mum.cs.cs425.demos.elibrarydemocrudweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.service.IBookService;

@Controller
public class BookController {
	
	private IBookService bookService;
	
	@Autowired
	public BookController(IBookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping(value = "/elibrary/book/list")
	public ModelAndView displayAllBooks() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("books", bookService.getAllBooks());
		mav.setViewName("book/list");
		return mav;
	}

}
