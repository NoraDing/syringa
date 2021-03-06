/**
 * Bilibili.com Inc. Copyright (c) 2009-2019 All Rights Reserved.
 */
package com.bilibili.syringa.core.statistics;

import java.time.LocalDateTime;

import com.bilibili.syringa.core.enums.TypeEnums;

/**
 *
 * @author xuezhaoming
 * @version $Id: RunResult.java, v 0.1 2019-01-15 2:41 PM Exp $$
 */
public class RunResult {

    private boolean       success;
    private String        topicName;
    private TypeEnums     typeEnums;
    private LocalDateTime startDate;
    private LocalDateTime finishDate;
    private double        message;
    private double        totalSize;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public TypeEnums getTypeEnums() {
        return typeEnums;
    }

    public void setTypeEnums(TypeEnums typeEnums) {
        this.typeEnums = typeEnums;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public double getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(double totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "RunResult{" + "success=" + success + ", topicName='" + topicName + '\''
               + ", typeEnums=" + typeEnums + ", startDate=" + startDate + ", finishDate="
               + finishDate + ", message=" + message + ", totalSize=" + totalSize + '}';
    }
}
