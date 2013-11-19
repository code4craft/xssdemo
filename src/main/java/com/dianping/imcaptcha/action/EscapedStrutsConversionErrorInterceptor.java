package com.dianping.imcaptcha.action;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.struts2.interceptor.StrutsConversionErrorInterceptor;

/**
 * @author yihua.huang@dianping.com
 */
public class EscapedStrutsConversionErrorInterceptor extends StrutsConversionErrorInterceptor{

    @Override
    protected String escape(Object value) {
        String s = StringEscapeUtils.escapeHtml4(String.valueOf(value));
        String escape = super.escape(s);
        System.out.println("escape "+value+" to "+ s);
        return escape;
    }
}
