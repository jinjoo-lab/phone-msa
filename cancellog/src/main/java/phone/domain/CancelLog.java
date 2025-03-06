package phone.domain;

import phone.domain.ReportInvalidated;
import phone.CancellogApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="CancelLog_table")
@Data

//<<< DDD / Aggregate Root
public class CancelLog  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long windowId;
    
    
    
    
    private Long userId;
    
    
    
    
    private String serviceType;
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){
    Window window = CancelLogApplication.applicationContext
        .getBean(phone.external.WindowService.class)
        .reportRequest(get??);


        ReportInvalidated reportInvalidated = new ReportInvalidated(this);
        reportInvalidated.publishAfterCommit();

    
    }

    public static CancelLogRepository repository(){
        CancelLogRepository cancelLogRepository = CancellogApplication.applicationContext.getBean(CancelLogRepository.class);
        return cancelLogRepository;
    }






}
//>>> DDD / Aggregate Root
