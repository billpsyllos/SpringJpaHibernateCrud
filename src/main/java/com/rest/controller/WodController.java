package com.rest.controller;

import com.rest.model.Wod;
import com.rest.repository.WodRepository;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by billaros on 9/10/2016.
 */
@Controller
public class WodController {

    private WodRepository wodRepository;

    @Autowired
    public void setWodRepository(WodRepository wodRepository){
        this.wodRepository = wodRepository;
    }


    @RequestMapping(value = "wods/{id}")
    private String showWod(@PathVariable Long id , Model model){
        model.addAttribute("wod", wodRepository.findOne(id));
        return "wodshow.html";
    }

    @RequestMapping(value = "wod/edit/{id}")
    private String edit(@PathVariable Long id, Model model){
        model.addAttribute("wod",wodRepository.findOne(id));
        return "wodform";
    }

    @RequestMapping(value = "/wod/{id}")
    private String showWod(@PathVariable Integer id, Model model){
        model.addAttribute("wod",wodRepository.getWodById(id.longValue()));
        return "wodshow";
    }

    @RequestMapping(value = "/wods")
    private String list(Model model){
        model.addAttribute("wods",wodRepository.findAll());
        return "wods";
    }

    @RequestMapping(value = "/wods/new")
    private String create(Model model){
        model.addAttribute("wod" , new Wod());
        return "wodform";
    }

    @RequestMapping(value = "wod" , method = RequestMethod.POST)
    private String saveWod (Wod wod){
        wodRepository.save(wod);
        return "redirect:/wods";
    }

    @RequestMapping(value = "wod/delete/{id}")
    private String delete(@PathVariable Long id){
        wodRepository.delete(id);
        return "redirect:/wods";
    }



}
