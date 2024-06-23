package pe.edu.upc.helpyou.dtos;

public class SubscriptionTypeDTO {

    private String statusSubscription;
    private int subscriptionCount;

    public String getStatusSubscription() {
        return statusSubscription;
    }

    public void setStatusSubscription(String statusSubscription) {
        this.statusSubscription = statusSubscription;
    }

    public int getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(int subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }
}
