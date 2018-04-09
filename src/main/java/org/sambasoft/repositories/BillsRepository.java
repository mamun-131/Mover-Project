package org.sambasoft.repositories;

import org.sambasoft.entities.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kamrulislam on 8/4/18.
 */
public interface BillsRepository extends JpaRepository <Bills, Long> {
}
