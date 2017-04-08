/**
 * EmployeeQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jd.web.ws.client.hrm;

public class EmployeeQuery  extends Employee  implements java.io.Serializable {
    private Integer enableViewJG;

    private String multiDepID;

    private String multiPostID;

    private String bm_name;

    private String subcom;

    public EmployeeQuery() {
    }

    public EmployeeQuery(
           int pageIndex,
           int pageSize,
           int recordCount,
           String sort,
           int orgid,
           int bm_newid,
           String jbxx_hkxz,
           String jbxx_yns,
           String jbxx_ynk,
           String jbxx_yold,
           int onint,
           int onin,
           int cg_id,
           int jbxx_id,
           int bm_id,
           int zw_id,
           int zwu_id,
           int jg_id,
           int cs_id,
           String jbxx_xm,
           String jbxx_sex,
           java.util.Calendar jbxx_csrq,
           java.util.Calendar jbxx_rzrq,
           java.util.Calendar jbxx_zzrq,
           String jbxx_hyzk,
           String jbxx_zzmm,
           String jbxx_mz,
           String jbxx_jg,
           String jbxx_xl,
           String jbxx_zy,
           String jbxx_byyx,
           String jbxx_lxdz,
           String jbxx_dzxx,
           String jbxx_sfzh,
           String jbxx_lxdh,
           String jbxx_dbr,
           String jbxx_dbrsfz,
           String jbxx_dbrzz,
           String jbxx_dbrdh,
           String jbxx_cczm,
           String jbxx_fj,
           String jbxx_qtlxr,
           String jbxx_qtlxrdh,
           String jbxx_zzzt,
           java.util.Calendar jbxx_lzrq,
           String jbxx_lzyy,
           String jbxx_bz,
           String jbxx_zp,
           String jbxx_username,
           String jbxx_userpwd,
           String nf,
           String ibxx_dabh,
           String _bm_name,
           String cs_mc,
           byte[] jbxx_photo,
           String bankAccountName,
           String bankAccountNo,
           int qx_id,
           String ht_user,
           String ht_pass,
           String zwu_name,
           String zw_mc,
           Integer enableViewJG,
           String multiDepID,
           String multiPostID,
           String bm_name,
           String subcom) {
        super(
            pageIndex,
            pageSize,
            recordCount,
            sort,
            orgid,
            bm_newid,
            jbxx_hkxz,
            jbxx_yns,
            jbxx_ynk,
            jbxx_yold,
            onint,
            onin,
            cg_id,
            jbxx_id,
            bm_id,
            zw_id,
            zwu_id,
            jg_id,
            cs_id,
            jbxx_xm,
            jbxx_sex,
            jbxx_csrq,
            jbxx_rzrq,
            jbxx_zzrq,
            jbxx_hyzk,
            jbxx_zzmm,
            jbxx_mz,
            jbxx_jg,
            jbxx_xl,
            jbxx_zy,
            jbxx_byyx,
            jbxx_lxdz,
            jbxx_dzxx,
            jbxx_sfzh,
            jbxx_lxdh,
            jbxx_dbr,
            jbxx_dbrsfz,
            jbxx_dbrzz,
            jbxx_dbrdh,
            jbxx_cczm,
            jbxx_fj,
            jbxx_qtlxr,
            jbxx_qtlxrdh,
            jbxx_zzzt,
            jbxx_lzrq,
            jbxx_lzyy,
            jbxx_bz,
            jbxx_zp,
            jbxx_username,
            jbxx_userpwd,
            nf,
            ibxx_dabh,
            _bm_name,
            cs_mc,
            jbxx_photo,
            bankAccountName,
            bankAccountNo,
            qx_id,
            ht_user,
            ht_pass,
            zwu_name,
            zw_mc);
        this.enableViewJG = enableViewJG;
        this.multiDepID = multiDepID;
        this.multiPostID = multiPostID;
        this.bm_name = bm_name;
        this.subcom = subcom;
    }


    /**
     * Gets the enableViewJG value for this EmployeeQuery.
     * 
     * @return enableViewJG
     */
    public Integer getEnableViewJG() {
        return enableViewJG;
    }


    /**
     * Sets the enableViewJG value for this EmployeeQuery.
     * 
     * @param enableViewJG
     */
    public void setEnableViewJG(Integer enableViewJG) {
        this.enableViewJG = enableViewJG;
    }


    /**
     * Gets the multiDepID value for this EmployeeQuery.
     * 
     * @return multiDepID
     */
    public String getMultiDepID() {
        return multiDepID;
    }


    /**
     * Sets the multiDepID value for this EmployeeQuery.
     * 
     * @param multiDepID
     */
    public void setMultiDepID(String multiDepID) {
        this.multiDepID = multiDepID;
    }


    /**
     * Gets the multiPostID value for this EmployeeQuery.
     * 
     * @return multiPostID
     */
    public String getMultiPostID() {
        return multiPostID;
    }


    /**
     * Sets the multiPostID value for this EmployeeQuery.
     * 
     * @param multiPostID
     */
    public void setMultiPostID(String multiPostID) {
        this.multiPostID = multiPostID;
    }


    /**
     * Gets the bm_name value for this EmployeeQuery.
     * 
     * @return bm_name
     */
    public String getBm_name() {
        return bm_name;
    }


    /**
     * Sets the bm_name value for this EmployeeQuery.
     * 
     * @param bm_name
     */
    public void setBm_name(String bm_name) {
        this.bm_name = bm_name;
    }


    /**
     * Gets the subcom value for this EmployeeQuery.
     * 
     * @return subcom
     */
    public String getSubcom() {
        return subcom;
    }


    /**
     * Sets the subcom value for this EmployeeQuery.
     * 
     * @param subcom
     */
    public void setSubcom(String subcom) {
        this.subcom = subcom;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmployeeQuery)) return false;
        EmployeeQuery other = (EmployeeQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enableViewJG==null && other.getEnableViewJG()==null) || 
             (this.enableViewJG!=null &&
              this.enableViewJG.equals(other.getEnableViewJG()))) &&
            ((this.multiDepID==null && other.getMultiDepID()==null) || 
             (this.multiDepID!=null &&
              this.multiDepID.equals(other.getMultiDepID()))) &&
            ((this.multiPostID==null && other.getMultiPostID()==null) || 
             (this.multiPostID!=null &&
              this.multiPostID.equals(other.getMultiPostID()))) &&
            ((this.bm_name==null && other.getBm_name()==null) || 
             (this.bm_name!=null &&
              this.bm_name.equals(other.getBm_name()))) &&
            ((this.subcom==null && other.getSubcom()==null) || 
             (this.subcom!=null &&
              this.subcom.equals(other.getSubcom())));
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
        if (getEnableViewJG() != null) {
            _hashCode += getEnableViewJG().hashCode();
        }
        if (getMultiDepID() != null) {
            _hashCode += getMultiDepID().hashCode();
        }
        if (getMultiPostID() != null) {
            _hashCode += getMultiPostID().hashCode();
        }
        if (getBm_name() != null) {
            _hashCode += getBm_name().hashCode();
        }
        if (getSubcom() != null) {
            _hashCode += getSubcom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://360buy.com/", "EmployeeQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableViewJG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "EnableViewJG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiDepID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "MultiDepID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiPostID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "MultiPostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bm_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Bm_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subcom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "subcom"));
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
