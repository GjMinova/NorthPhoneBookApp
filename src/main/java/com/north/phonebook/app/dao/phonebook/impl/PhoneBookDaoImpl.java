package com.north.phonebook.app.dao.phonebook.impl;

import com.north.phonebook.app.dao.phonebook.PhoneBookDao;
import com.north.phonebook.app.entity.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PhoneBookDaoImpl implements PhoneBookDao {

    private final EntityManager entityManager;

    @Autowired
    public PhoneBookDaoImpl(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<PhoneBook> findContacts(String name, String phoneNumber) {
//        final CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        final CriteriaQuery<PhoneBook> cq = cb.createQuery(PhoneBook.class);
//        Root<PhoneBook> root = cq.from(PhoneBook.class);
//        final List<Predicate> predicateList = new ArrayList<>();
//        name.ifPresent(value -> predicateList.add(cb.like(root.get("name"), value)));
//        phoneNumber.ifPresent(value -> predicateList.add(cb.equal(root.get("phoneNumber"), value)));
//        cq.select(root).where(predicateList.toArray(new Predicate[0]));
//        final Query query = entityManager.createQuery(cq);
//        return query.getResultList();

        return null;
    }
}
