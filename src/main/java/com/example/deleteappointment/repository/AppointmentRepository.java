package com.example.deleteappointment.repository;

import com.example.deleteappointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    void deleteById(Long id);
}
