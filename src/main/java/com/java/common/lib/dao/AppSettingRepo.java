package com.java.common.lib.dao;

import com.java.common.lib.domain.AppSetting;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class AppSettingRepo {

    @PersistenceContext
    EntityManager entityManager;

    public void save(AppSetting appSetting){
        if(appSetting.getId() == null || appSetting.getId().isEmpty()){
            entityManager.persist(appSetting);
        } else{
            entityManager.merge(appSetting);
        }
    }

    private Map<String,String> buildSettingMap(Query query){
        Map<String, String> map = new HashMap<>();
        List<AppSetting> settings = query.getResultList();

        for(AppSetting setting : settings){
            map.put(setting.getKey(),setting.getValue());
        }
        return map;
    }

    public Map<String, String> getSettingsAsMap(String category){
        Query query = entityManager.createQuery("SELECT * FROM AppSetting WHERE category = :category");
        query.setParameter("category",category);
        return buildSettingMap(query);
    }

}
