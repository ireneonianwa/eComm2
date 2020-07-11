package com.tts.eCommerce.repository;

import java.io.Serializable;

import javax.naming.Referenceable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.tts.eCommerce.ECommApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tts.eCommerce.entity.Account;

@Transactional
@Repository
public interface AccountRepository extends Referenceable, Serializable {
	
	@Autowired
    private SessionFactory sessionFactory;

    public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }

}


