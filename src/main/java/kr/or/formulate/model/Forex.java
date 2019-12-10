package kr.or.formulate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "forex")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forex {

    @Id
    private String id;
    private String fromCur;
    private String toCur;
    private Double rateCur;

    public Forex(String fromCur, String toCur, Double rateCur) {

    }
}
