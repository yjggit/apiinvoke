package com.components.dao;

import com.components.entities.CompApi;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * @author JHui.Yang
 * @version $Id: HibernateCommonService.java, v 0.1 2017/7/6 10:01 JHui.Yang Exp $
 */

@Repository
public interface CompApiDao extends PagingAndSortingRepository <CompApi , String> {

}
