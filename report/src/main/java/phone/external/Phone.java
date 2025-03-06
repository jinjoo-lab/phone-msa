package phone.external;

import java.util.Date;
import lombok.Data;

@Data
public class Phone {

    private Long id;
    private Integer userId;
    private String phoneNumber;
    private String company;
    private String model;
    private String detail;
}
