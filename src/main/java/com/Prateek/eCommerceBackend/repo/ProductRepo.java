package com.Prateek.eCommerceBackend.repo;

import com.Prateek.eCommerceBackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProductRepo extends JpaRepository <Product,Integer>{

}
