package com.dynastymasra.service;

import com.dynastymasra.domain.Form;

import java.util.List;

/**
 * Name : Dimas Ragil T
 * FB   : Dimas Ragil T
 * Twit : @dynastymasra
 * Email: dynastymasra@gmail.com
 * Date : 6/11/13
 * Time : 11:00 AM
 */

public interface FormService {
    void save(Form form);
    Form update(Integer id, Form form);
    void delete(Form form);
    void delete(Integer id);
    List<Form> findAll();
    Form findById(Integer id);
}
