package com.blogforum.search.facade.note;

import com.blogforum.common.model.Result;
import com.blogforum.search.facade.model.Page;
import com.blogforum.search.facade.model.RequestQuerySearch;

public interface SolrServiceFacade {
	
	/**
	 * 搜索solr中note core库里的笔记信息
	 * 
	 * @param request 搜索请求对象
	 * @return
	 * @author: wwd
	 * @time: 2018年1月13日
	 */
	Result<Page> query(RequestQuerySearch request);
	

}
