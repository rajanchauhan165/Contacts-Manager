package com.cm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cm.Model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
