package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Requisition;
import repo.RequisitionRepository;

import java.util.List;

@Service
public class RequisitionService {
    
    private final RequisitionRepository requisitionRepository;
    
    @Autowired
    public RequisitionService(RequisitionRepository requisitionRepository) {
        this.requisitionRepository = requisitionRepository;
    }
    
    public List<Requisition> getAllRequisitions() {
        return requisitionRepository.findAll();
    }
    
    public Requisition getRequisitionById(Long id) {
        return requisitionRepository.findById(id).orElse(null);
    }
    
    // You can add more methods as per your business requirements
}
