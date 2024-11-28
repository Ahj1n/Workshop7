/**********************************************
 Workshop 7
 Course:APD545 - FALL
 Last Name: Balite
 First Name: Franz
 ID: 142546209
 Section: NAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date:2024-11-28
 **********************************************/

package com.apd545.workshop7.repository;

import com.apd545.workshop7.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
