package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.WorkApplication;
import phone.domain.DataDeleted;
import phone.domain.LocationSearched;
import phone.domain.RemoteLocked;
import phone.domain.LockRequested;

@Entity
@Table(name = "Work_table")
@Data
//<<< DDD / Aggregate Root
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long windowId;

    private Long userId;

    private String phoneNumber;

    private String serviceType;

    private Boolean isDone;

    private Date doneTime;

    public static WorkRepository repository() {
        WorkRepository workRepository = WorkApplication.applicationContext.getBean(
            WorkRepository.class
        );
        return workRepository;
    }

    //<<< Clean Arch / Port Method
    public static void remoteLock(LockRequested lockRequested) {
        //implement business logic here:
        Work work = new Work();
        work.userId = lockRequested.userId;
        work.windowId = lockRequested.id;
        work.phoneNumber = lockRequested.phoneNumber;
        work.serviceType = lockRequested.serviceType;
        work.isDone = true;
        work.doneTime = lockRequested.date;

        workRepository.save(work);

        RemoteLocked remoteLocked = new RemoteLocke(work);
        remoteLocked.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void locationSearch(LostReported lostReported) {
        //implement business logic here:
        System.out.println("Location search requested");
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void dataDelete(DataDeleteRequested dataDeleteRequested) {
        //implement business logic here:
        System.out.println("Data delete requested");
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
