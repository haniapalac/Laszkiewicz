package pl.laszkiewicz.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String clientName;
    private String taskLocation;
    private Date dataAdded;
    private String vehicleId;
    private Integer telephoneNumber;
    private Integer houseNumber;
    private String description;

    public Task() {
    }

    public Long getId() {
        return this.id;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTaskLocation() {
        return this.taskLocation;
    }

    public void setTaskLocation(String taskLocation) {
        this.taskLocation = taskLocation;
    }

    public Date getDataAdded() {
        return this.dataAdded;
    }

    public void setDataAdded(Date dataAdded) {
        this.dataAdded = dataAdded;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(Integer telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(Integer hausenumber) {
        this.houseNumber = hausenumber;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
