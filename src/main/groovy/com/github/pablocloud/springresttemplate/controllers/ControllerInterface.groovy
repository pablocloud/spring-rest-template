package com.github.pablocloud.springresttemplate.controllers

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

interface ControllerInterface<T> {

    @RequestMapping(value = ["", "/"], method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<T> get()

    @RequestMapping(value = ["/{id}", "/{id}/"], method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T getOneById(@PathVariable Long id)

    @RequestMapping(value = ["", "/"], method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T insert(@RequestBody T t)

    @RequestMapping(value = ["/{id}", "/{id}/"], method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T update(@PathVariable Long id, @RequestBody T t)

    @RequestMapping(value = ["/{id}", "/{id}/"], method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Boolean delete(@PathVariable Long id, @RequestBody T t)

}