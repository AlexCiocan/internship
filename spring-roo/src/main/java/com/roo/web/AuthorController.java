package com.roo.web;
import com.roo.domain.Author;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/authors")
@Controller
@RooWebScaffold(path = "authors", formBackingObject = Author.class)
public class AuthorController {
}
