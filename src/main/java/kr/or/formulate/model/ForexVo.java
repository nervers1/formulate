package kr.or.formulate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForexVo {

    private String id;
    private String fromCur;
    private String toCur;
    private Double rateCur;
}
