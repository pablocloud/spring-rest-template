package com.github.pablocloud.springresttemplate.services

import org.springframework.data.jpa.repository.JpaRepository

class ServiceAbstract<T> implements ServiceInterface<T> {

    protected JpaRepository<T, Long> repository

    @Override
    List<T> getAll() {
        repository.findAll()
    }

    @Override
    T getOneById(Long id) {
        repository.getOne(id)
    }

    @Override
    T insert(T t) {
        repository.save(t)
    }

    @Override
    T update(T t) {
        repository.save(t)
    }

    @Override
    Boolean delete(T t) {
        try{
            repository.delete(t)
            true
        }catch (Exception ignored){
            false
        }
    }

}
