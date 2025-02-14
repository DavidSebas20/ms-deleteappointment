package com.example.deleteappointment.service;

import com.example.deleteappointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Eliminar una cita por ID
    public void deleteAppointment(Long id) {
        // Verificar si la cita existe
        if (!appointmentRepository.existsById(id)) {
            throw new RuntimeException("Appointment not found with ID: " + id);
        }

        // Eliminar la cita
        appointmentRepository.deleteById(id);
    }
}