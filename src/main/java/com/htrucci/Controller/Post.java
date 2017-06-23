package com.htrucci.Controller;


import groovy.transform.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


/**
 * Created by 201410089 on 2017-06-22.
 */

//@TableGenerator(name = "POST", table = "POST", pkColumnName = "ID")
@EqualsAndHashCode
@Entity
public class Post {



    @Id
    @GeneratedValue
    @Getter @Setter
    int id;
    @Getter @Setter
    String subject;

    @Column(columnDefinition = "text")
    @Getter @Setter
    String content;

    @Getter @Setter
    Date regDate;

}
