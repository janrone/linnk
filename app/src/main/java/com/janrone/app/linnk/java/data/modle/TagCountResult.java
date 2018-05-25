package com.janrone.app.linnk.java.data.modle;
/**
 * Copyright 2018 bejson.com
 */
import java.util.List;

/**
 * Auto-generated: 2018-05-21 16:55:18
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */


public class TagCountResult extends BaseResult {

        private String message;
        private int code;
        private List<TagCountItem> data;
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

        public void setData(List<TagCountItem> data) {
            this.data = data;
        }
        public List<TagCountItem> getData() {
            return data;
        }

}
