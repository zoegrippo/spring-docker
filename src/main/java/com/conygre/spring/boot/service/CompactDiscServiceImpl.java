package com.conygre.spring.boot.service;


import com.conygre.spring.boot.entities.CompactDisc;
import com.conygre.spring.boot.repos.CompactDiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CompactDiscServiceImpl implements CompactDiscService {

	@Autowired
	private CompactDiscRepository dao;
	/* (non-Javadoc)
	 * @see com.conygre.spring.boot.services.ICompactDiscService#getCatalog()
	 */
	public Iterable<CompactDisc> getCatalog() {
		return dao.findAll();
	}

}
