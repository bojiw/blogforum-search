package com.blogforum.search.dao.solr;

import org.apache.solr.common.SolrDocumentList;

import com.blogforum.search.facade.model.RequestQuerySearch;

public interface SolrClient {

	/**
	 * 查询solr数据
	 * 
	 * @param start 从第几条开始 从0开始
	 * @param rows	查询几条数据 从1开始 0代表查询所有
	 * @param request 查询请求参数
	 * @return
	 * @throws Exception
	 * @author: wwd
	 * @time: 2018年1月13日
	 */
	SolrDocumentList query(Integer start,Integer rows,RequestQuerySearch request) throws Exception ;
	
	/**
	 * 删除索引 根据搜索条件 把搜索出来的结果删除 目前设计为搜索id
	 * @param keywords
	 * @author: wwd
	 * @time: 2018年1月14日
	 */
	void deleteByQuery(String keywords)throws Exception;
	
	void update();
	
	void inset();
}
