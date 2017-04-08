package com.jd.model.pin;

/**
 * 公告模型
 *
 * @author sunny
 * @version 1.0.0
 * @since 2014-11-10
 */
public class NoticeModel {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 公告
     */
    private String notice;

    /**
     * 备注
     */
    private String remark;//操作描述 edit编辑，delete删除

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
