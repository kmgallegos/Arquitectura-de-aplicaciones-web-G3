package pe.edu.upc.helpyou.dtos;

public class UserBySubscriptionDTO {
    private String subscriptionType;
    private int quantityUser;

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public int getQuantityUser() {
        return quantityUser;
    }

    public void setQuantityUser(int quantityUser) {
        this.quantityUser = quantityUser;
    }
}


