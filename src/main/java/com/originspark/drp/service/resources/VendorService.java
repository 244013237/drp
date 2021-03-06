package com.originspark.drp.service.resources;

import java.util.List;
import java.util.Map;

import com.originspark.drp.dao.BaseDAO;
import com.originspark.drp.models.resources.Vendor;
import com.originspark.drp.util.json.FilterRequest;

public interface VendorService extends BaseDAO<Vendor>{

    List<Vendor> pagedDataSet(int start, int limit, List<FilterRequest> filters);

    Long pagedDataCount(List<FilterRequest> filters);

    Map<String,String> validate();

    Vendor findByName(String name);

    boolean have(Vendor vendor);
}
