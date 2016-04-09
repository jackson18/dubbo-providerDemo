package com.qijiabin.rpc.impl;

import com.qijiabin.rpc.SpeakInterface;

/**
 * 服务提供方对外提供接口的实现类
 * @author jackson
 *
 */
public class SpeakInterfaceImpl implements SpeakInterface {

	public String speak(String content) {
		return "say: " + content;
	}

}

