package com.github.pablocloud.springresttemplate.services

interface ServiceInterface<T> {

    List<T> getAll()

    T getOneById(Long id)

    T insert(T t)

    T update(T t)

    Boolean delete(T t)

}
