package nvc.it.icefacapi.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Event {
    
    @Id
    private String _id;
    private String eventId;
    private Integer amount;

    @CreatedDate
    private Date createdAt;
}
