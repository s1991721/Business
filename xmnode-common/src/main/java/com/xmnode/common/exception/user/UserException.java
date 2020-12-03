package com.xmnode.common.exception.user;

import com.xmnode.common.exception.BaseException;

/**
 * 用户信息异常类
 *
 * @author Mr.Lin
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
