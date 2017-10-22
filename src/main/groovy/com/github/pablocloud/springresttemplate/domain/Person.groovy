package com.github.pablocloud.springresttemplate.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Person implements Serializable {

    @Id
    @GeneratedValue
    Long id

    String name
    String surnames

}
