package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Paiment;
import tn.esprit.autoloc.repositories.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaimentService implements IPaimentService {

    private PaimentRepository paimentRepository;


    public Paiment addPaiment(Paiment paiment) {
        return paimentRepository.save(paiment);
    }


    public List<Paiment> getAllPaiments() {
        return paimentRepository.findAll();
    }


    public Paiment updatePaiment(Paiment paiment) {
        return paimentRepository.save(paiment);
    }


    public void deletePaiment(Long idPaiment) {
        paimentRepository.deleteById(idPaiment);
    }
}