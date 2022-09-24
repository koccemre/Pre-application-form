package com.example.example_app.controller;

import com.example.example_app.model.UserInformation;
import com.example.example_app.repository.BayilikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BayilikFormuController {

    @Autowired
    private BayilikRepository bayilikRepository;

    @GetMapping("/bayilik")  //Sayfa ilk açıldığında gelen form
    public String showForm(Model model){
        UserInformation userInformation = new UserInformation();
        model.addAttribute("userInformation", userInformation); // forma gelen bilgileri oluşturduğum userInformation nesnesine aktarıyorum.
        List<String> bölgeList = Arrays.asList("Lüleburgaz","Kırklareli","Tekirdağ"); // Kutudan verdiğim il/ilçe/semt için listeden seçim yapabilicek.
        model.addAttribute("bölgeList",bölgeList);
        return "bayilik_formu";
    }

    @PostMapping("/bayilik")
    public String submitForm(@ModelAttribute("userInformation") UserInformation userInformation){
            bayilikRepository.save(userInformation); //butona basıldıktan sonra JPA 'nın hazır metodu olan save() metodu ile db ye kayıt atıyorum.
            System.out.println(userInformation);
            return "success";  // kayıf başarılıysa success.jsp sayfasına yönlendirir.
    }
}
