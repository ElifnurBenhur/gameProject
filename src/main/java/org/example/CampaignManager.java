package org.example;

import java.util.Date;
import java.util.List;

public class CampaignManager {
    List<Campaign> campaigns;

    public CampaignManager(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    void create(Campaign campaign){
        campaigns.add(campaign);
    }
    void update(Campaign campaign){
        for (Campaign c:campaigns) {
            if(c.getId()==campaign.getId()){
                c.setDescription(campaign.getDescription());
                c.setStartDate(campaign.getStartDate());
                c.setDiscountPercentage(campaign.getDiscountPercentage());
                c.setEndDate(campaign.getStartDate());
                c.setBuyables(campaign.getBuyables());

            }
        }

    }
    void delete(int id){
        for (Campaign c:campaigns) {
            if (c.getId() == id) {
                c.setDeleted(true);
            }
        }

    }
}
