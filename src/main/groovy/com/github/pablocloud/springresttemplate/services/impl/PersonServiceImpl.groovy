package com.github.pablocloud.springresttemplate.services.impl

import com.github.pablocloud.springresttemplate.domain.Person
import com.github.pablocloud.springresttemplate.repositories.PersonRepository
import com.github.pablocloud.springresttemplate.services.ServiceAbstract
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl extends ServiceAbstract<Person> {

    @Autowired
    PersonServiceImpl(PersonRepository personRepository) {
        this.repository = personRepository
    }

}
