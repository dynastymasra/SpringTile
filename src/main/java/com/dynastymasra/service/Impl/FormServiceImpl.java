package com.dynastymasra.service.Impl;

import com.dynastymasra.domain.Form;
import com.dynastymasra.service.FormService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * User : Dynastymasra
 * Name : Dimas Ragil T
 * Email: dynastymasra@gmail.com
 * Date : 6/11/13
 * Time : 11:43 AM
 */

@Service
@Transactional
public class FormServiceImpl implements FormService {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public void save(Form form) {
        //To change body of implemented methods use File | Settings | File Templates.
        entityManager.persist(form);
    }

    @Override
    public Form update(Integer id, Form form) {
        Form oldForm = findById(id);
        oldForm.setNim(form.getNim());
        oldForm.setName(form.getName());
        oldForm.setEmail(form.getEmail());
        oldForm.setInterest(form.getInterest());
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Form form) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Integer id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Form> findAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Form findById(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
