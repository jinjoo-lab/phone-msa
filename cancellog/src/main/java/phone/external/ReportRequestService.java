package phone.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "report", url = "${api.url.report}")
public interface ReportRequestService {
    @GetMapping(path = "/reportRequests")
    public List<ReportRequest> getReportRequest();

    @GetMapping(path = "/reportRequests/{id}")
    public ReportRequest getReportRequest(@PathVariable("id") Long id);
}
