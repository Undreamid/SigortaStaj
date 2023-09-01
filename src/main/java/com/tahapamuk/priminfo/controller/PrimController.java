package com.tahapamuk.priminfo.controller;

import com.tahapamuk.priminfo.Service.PrimService;
import com.tahapamuk.priminfo.model.PrimInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PrimController {

    @Autowired
    private PrimService primService;


    @GetMapping("/priminfo")
    public String ListPrimInfo(Model model) {
        model.addAttribute("priminfo", primService.getAllPrimInfo());
        return "priminfo";
    }

    @GetMapping("priminfo/new")
    public String createPrimInfo(Model model) {
        PrimInfo primInfo = new PrimInfo();
        model.addAttribute("primInfo", primInfo);
        return "create_priminfo";
    }

    @PostMapping("/priminfo")
    public String savePrimInfo(@ModelAttribute("primInfo") PrimInfo primInfo) {
        primService.savePrimInfo(primInfo);
        return "redirect:/priminfo";
    }

    @PostMapping("/edit/{id}")
    public String updatePrimInfo(@PathVariable int id, @ModelAttribute("priminfo") PrimInfo primInfo, Model model) {
        model.addAttribute("priminfo", primService.getPrimInfoById(id));
        PrimInfo existingPrimInfo = primService.getPrimInfoById(id);
        existingPrimInfo.setId(id);
        existingPrimInfo.setName(primInfo.getName());
        existingPrimInfo.setAge(primInfo.getAge());
        existingPrimInfo.setCity(primInfo.getCity());
        existingPrimInfo.setIncome(primInfo.getIncome());
        existingPrimInfo.setLicenseAge(primInfo.getLicenseAge());
        existingPrimInfo.setAccidentRecord(primInfo.getAccidentRecord());
        existingPrimInfo.setVehicleBrand(primInfo.getVehicleBrand());
        existingPrimInfo.setVehiclePlate(primInfo.getVehiclePlate());
        existingPrimInfo.setVehicleAge(primInfo.getVehicleAge());
        existingPrimInfo.setVehicleAccidentRecord(primInfo.getVehicleAccidentRecord());
        existingPrimInfo.setVehicleAccidentValue(primInfo.getVehicleAccidentValue());

        primService.updatePrimInfo(existingPrimInfo);
        return "redirect:/priminfo";
    }


    @GetMapping("/priminfo/{id}")
    public String delete(@PathVariable Integer id) {
        primService.deletePrimInfoById(id);
        return "redirect:/priminfo";
    }
}


