package com.blogforum.search.service.manager.query;

import com.blogforum.search.facade.model.Page;
import com.blogforum.search.facade.model.RequestQuerySearch;

public interface QueryHandler {
	
	/**
	 * 默认搜索
	 * @param request 搜索请求对象
	 * @author: wwd
	 * @time: 2018年1月13日
	 */
	Page query(RequestQuerySearch request);

}
