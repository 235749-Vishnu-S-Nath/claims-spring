package com.ust.claims.api.specialist;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SpecialistService {

        @Autowired
        SpecialistRepository specialistRepository;
        @Autowired
        private ModelMapper modelMapper;
        public Specialist getSpecialistById(Integer id) {
            Specialist specialistById=specialistRepository.findById(id).orElseThrow(()-> new NoSuchElementException());
            return specialistById;
        }

        public SpecialistDto convertToDto(Specialist specialist) {
            return modelMapper.map(specialist, SpecialistDto.class);
        }

        public void saveSpecialist(Specialist specialist) {
            specialist.setCreatedDate(LocalDateTime.now());
            specialist.setModifiedDate(specialist.getCreatedDate());
            specialistRepository.save(specialist);
        }

        public List<Specialist> getAllSpecialist(Integer id) {
            List<Specialist> newSpecialist=specialistRepository.findAll();
            List<Specialist> updateSpecialist = new ArrayList<>();
            for(Specialist s:newSpecialist){
                if(s.getTreatment().getTreatmentId()==id){
                    updateSpecialist.add(s);
                }
            }
            return updateSpecialist;
        }

        public List<SpecialistDto> convertToDtoList(List<Specialist> specialistSet) {
            return  specialistSet.stream().map(e->modelMapper.map(e,SpecialistDto.class)).collect(Collectors.toList());
        }

        /*
    public List<Specialist> getSpecialistByTreatmentId(Integer id) {
        List<Specialist> specialistById=specialistRepository.findByTreatmentId(id);
        return specialistById;
    }

         */
}
