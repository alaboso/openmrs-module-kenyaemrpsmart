/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 * <p>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p>
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.kenyaemrpsmart.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.kenyaemrpsmart.PsmartStore;
import org.openmrs.module.kenyaemrpsmart.api.PSMARTService;
import org.openmrs.module.kenyaemrpsmart.api.db.PSMARTDAO;

import java.util.List;

/**
 * It is a default implementation of {@link PSMARTService}.
 */
public class PSMARTServiceImpl extends BaseOpenmrsService implements PSMARTService {

    protected final Log log = LogFactory.getLog(this.getClass());

    private PSMARTDAO dao;


    @Override
    public long create(PsmartStore psmartStore) {
        return this.dao.create(psmartStore);
    }

    @Override
    public List<PsmartStore> list() {
        return this.dao.list();
    }

    @Override
    public PsmartStore get(long id) {
        return this.dao.get(id);
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(PSMARTDAO dao) {
        this.dao = dao;
    }

    /**
     * @return the dao
     */
    public PSMARTDAO getDao() {
        return dao;
    }
}