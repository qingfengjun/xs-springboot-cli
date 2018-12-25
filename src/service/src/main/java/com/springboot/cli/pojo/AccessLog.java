package com.springboot.cli.pojo;
import com.springboot.cli.pojo.base.BaseEntity;
import javax.persistence.*;


@Entity
@Table(name = "cli_access_log")
public class AccessLog extends BaseEntity {

    private String modelName;
    private String functionName;
    private String url;
    private String params;


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }


}
