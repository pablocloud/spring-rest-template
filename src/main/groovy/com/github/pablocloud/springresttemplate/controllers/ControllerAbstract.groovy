package com.github.pablocloud.springresttemplate.controllers

import com.github.pablocloud.springresttemplate.services.ServiceInterface
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

class ControllerAbstract<T> implements ControllerInterface<T> {

    protected ServiceInterface<T> service

    @Override
    List<T> get() {
        service.getAll()
    }

    @Override
    T getOneById(@PathVariable Long id) {
        service.getOneById(id)
    }

    @Override
    T insert(@RequestBody T t) {
        service.insert(t)
    }

    @Override
    T update(@PathVariable Long id, @RequestBody T t) {
        service.update(t)
    }

    @Override
    Boolean delete(@PathVariable Long id, @RequestBody T t) {
        service.delete(t)
    }

}
