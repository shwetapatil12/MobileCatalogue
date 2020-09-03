package com.application.MobileCatalogue.repo;


import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.application.MobileCatalogue.model.Mobile;
@Repository
public interface MobileRepo extends CouchbaseRepository<Mobile, String> {

}
