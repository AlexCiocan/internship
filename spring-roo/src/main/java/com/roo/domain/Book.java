package com.roo.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Book {

    /**
     */
    @NotNull
    private String title;

    /**
     */
    @NotNull
    private String author;

    /**
     */
    @NotNull
    private String isbn;
}
