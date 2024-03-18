package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.BusinessUnit;
import service.BusinessUnitService;

import java.util.List;

@RestController
@RequestMapping("/api/businessunits")
public class BusinessUnitController {

    @Autowired
    private BusinessUnitService businessUnitService;

    @GetMapping
    public List<BusinessUnit> getAllBusinessUnits() {
        return businessUnitService.getAllBusinessUnits();
    }

    @GetMapping("/{id}")
    public BusinessUnit getBusinessUnitById(@PathVariable Long id) {
        return businessUnitService.getBusinessUnitById(id).orElse(null);
    }

    @PostMapping
    public BusinessUnit createBusinessUnit(@RequestBody BusinessUnit businessUnit) {
        return businessUnitService.createBusinessUnit(businessUnit);
    }

    @PutMapping("/{id}")
    public BusinessUnit updateBusinessUnit(@PathVariable Long id, @RequestBody BusinessUnit businessUnitDetails) {
        return businessUnitService.updateBusinessUnit(id, businessUnitDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBusinessUnit(@PathVariable Long id) {
        businessUnitService.deleteBusinessUnit(id);
    }
}
