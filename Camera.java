package nvc.it.icefacapi.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("cameras")
@Getter @Setter @NoArgsConstructor
public class Camera {
    
    @Id
    private String _id;
    private String cameraId;
    private String name;
    private String location;
    private String factory_id;

    private List<Event> events = new ArrayList<Event>();

}
