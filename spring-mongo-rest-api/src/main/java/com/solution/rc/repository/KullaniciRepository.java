package com.solution.rc.repository;

import com.solution.rc.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici, String> {

}
