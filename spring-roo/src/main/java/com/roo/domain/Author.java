package com.roo.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Author {

    /**
     */
    @NotNull
    private String lastName;

    /**
     */
    @NotNull
    private String firstName;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date birthDate;

    /**
     */
    @NotNull
    private int author_id;

    /**
     */
    @NotNull
    @Column(name = "id", unique = true)
    private Integer id;
}
