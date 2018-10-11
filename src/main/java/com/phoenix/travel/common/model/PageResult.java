package com.phoenix.travel.common.model;

import java.util.List;

/**
 * 分页通用对象
 *
 * @author Weishuo Zhang
 * @create 2018/10/11
 */
public class PageResult<T> {

    private long total;

    private List<T> list;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
