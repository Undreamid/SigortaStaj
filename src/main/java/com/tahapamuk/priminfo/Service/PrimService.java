package com.tahapamuk.priminfo.Service;


import com.tahapamuk.priminfo.model.PrimInfo;

import java.util.List;

public interface PrimService {
    List<PrimInfo> getAllPrimInfo();

    PrimInfo savePrimInfo(PrimInfo primInfo);

    PrimInfo getPrimInfoById(int id);

    PrimInfo updatePrimInfo(PrimInfo primInfo);

    void deletePrimInfoById(int id);

    boolean primInfoExistsById(int id);

    //Void int olacak
    void calculatePrim(PrimInfo primInfo );
}
