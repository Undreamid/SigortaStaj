package com.tahapamuk.priminfo.repository;

import com.tahapamuk.priminfo.model.PrimInfo;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

//Not: Interface den classa dönüp request mapping, get mapping yapılabilir
//listCrud because of finding restAPI
public interface PrimRepo extends ListCrudRepository<PrimInfo,Integer> {
}
