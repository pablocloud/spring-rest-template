package com.github.pablocloud.springresttemplate.controllers.impl

import com.github.pablocloud.springresttemplate.controllers.ControllerAbstract
import com.github.pablocloud.springresttemplate.domain.Person
import com.github.pablocloud.springresttemplate.services.impl.PersonServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/person", "/person/"])
class PersonControllerImpl extends ControllerAbstract<Person> {

    @Autowired
    PersonControllerImpl(PersonServiceImpl personService) {
        this.service = personService
    }

}
