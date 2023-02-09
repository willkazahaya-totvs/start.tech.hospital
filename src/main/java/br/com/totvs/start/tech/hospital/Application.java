package br.com.totvs.start.tech.hospital;

import br.com.totvs.start.tech.hospital.entity.Hospital;
import br.com.totvs.start.tech.hospital.entity.Medico;
import br.com.totvs.start.tech.hospital.service.HospitalServiceImpl;
import br.com.totvs.start.tech.hospital.service.MedicoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		List<Hospital> listHospitals = new ArrayList<>();
		List<Medico> listMedico = new ArrayList<>();

		SpringApplication.run(Application.class, args);

		HospitalServiceImpl hospitalService = new HospitalServiceImpl();
		MedicoServiceImpl medicoService = new MedicoServiceImpl();
	}

}
