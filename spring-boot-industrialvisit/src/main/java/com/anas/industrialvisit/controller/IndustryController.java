package com.anas.industrialvisit.controller;

//import com.anas.industrialvisit.dto.AddCategory;
import com.anas.industrialvisit.entity.IndustrialCategory;
import com.anas.industrialvisit.entity.Industry;
import com.anas.industrialvisit.service.IndustryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/industry")
public class IndustryController {


    //private AddCategory addCategory;
    private IndustryService industryService;

    public IndustryController(IndustryService industryService) {
        this.industryService = industryService;
//        this.addCategory = addCategory;
    }
//    @PostMapping("/save")
//    public ResponseEntity<IndustrialCategory> placeIndustry(@RequestBody IndustrialCategory industrialCategory) {
//
//        return new ResponseEntity<>(industryService.placeIndustry(industrialCategory), HttpStatus.CREATED);
//    }
    @PostMapping("/save")
    public ResponseEntity<Industry> saveIndustry(@RequestBody Industry ind) {

        return new ResponseEntity<>(industryService.saveIndustry(ind), HttpStatus.CREATED);
    }

//    @GetMapping()x
//    findIndustryByCategory(){
//        industryService.getIndustriesByCategoryId();
//    }
    @GetMapping("/search/findByCategoryId/{id}")
    public List<Industry> findIndustryByCategory(@PathVariable Long id){
        return industryService.getIndustriesByCategoryId(id);

    }

//    @GetMapping("/allcat")
//    public List<IndustraCategoryResponseDto> getCat() {
//
//        List<IndustrialCategory> all = industryService.getAll();
//        List<IndustraCategoryResponseDto> responseList = new ArrayList<>();
//        all.forEach(l -> {
//            IndustraCategoryResponseDto response = new IndustraCategoryResponseDto();
//            response.setCategoryName(l.getCategoryName());
//            List<Industry> industries = new ArrayList<>();
//            for (Industry indus:l.getIndustries()){
//                industries.add(indus.get);
//            }
//        });

//        Map<String, Map<List<Industry>, List<IndustrialCategory>>> collect = all.stream().collect(Collectors.groupingBy(IndustrialCategory::getCategoryName, Collectors.groupingBy(IndustrialCategory::getIndustries)));
//        collect.forEach((k,v)->{
//            System.out.println(k);
//            v.forEach((p,t)->{
//                System.out.println(p);
//                t.forEach (System.out::println);
//            });
//        });
//        all.forEach(System.out::println);
//
//        return ResponseEntity .ok() .body(all);
//    }

}
