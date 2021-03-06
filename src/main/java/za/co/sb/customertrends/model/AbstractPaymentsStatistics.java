/*
 * Copyright (c) Standard Bank. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Standard Bank ("Confidential Information").
 * It may not be copied or reproduced in any manner without the express 
 * written permission of Standard Bank.
 *
 */
package za.co.sb.customertrends.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Maksim Drahun
 */
@Getter
@Setter
public abstract class AbstractPaymentsStatistics {
  
  private Long customerKey;
  
  private String currency;

}
