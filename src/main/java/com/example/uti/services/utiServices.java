package com.example.uti.services;

import com.example.uti.entity.utiEntity;
import com.example.uti.repositry.utiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class utiServices {

    @Autowired
    private utiRepository repository ;

    //    POST METHODS

    public utiEntity saveDetail(utiEntity detail){
        return  repository.save(detail);
    }

    public List<utiEntity> saveDetails(List<utiEntity> details){
        return  repository.saveAll(details);

    }

//    GET METHODS
    public List<utiEntity> getdetails(){
        return repository.findAll();
    }

    public utiEntity  getDetailsById(Long id){
        return repository.findById(id).orElse(null);

    }
// DELETE
    public String deleteDetails(Long id){
        repository.deleteById(id);
        return "details removed "+ id;
    }
//    UPDATE
    public utiEntity updateDetails(utiEntity details) {

        utiEntity existingDetails = repository.findById(details.getId()).orElse(null);

        if (existingDetails != null) {
            existingDetails.setRole(details.getRole());
            existingDetails.setTeam_members(details.getTeam_members());
            return repository.save(existingDetails);
        }
        return null;

    }
}
