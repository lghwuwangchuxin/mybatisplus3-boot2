package com.js.site.log.manage.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 采集站操作日志表
 * </p>
 *
 * @author lgh
 * @since 2018-12-21
 */
@TableName("LOG_SITE_LOG")
public class LogSiteLogModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 用户标识（身份证或警号）
     */
    @TableField("USER_IDENTITY")
    private String userIdentity;

    /**
     * 单位名称
     */
    @TableField("ORGANIZATION_NAME")
    private String organizationName;

    /**
     * 单位代码
     */
    @TableField("ORGANIZATION_CODE")
    private String organizationCode;

    /**
     * 用户姓名
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 操作时间
     */
    @TableField("OPERATE_TIME")
    private String operateTime;

    /**
     * 创建时自动生成
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 创建时自动生成，修改时自动更新
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;

    /**
     * 终端标识
     */
    @TableField("TERMINAL_IDENTITY")
    private String terminalIdentity;

    /**
     * 操作类型
     */
    @TableField("OPERATE_TYPE")
    private Integer operateType;

    /**
     * 操作结果
     */
    @TableField("OPERATE_RESULT")
    private Integer operateResult;

    /**
     * 失败原因代码
     */
    @TableField("ERROR_CODE")
    private String errorCode;

    /**
     * 功能模块名称
     */
    @TableField("MODULE_NAME")
    private String moduleName;

    /**
     * 文件标识
     */
    @TableField("FILE_IDENTITY")
    private String fileIdentity;

    /**
     * 文件名
     */
    @TableField("FILE_NAME")
    private String fileName;

    /**
     * 操作条件
     */
    @TableField("CONDITION")
    private String condition;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 认证码
     */
    @TableField("AUTH_KEY")
    private String authKey;

    /**
     * 采集站ID
     */
    @TableField("SITE_ID")
    private Long siteId;

    /**
     * 请求标识
     */
    @TableField("REQUEST_IDENTITY")
    private String requestIdentity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTerminalIdentity() {
        return terminalIdentity;
    }

    public void setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Integer getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(Integer operateResult) {
        this.operateResult = operateResult;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getFileIdentity() {
        return fileIdentity;
    }

    public void setFileIdentity(String fileIdentity) {
        this.fileIdentity = fileIdentity;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getRequestIdentity() {
        return requestIdentity;
    }

    public void setRequestIdentity(String requestIdentity) {
        this.requestIdentity = requestIdentity;
    }

    @Override
    public String toString() {
        return "LogSiteLogModel{" +
        "id=" + id +
        ", userIdentity=" + userIdentity +
        ", organizationName=" + organizationName +
        ", organizationCode=" + organizationCode +
        ", userName=" + userName +
        ", operateTime=" + operateTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", terminalIdentity=" + terminalIdentity +
        ", operateType=" + operateType +
        ", operateResult=" + operateResult +
        ", errorCode=" + errorCode +
        ", moduleName=" + moduleName +
        ", fileIdentity=" + fileIdentity +
        ", fileName=" + fileName +
        ", condition=" + condition +
        ", remark=" + remark +
        ", authKey=" + authKey +
        ", siteId=" + siteId +
        ", requestIdentity=" + requestIdentity +
        "}";
    }
}
