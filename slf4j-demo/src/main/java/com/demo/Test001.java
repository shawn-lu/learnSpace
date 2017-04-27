/**
 * Project Name:slf4j-demo
 * File Name:Test001.java
 * Package Name:com.demo
 * Date:2017年4月27日下午9:49:30
 * Copyright (c) 2017, China Link Communications LTD All Rights Reserved.
 *
 */


package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName: Test001 <br/>
 * Date: 2017年4月27日 下午9:49:30 <br/>
 * Description: TODO 
 *
 * @author shawn
 * @version 
 * @see
 */
public class Test001 {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(Test001.class);
    logger.info("Hello World");
    logger.info("Hello World {}",123);
  }
}

