package com.jd.web.ws.client.hrm;

public class DeptWebServiceSoapProxy implements DeptWebServiceSoap {
  private String _endpoint = null;
  private DeptWebServiceSoap deptWebServiceSoap = null;
  
  public DeptWebServiceSoapProxy() {
    _initDeptWebServiceSoapProxy();
  }
  
  public DeptWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDeptWebServiceSoapProxy();
  }
  
  private void _initDeptWebServiceSoapProxy() {
    try {
      deptWebServiceSoap = (new DeptWebServiceLocator()).getDeptWebServiceSoap();
      if (deptWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)deptWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)deptWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (deptWebServiceSoap != null)
      ((javax.xml.rpc.Stub)deptWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DeptWebServiceSoap getDeptWebServiceSoap() {
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap;
  }
  
  public User getUser(int id) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getUser(id);
  }
  
  public User getUserByName(String name) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getUserByName(name);
  }
  
  public User verify(String name, String password) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.verify(name, password);
  }
  
  public String resourceNames(String str) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.resourceNames(str);
  }
  
  public String getLoginCookieInfo(String cookieValue) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getLoginCookieInfo(cookieValue);
  }
  
  public EmployeeQuery[] getUsersByids(String ids) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getUsersByids(ids);
  }
  
  public User[] getUsersByRes(String res) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getUsersByRes(res);
  }
  
  public Sys_bumen[] geyDeptList(int fid) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.geyDeptList(fid);
  }
  
  public User[] getUsersByDeptId(int deptId) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getUsersByDeptId(deptId);
  }
  
  public Sys_bumen getNewDeptByUserpin(String pin) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getNewDeptByUserpin(pin);
  }
  
  public Sys_bumen[] getNewDeptListByUserpin(String pin) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getNewDeptListByUserpin(pin);
  }
  
  public Sys_bumen getSys_BumenById(int bm_id) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getSys_BumenById(bm_id);
  }
  
  public String getBumenInfoByUserPin(String pin) throws java.rmi.RemoteException{
    if (deptWebServiceSoap == null)
      _initDeptWebServiceSoapProxy();
    return deptWebServiceSoap.getBumenInfoByUserPin(pin);
  }
  
  
}