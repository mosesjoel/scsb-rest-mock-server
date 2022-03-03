package com.nypl.mockServer.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import jdk.vm.ci.code.DebugInfo;

//import jdk.vm.ci.code.DebugInfo;
//import jdk.vm.ci.code.DebugInfo;
//import jdk.vm.ci.code.DebugInfo;
//import jdk.vm.ci.code.DebugInfo;
//import jdk.vm.ci.code.DebugInfo;
//import lombok.Getter;
//import lombok.Setter;
//import org.recap.ils.protocol.rest.model.DebugInfo;
//import org.recap.ils.protocol.rest.model.ItemData;

import java.util.List;

/**
 * Created by rajeshbabuk on 7/12/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "itemData",
        "count",
        "statusCode",
        "debugInfo"
})

public class ItemResponse {
    public ItemData getItemData() {
        return itemData;
    }

    public void setItemData(ItemData itemData) {
        this.itemData = itemData;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<DebugInfo> getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(List<DebugInfo> debugInfo) {
        this.debugInfo = debugInfo;
    }

    @JsonProperty("data")
    private ItemData itemData;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("statusCode")
    private Integer statusCode;
    @JsonProperty("debugInfo")
    private List<DebugInfo> debugInfo = null;
}
