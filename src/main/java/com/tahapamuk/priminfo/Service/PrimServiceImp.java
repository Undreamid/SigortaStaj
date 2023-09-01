package com.tahapamuk.priminfo.Service;

import com.tahapamuk.priminfo.model.PrimInfo;
import com.tahapamuk.priminfo.repository.PrimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PrimServiceImp implements PrimService {
    @Autowired
    private PrimRepo primRepo;

    public List<PrimInfo> getAllPrimInfo(){
        return primRepo.findAll();
    };

    public PrimInfo savePrimInfo(PrimInfo primInfo){
        return primRepo.save(primInfo);
    };

    public PrimInfo getPrimInfoById(int id){
        return primRepo.findById(id).get();
    };

    public PrimInfo updatePrimInfo(PrimInfo primInfo){
        return primRepo.save(primInfo);
    };

    public void deletePrimInfoById(int id){
        primRepo.deleteById(id);
    };

    public boolean primInfoExistsById(int id){
        return primRepo.existsById(id);
    };

    //void int olacak
    public void calculatePrim(PrimInfo primInfo ){
    };



}
