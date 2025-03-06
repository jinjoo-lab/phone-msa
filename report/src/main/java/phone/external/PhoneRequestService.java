package phone.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "phone", url = "${api.url.phone}")
public interface PhoneRequestService {
    @GetMapping(path = "/phoneRequests")
    public List<PhoneRequest> getPhoneRequest();

    @GetMapping(path = "/phoneRequests/{id}")
    public PhoneRequest getPhoneRequest(@PathVariable("id") Long id);
}
