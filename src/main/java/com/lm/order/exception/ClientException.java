package com.lm.order.exception;


import com.lm.order.common.OrderRespCode;

/**
 * @author liulinbao
 */
public class ClientException extends RuntimeException {
	private static final long serialVersionUID = -460583000140800734L;

	private Integer code;
	private Object extra;

	public ClientException(Integer code, String msg) {
		super(msg);
		this.code = code;
	}


	public ClientException(OrderRespCode respCode){
		super(respCode.getDesc());
		this.code = respCode.getCode();
	}



	public Integer getCode() {
		return code;
	}

	public Object getExtra() {
		return extra;
	}
}
