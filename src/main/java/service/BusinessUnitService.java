package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.BusinessUnit;
import repo.BusinessUnitRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessUnitService {

    @Autowired
    private BusinessUnitRepository businessUnitRepository;

    public List<BusinessUnit> getAllBusinessUnits() {
        return businessUnitRepository.findAll();
    }

    public Optional<BusinessUnit> getBusinessUnitById(Long id) {
        return businessUnitRepository.findById(id);
    }

    public BusinessUnit createBusinessUnit(BusinessUnit businessUnit) {
        return businessUnitRepository.save(businessUnit);
    }

    public BusinessUnit updateBusinessUnit(Long id, BusinessUnit businessUnitDetails) {
        Optional<BusinessUnit> optionalBusinessUnit = businessUnitRepository.findById(id);
        if (optionalBusinessUnit.isPresent()) {
            BusinessUnit existingBusinessUnit = optionalBusinessUnit.get();
            existingBusinessUnit.setDescription(businessUnitDetails.getDescription());
            return businessUnitRepository.save(existingBusinessUnit);
        } else {
            return null; // Or throw an exception indicating the business unit doesn't exist
        }
    }

    public void deleteBusinessUnit(Long id) {
        businessUnitRepository.deleteById(id);
    }
}

