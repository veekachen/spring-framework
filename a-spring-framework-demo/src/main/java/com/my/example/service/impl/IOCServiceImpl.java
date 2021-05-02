package com.my.example.service.impl;

import com.my.example.service.IOCService;

/**
 * @author syj
 * CreateTime 2019/7/18
 * describe:
 */
public class IOCServiceImpl implements IOCService {
    @Override
	public String hollo() {
        return "Hello,IOC";
    }
}
