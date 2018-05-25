/**
  * Copyright 2018 bejson.com 
  */
package com.janrone.app.linnk.java.data.modle;
import java.util.List;

/**
 * Auto-generated: 2018-05-18 18:3:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class LinksResult extends BaseResult{

    private String message;
    private int code;
    private List<LinkBean> data;
    private int pageCount;
    private int totalCounts;
    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setData(List<LinkBean> data) {
         this.data = data;
     }
     public List<LinkBean> getData() {
         return data;
     }

    public void setPageCount(int pageCount) {
         this.pageCount = pageCount;
     }
     public int getPageCount() {
         return pageCount;
     }

    public void setTotalCounts(int totalCounts) {
         this.totalCounts = totalCounts;
     }
     public int getTotalCounts() {
         return totalCounts;
     }

}