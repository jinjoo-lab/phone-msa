package phone.external;

import java.util.Date;
import lombok.Data;

@Data
public class Window {

    private Long id;
    private Long userId;
    private String phoneNumber;
    private Date date;
    private String serviceType;
    private String status;
}
