package org.sambasoft.repositories;

import org.sambasoft.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Orders, Long>{

}
