package com.mall4j.cloud.leaf.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author wuKeFan
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Key is none")
public class NoKeyException extends RuntimeException {

}
