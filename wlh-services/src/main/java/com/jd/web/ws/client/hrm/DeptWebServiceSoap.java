/**
 * DeptWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jd.web.ws.client.hrm;

public interface DeptWebServiceSoap extends java.rmi.Remote {

    /**
     * 获取用户
     */
    public User getUser(int id) throws java.rmi.RemoteException;

    /**
     * 获取用户
     */
    public User getUserByName(String name) throws java.rmi.RemoteException;

    /**
     * 校验
     */
    public User verify(String name, String password) throws java.rmi.RemoteException;

    /**
     * 根据登录名返回权限码串
     */
    public String resourceNames(String str) throws java.rmi.RemoteException;

    /**
     * 解密cookie
     */
    public String getLoginCookieInfo(String cookieValue) throws java.rmi.RemoteException;

    /**
     * 获取用户列表
     */
    public EmployeeQuery[] getUsersByids(String ids) throws java.rmi.RemoteException;

    /**
     * 根据资源码获取用户列表
     */
    public User[] getUsersByRes(String res) throws java.rmi.RemoteException;

    /**
     * 获得所有部门对应关系
     */
    public Sys_bumen[] geyDeptList(int fid) throws java.rmi.RemoteException;

    /**
     * 根据部门Id获取用户列表
     */
    public User[] getUsersByDeptId(int deptId) throws java.rmi.RemoteException;

    /**
     * 根据ERP账号，获取对应的新部门信息
     */
    public Sys_bumen getNewDeptByUserpin(String pin) throws java.rmi.RemoteException;

    /**
     * 根据ERP账号，获取ERP关联机构部门的列表
     */
    public Sys_bumen[] getNewDeptListByUserpin(String pin) throws java.rmi.RemoteException;

    /**
     * 根据部门编号获取部门其他信息
     */
    public Sys_bumen getSys_BumenById(int bm_id) throws java.rmi.RemoteException;

    /**
     * 根据erp账号获取,是否为  仓储/配送部成员,然后将对应的下级根机构取出
     */
    public String getBumenInfoByUserPin(String pin) throws java.rmi.RemoteException;
}
