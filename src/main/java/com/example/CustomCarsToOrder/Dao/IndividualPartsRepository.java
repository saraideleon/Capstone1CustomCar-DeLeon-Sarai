package com.example.CustomCarsToOrder.Dao;

import com.example.CustomCarsToOrder.Dto.IndividualParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividualPartsRepository extends JpaRepository<IndividualParts, Integer> {
    List<IndividualParts> findByIndPrtId(Integer id);
    List<IndividualParts> findByPrtId(Integer id);

    @Query("SELECT t.prtId, pt.prtName, count(*) FROM IndividualParts t , PartsType pt WHERE t.prtId=pt.prtId and upper(t.prtStatus) IN ('AVAILABLE','UNUSED') group by t.prtId,pt.prtName")
    //@Query("SELECT t FROM IndividualParts t")
    Object[] countavailableParts();
}
