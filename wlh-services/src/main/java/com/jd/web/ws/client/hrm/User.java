/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jd.web.ws.client.hrm;

public class User  extends PermissionBase  implements java.io.Serializable {
    private String aliasName;

    private int cityId;

    private String cityName;

    private Dept dept;

    private String email;

    private boolean isAuthenticated;

    private String isReserved;

    private String nativePlace;

    private int organizationId;

    private String organizationName;

    private String password;

    private String phone;

    private int positionId;

    private String positionName;

    private String realName;

    public User() {
    }

    public User(
           int pageIndex,
           int pageSize,
           int recordCount,
           String sort,
           String description,
           int id,
           String name,
           int sequence,
           String aliasName,
           int cityId,
           String cityName,
           Dept dept,
           String email,
           boolean isAuthenticated,
           String isReserved,
           String nativePlace,
           int organizationId,
           String organizationName,
           String password,
           String phone,
           int positionId,
           String positionName,
           String realName) {
        super(
            pageIndex,
            pageSize,
            recordCount,
            sort,
            description,
            id,
            name,
            sequence);
        this.aliasName = aliasName;
        this.cityId = cityId;
        this.cityName = cityName;
        this.dept = dept;
        this.email = email;
        this.isAuthenticated = isAuthenticated;
        this.isReserved = isReserved;
        this.nativePlace = nativePlace;
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.password = password;
        this.phone = phone;
        this.positionId = positionId;
        this.positionName = positionName;
        this.realName = realName;
    }


    /**
     * Gets the aliasName value for this User.
     * 
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }


    /**
     * Sets the aliasName value for this User.
     * 
     * @param aliasName
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }


    /**
     * Gets the cityId value for this User.
     * 
     * @return cityId
     */
    public int getCityId() {
        return cityId;
    }


    /**
     * Sets the cityId value for this User.
     * 
     * @param cityId
     */
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


    /**
     * Gets the cityName value for this User.
     * 
     * @return cityName
     */
    public String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this User.
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the dept value for this User.
     * 
     * @return dept
     */
    public Dept getDept() {
        return dept;
    }


    /**
     * Sets the dept value for this User.
     * 
     * @param dept
     */
    public void setDept(Dept dept) {
        this.dept = dept;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the isAuthenticated value for this User.
     * 
     * @return isAuthenticated
     */
    public boolean isIsAuthenticated() {
        return isAuthenticated;
    }


    /**
     * Sets the isAuthenticated value for this User.
     * 
     * @param isAuthenticated
     */
    public void setIsAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }


    /**
     * Gets the isReserved value for this User.
     * 
     * @return isReserved
     */
    public String getIsReserved() {
        return isReserved;
    }


    /**
     * Sets the isReserved value for this User.
     * 
     * @param isReserved
     */
    public void setIsReserved(String isReserved) {
        this.isReserved = isReserved;
    }


    /**
     * Gets the nativePlace value for this User.
     * 
     * @return nativePlace
     */
    public String getNativePlace() {
        return nativePlace;
    }


    /**
     * Sets the nativePlace value for this User.
     * 
     * @param nativePlace
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }


    /**
     * Gets the organizationId value for this User.
     * 
     * @return organizationId
     */
    public int getOrganizationId() {
        return organizationId;
    }


    /**
     * Sets the organizationId value for this User.
     * 
     * @param organizationId
     */
    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }


    /**
     * Gets the organizationName value for this User.
     * 
     * @return organizationName
     */
    public String getOrganizationName() {
        return organizationName;
    }


    /**
     * Sets the organizationName value for this User.
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the phone value for this User.
     * 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this User.
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Gets the positionId value for this User.
     * 
     * @return positionId
     */
    public int getPositionId() {
        return positionId;
    }


    /**
     * Sets the positionId value for this User.
     * 
     * @param positionId
     */
    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }


    /**
     * Gets the positionName value for this User.
     * 
     * @return positionName
     */
    public String getPositionName() {
        return positionName;
    }


    /**
     * Sets the positionName value for this User.
     * 
     * @param positionName
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }


    /**
     * Gets the realName value for this User.
     * 
     * @return realName
     */
    public String getRealName() {
        return realName;
    }


    /**
     * Sets the realName value for this User.
     * 
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aliasName==null && other.getAliasName()==null) || 
             (this.aliasName!=null &&
              this.aliasName.equals(other.getAliasName()))) &&
            this.cityId == other.getCityId() &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.dept==null && other.getDept()==null) || 
             (this.dept!=null &&
              this.dept.equals(other.getDept()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.isAuthenticated == other.isIsAuthenticated() &&
            ((this.isReserved==null && other.getIsReserved()==null) || 
             (this.isReserved!=null &&
              this.isReserved.equals(other.getIsReserved()))) &&
            ((this.nativePlace==null && other.getNativePlace()==null) || 
             (this.nativePlace!=null &&
              this.nativePlace.equals(other.getNativePlace()))) &&
            this.organizationId == other.getOrganizationId() &&
            ((this.organizationName==null && other.getOrganizationName()==null) || 
             (this.organizationName!=null &&
              this.organizationName.equals(other.getOrganizationName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            this.positionId == other.getPositionId() &&
            ((this.positionName==null && other.getPositionName()==null) || 
             (this.positionName!=null &&
              this.positionName.equals(other.getPositionName()))) &&
            ((this.realName==null && other.getRealName()==null) || 
             (this.realName!=null &&
              this.realName.equals(other.getRealName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAliasName() != null) {
            _hashCode += getAliasName().hashCode();
        }
        _hashCode += getCityId();
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getDept() != null) {
            _hashCode += getDept().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += (isIsAuthenticated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIsReserved() != null) {
            _hashCode += getIsReserved().hashCode();
        }
        if (getNativePlace() != null) {
            _hashCode += getNativePlace().hashCode();
        }
        _hashCode += getOrganizationId();
        if (getOrganizationName() != null) {
            _hashCode += getOrganizationName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        _hashCode += getPositionId();
        if (getPositionName() != null) {
            _hashCode += getPositionName().hashCode();
        }
        if (getRealName() != null) {
            _hashCode += getRealName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://360buy.com/", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "AliasName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "CityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "CityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dept");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Dept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://360buy.com/", "Dept"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAuthenticated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "IsAuthenticated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "IsReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativePlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "NativePlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "OrganizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "OrganizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "PositionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "PositionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "RealName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
