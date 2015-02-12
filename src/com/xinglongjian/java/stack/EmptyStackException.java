package com.xinglongjian.java.stack;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月9日 下午5:30:50
 *
 */
public class EmptyStackException extends RuntimeException
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public EmptyStackException(String str)
    {
        super(str);
    }
}
