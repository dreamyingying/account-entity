package com.menglei.account.entity;

import java.util.List;

/**
  * @className BizData4PageAdmin
  * Description 分页实体
  * @date 2018/12/14 17:24
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class BizData4PageAdmin<T> {

    /**
     * 总行数
     */
    private int totalElements;

    /**
     * 每页记录数
     */
    private int size = 5;

    /**
     * 总页数
     */
    private int totalPages;
    /**
     * 当前页码
     */
    private int number;

    private boolean first = false;
    private boolean last = false;

    private List<T> content;

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
