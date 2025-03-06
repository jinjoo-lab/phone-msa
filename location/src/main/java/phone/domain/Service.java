package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.LocationApplication;
import phone.domain.DataDeleted;
import phone.domain.LocationSearched;
import phone.domain.RemoteLocked;

@Entity
@Table(name = "Service_table")
@Data
//<<< DDD / Aggregate Root
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long windowId;

    private Long userId;

    private String phoneNumber;

    private String serviceType;

    private Boolean isDone;

    private Date doneTime;

    public static ServiceRepository repository() {
        ServiceRepository serviceRepository = LocationApplication.applicationContext.getBean(
            ServiceRepository.class
        );
        return serviceRepository;
    }

    //<<< Clean Arch / Port Method
    public static void remoteLock(LockRequested lockRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        RemoteLocked remoteLocked = new RemoteLocked(service);
        remoteLocked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lockRequested.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            RemoteLocked remoteLocked = new RemoteLocked(service);
            remoteLocked.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void remoteLock(LockRequested lockRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        RemoteLocked remoteLocked = new RemoteLocked(service);
        remoteLocked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lockRequested.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            RemoteLocked remoteLocked = new RemoteLocked(service);
            remoteLocked.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void locationSearch(LostReported lostReported) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        LocationSearched locationSearched = new LocationSearched(service);
        locationSearched.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lostReported.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            LocationSearched locationSearched = new LocationSearched(service);
            locationSearched.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void dataDelete(DataDeleteRequested dataDeleteRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        DataDeleted dataDeleted = new DataDeleted(service);
        dataDeleted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(dataDeleteRequested.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            DataDeleted dataDeleted = new DataDeleted(service);
            dataDeleted.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
