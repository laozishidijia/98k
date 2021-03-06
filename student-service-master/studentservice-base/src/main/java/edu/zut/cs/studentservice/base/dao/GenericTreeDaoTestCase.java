package edu.zut.cs.studentservice.base.dao;

import java.io.Serializable;

import edu.zut.cs.studentservice.base.domain.BaseTreeEntity;

/**
 * 
 * @author liuxiaoming
 *
 * @param <PK>
 * @param <T>
 * @param <M>
 */
public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
        extends GenericDaoTestCase<PK, T, M> {

}
