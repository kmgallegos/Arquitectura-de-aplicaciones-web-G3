package pe.edu.upc.helpyou.dtos;

public class SubscriptionCountDTO {
    private String typeSubscription;
    private Long count;

    public SubscriptionCountDTO(String typeSubscription, Long count) {
        this.typeSubscription = typeSubscription;
        this.count = count;
    }

    // Getters y Setters
    public String getTypeSubscription() {
        return typeSubscription;
    }

    public void setTypeSubscription(String typeSubscription) {
        this.typeSubscription = typeSubscription;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
