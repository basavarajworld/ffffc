package service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import model.HomePageItemDTO;
import model.Item;
import model.Notification;
import model.Requisition;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class HomePageService {

    private final NotificationService notificationService;
    private final RequisitionService requisitionService;


    public List<HomePageItemDTO> getHomePageData() {
        List<HomePageItemDTO> homepageData = new ArrayList<>();

        List<Notification> notifications = notificationService.getAllNotifications();
        for (Notification notification : notifications) {
            Requisition requisition = requisitionService.getRequisitionById(notification.getRequisition().getId());
            Item item = requisition.getItem();

            HomePageItemDTO dto = new HomePageItemDTO(null, null, null, null, null, null, null, null, null);
            dto.setNotificationId(notification.getId());
            dto.setItemNo(item.getItemNo());
            dto.setItemCode(item.getItemCode());
            dto.setDescription(item.getDescription());
            dto.setQuantity(item.getQuantity());
            dto.setEstimatedPrice(item.getEstimatedPrice());
            dto.setPurchasingGroup(requisition.getPurchasingGroup());
            dto.setStatus(notification.getStatus());
            dto.setAction("Action"); // Placeholder for action

            homepageData.add(dto);
        }

        return homepageData;
    }
}
