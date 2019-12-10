package kr.or.formulate.repository;

import kr.or.formulate.model.Forex;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ForexRepository extends ReactiveCrudRepository<Forex, String> {

}
