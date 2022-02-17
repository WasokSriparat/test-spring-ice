package nvc.it.icefacapi.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("factories")
@Getter @Setter @NoArgsConstructor
public class Factory {
    
    @Id
    private String _id;
    private Integer factoryId;
    private String name;
    private String address;

    private List<Camera> cameras = new ArrayList<Camera>();


}
