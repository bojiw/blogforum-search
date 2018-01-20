package com.blogforum.search.service.manager.query.Impl;

import com.blogforum.search.facade.model.Page;
import com.blogforum.search.facade.model.RequestQuerySearch;
import com.blogforum.search.service.manager.query.QueryHandler;
import com.blogforum.search.service.note.NoteSolrQueryService;

public class NoteQueryHandlerImpl implements QueryHandler {

	private NoteSolrQueryService noteSolrQueryService;
	
	@Override
	public Page query(RequestQuerySearch request) {
		Page noteVO = noteSolrQueryService.defaultQuery(request);
		return noteVO;
	}

	public void setNoteSolrQueryService(NoteSolrQueryService noteSolrQueryService) {
		this.noteSolrQueryService = noteSolrQueryService;
	}
	
	

}
