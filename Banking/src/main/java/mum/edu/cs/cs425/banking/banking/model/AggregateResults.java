package mum.edu.cs.cs425.banking.banking.model;


import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
        name = "agMapping",
        entities = @EntityResult(
                entityClass = AggregateResults.class,
                fields = {
                        @FieldResult(name = "accountType", column = "accountType"),
                        @FieldResult(name = "minimum", column = "MinimumBalance"),
                        @FieldResult(name = "average", column = "Average"),
                        @FieldResult(name = "maximum", column = "MaximumBalance"),
                        @FieldResult(name = "totalBalance", column = "SubTotal")}))
public class AggregateResults {
    private String   accountType;
    private Double minimum;
    private Double average;
    private Double maximum;
    private Double totalBalance;

    public AggregateResults() {
    }

    public AggregateResults(String accountType, Double minimum, Double average, Double maximum, Double totalBalance) {
        this.accountType = accountType;
        this.minimum = minimum;
        this.average = average;
        this.maximum = maximum;
        this.totalBalance = totalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    public Double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
