package com.kursova.kep.access.rest;

import com.kursova.kep.access.jpa.AccessDAO;
import com.kursova.kep.entity.BaseEntity;
import com.kursova.kep.exception.ExceptionMySQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * by Mr Skip on 31.03.2016.
 */

public class RestBase<S extends BaseEntity>{
    private Logger log = LoggerFactory.getLogger(getClass());

    private AccessDAO accessDAO;
    private String objectName = "entry";

    public RestBase(AccessDAO accessDAO){
        this.accessDAO = accessDAO;
        objectName = ((Class<S>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])
                .getSimpleName();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<S> update(@RequestBody S s) {
        S update;
        try {
            update = (S) accessDAO.update(s);
            if (update == null){
                log.info("Updated `" + objectName + "` false with id '{}'", s.getId());
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (ExceptionMySQL e){
            log.info("Updated `" + objectName + "` false with id '{}' , error: {}", s.getId(), e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .header("MySQL Exception", e.getMessage())
                    .body(null);
        }
        return ResponseEntity.ok(update);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            accessDAO.delete(id);
        } catch (ExceptionMySQL e){
            log.info("Deleted `" + objectName + "` false with id '{}' , error: {}", id, e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .header("MySQL Exception", e.getMessage())
                    .build();
        }
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<S> getOne(@PathVariable Long id) {
        S find;
        try {
            find = (S) accessDAO.getOne(id);
        } catch (ExceptionMySQL e){
            log.info("Not fount `" + objectName + "` with id '{}' , error: {}", id, e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .header("MySQL Exception", e.getMessage())
                    .body(null);
        }
        return ResponseEntity.ok(find);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<S>> getAll() {
        List<S> list = accessDAO.getAll();
        if (list.isEmpty()){
            log.info("Not fount any record in `" + objectName + "`.");
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body(null);
        }
        return ResponseEntity.ok(list);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<S> save(@RequestBody S s) {
        S save;
        try {
            save = (S) accessDAO.save(s);
        } catch (ExceptionMySQL e){
            log.info("Not fount `" + objectName + "` with id '{}' , error: {}", s.getId(), e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .header("MySQL Exception", e.getMessage())
                    .body(null);
        }
        return ResponseEntity.ok(save);
    }
}
