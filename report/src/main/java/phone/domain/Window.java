package phone.domain;

import phone.domain.LostReported;
import phone.domain.LostCanceled;
import phone.domain.DataDeleteRequested;
import phone.domain.LockRequested;
import phone.ReportApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="Window_table")
@Data

//<<< DDD / Aggregate Root
public class Window  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long userId;
    
    
    
    
    private String phoneNumber;
    
    
    
    
    private Date date;
    
    
    
    
    private String serviceType;
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){
    Phone phone = WindowApplication.applicationContext
        .getBean(phone.external.PhoneService.class)
        .phoneRequest(get??);


        LostReported lostReported = new LostReported(this);
        lostReported.publishAfterCommit();



        LostCanceled lostCanceled = new LostCanceled(this);
        lostCanceled.publishAfterCommit();



        DataDeleteRequested dataDeleteRequested = new DataDeleteRequested(this);
        dataDeleteRequested.publishAfterCommit();



        LockRequested lockRequested = new LockRequested(this);
        lockRequested.publishAfterCommit();

    
    }

    public static WindowRepository repository(){
        WindowRepository windowRepository = ReportApplication.applicationContext.getBean(WindowRepository.class);
        return windowRepository;
    }




//<<< Clean Arch / Port Method
    public static void lostCancelByAdmin(ReportInvalidated reportInvalidated){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        Window window = new Window();
        repository().save(window);

        LostCanceled lostCanceled = new LostCanceled(window);
        lostCanceled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(reportInvalidated.get???()).ifPresent(window->{
            
            window // do something
            repository().save(window);

            LostCanceled lostCanceled = new LostCanceled(window);
            lostCanceled.publishAfterCommit();

         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
