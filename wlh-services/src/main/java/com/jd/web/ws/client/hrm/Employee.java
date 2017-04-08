/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jd.web.ws.client.hrm;

public class Employee  extends PaginationBase1  implements java.io.Serializable {
    private int orgid;

    private int bm_newid;

    private String jbxx_hkxz;

    private String jbxx_yns;

    private String jbxx_ynk;

    private String jbxx_yold;

    private int onint;

    private int onin;

    private int cg_id;

    private int jbxx_id;

    private int bm_id;

    private int zw_id;

    private int zwu_id;

    private int jg_id;

    private int cs_id;

    private String jbxx_xm;

    private String jbxx_sex;

    private java.util.Calendar jbxx_csrq;

    private java.util.Calendar jbxx_rzrq;

    private java.util.Calendar jbxx_zzrq;

    private String jbxx_hyzk;

    private String jbxx_zzmm;

    private String jbxx_mz;

    private String jbxx_jg;

    private String jbxx_xl;

    private String jbxx_zy;

    private String jbxx_byyx;

    private String jbxx_lxdz;

    private String jbxx_dzxx;

    private String jbxx_sfzh;

    private String jbxx_lxdh;

    private String jbxx_dbr;

    private String jbxx_dbrsfz;

    private String jbxx_dbrzz;

    private String jbxx_dbrdh;

    private String jbxx_cczm;

    private String jbxx_fj;

    private String jbxx_qtlxr;

    private String jbxx_qtlxrdh;

    private String jbxx_zzzt;

    private java.util.Calendar jbxx_lzrq;

    private String jbxx_lzyy;

    private String jbxx_bz;

    private String jbxx_zp;

    private String jbxx_username;

    private String jbxx_userpwd;

    private String nf;

    private String ibxx_dabh;

    private String bm_name;

    private String cs_mc;

    private byte[] jbxx_photo;

    private String bankAccountName;

    private String bankAccountNo;

    private int qx_id;

    private String ht_user;

    private String ht_pass;

    private String zwu_name;

    private String zw_mc;

    public Employee() {
    }

    public Employee(
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
           String bm_name,
           String cs_mc,
           byte[] jbxx_photo,
           String bankAccountName,
           String bankAccountNo,
           int qx_id,
           String ht_user,
           String ht_pass,
           String zwu_name,
           String zw_mc) {
        super(
            pageIndex,
            pageSize,
            recordCount,
            sort);
        this.orgid = orgid;
        this.bm_newid = bm_newid;
        this.jbxx_hkxz = jbxx_hkxz;
        this.jbxx_yns = jbxx_yns;
        this.jbxx_ynk = jbxx_ynk;
        this.jbxx_yold = jbxx_yold;
        this.onint = onint;
        this.onin = onin;
        this.cg_id = cg_id;
        this.jbxx_id = jbxx_id;
        this.bm_id = bm_id;
        this.zw_id = zw_id;
        this.zwu_id = zwu_id;
        this.jg_id = jg_id;
        this.cs_id = cs_id;
        this.jbxx_xm = jbxx_xm;
        this.jbxx_sex = jbxx_sex;
        this.jbxx_csrq = jbxx_csrq;
        this.jbxx_rzrq = jbxx_rzrq;
        this.jbxx_zzrq = jbxx_zzrq;
        this.jbxx_hyzk = jbxx_hyzk;
        this.jbxx_zzmm = jbxx_zzmm;
        this.jbxx_mz = jbxx_mz;
        this.jbxx_jg = jbxx_jg;
        this.jbxx_xl = jbxx_xl;
        this.jbxx_zy = jbxx_zy;
        this.jbxx_byyx = jbxx_byyx;
        this.jbxx_lxdz = jbxx_lxdz;
        this.jbxx_dzxx = jbxx_dzxx;
        this.jbxx_sfzh = jbxx_sfzh;
        this.jbxx_lxdh = jbxx_lxdh;
        this.jbxx_dbr = jbxx_dbr;
        this.jbxx_dbrsfz = jbxx_dbrsfz;
        this.jbxx_dbrzz = jbxx_dbrzz;
        this.jbxx_dbrdh = jbxx_dbrdh;
        this.jbxx_cczm = jbxx_cczm;
        this.jbxx_fj = jbxx_fj;
        this.jbxx_qtlxr = jbxx_qtlxr;
        this.jbxx_qtlxrdh = jbxx_qtlxrdh;
        this.jbxx_zzzt = jbxx_zzzt;
        this.jbxx_lzrq = jbxx_lzrq;
        this.jbxx_lzyy = jbxx_lzyy;
        this.jbxx_bz = jbxx_bz;
        this.jbxx_zp = jbxx_zp;
        this.jbxx_username = jbxx_username;
        this.jbxx_userpwd = jbxx_userpwd;
        this.nf = nf;
        this.ibxx_dabh = ibxx_dabh;
        this.bm_name = bm_name;
        this.cs_mc = cs_mc;
        this.jbxx_photo = jbxx_photo;
        this.bankAccountName = bankAccountName;
        this.bankAccountNo = bankAccountNo;
        this.qx_id = qx_id;
        this.ht_user = ht_user;
        this.ht_pass = ht_pass;
        this.zwu_name = zwu_name;
        this.zw_mc = zw_mc;
    }


    /**
     * Gets the orgid value for this Employee.
     * 
     * @return orgid
     */
    public int getOrgid() {
        return orgid;
    }


    /**
     * Sets the orgid value for this Employee.
     * 
     * @param orgid
     */
    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }


    /**
     * Gets the bm_newid value for this Employee.
     * 
     * @return bm_newid
     */
    public int getBm_newid() {
        return bm_newid;
    }


    /**
     * Sets the bm_newid value for this Employee.
     * 
     * @param bm_newid
     */
    public void setBm_newid(int bm_newid) {
        this.bm_newid = bm_newid;
    }


    /**
     * Gets the jbxx_hkxz value for this Employee.
     * 
     * @return jbxx_hkxz
     */
    public String getJbxx_hkxz() {
        return jbxx_hkxz;
    }


    /**
     * Sets the jbxx_hkxz value for this Employee.
     * 
     * @param jbxx_hkxz
     */
    public void setJbxx_hkxz(String jbxx_hkxz) {
        this.jbxx_hkxz = jbxx_hkxz;
    }


    /**
     * Gets the jbxx_yns value for this Employee.
     * 
     * @return jbxx_yns
     */
    public String getJbxx_yns() {
        return jbxx_yns;
    }


    /**
     * Sets the jbxx_yns value for this Employee.
     * 
     * @param jbxx_yns
     */
    public void setJbxx_yns(String jbxx_yns) {
        this.jbxx_yns = jbxx_yns;
    }


    /**
     * Gets the jbxx_ynk value for this Employee.
     * 
     * @return jbxx_ynk
     */
    public String getJbxx_ynk() {
        return jbxx_ynk;
    }


    /**
     * Sets the jbxx_ynk value for this Employee.
     * 
     * @param jbxx_ynk
     */
    public void setJbxx_ynk(String jbxx_ynk) {
        this.jbxx_ynk = jbxx_ynk;
    }


    /**
     * Gets the jbxx_yold value for this Employee.
     * 
     * @return jbxx_yold
     */
    public String getJbxx_yold() {
        return jbxx_yold;
    }


    /**
     * Sets the jbxx_yold value for this Employee.
     * 
     * @param jbxx_yold
     */
    public void setJbxx_yold(String jbxx_yold) {
        this.jbxx_yold = jbxx_yold;
    }


    /**
     * Gets the onint value for this Employee.
     * 
     * @return onint
     */
    public int getOnint() {
        return onint;
    }


    /**
     * Sets the onint value for this Employee.
     * 
     * @param onint
     */
    public void setOnint(int onint) {
        this.onint = onint;
    }


    /**
     * Gets the onin value for this Employee.
     * 
     * @return onin
     */
    public int getOnin() {
        return onin;
    }


    /**
     * Sets the onin value for this Employee.
     * 
     * @param onin
     */
    public void setOnin(int onin) {
        this.onin = onin;
    }


    /**
     * Gets the cg_id value for this Employee.
     * 
     * @return cg_id
     */
    public int getCg_id() {
        return cg_id;
    }


    /**
     * Sets the cg_id value for this Employee.
     * 
     * @param cg_id
     */
    public void setCg_id(int cg_id) {
        this.cg_id = cg_id;
    }


    /**
     * Gets the jbxx_id value for this Employee.
     * 
     * @return jbxx_id
     */
    public int getJbxx_id() {
        return jbxx_id;
    }


    /**
     * Sets the jbxx_id value for this Employee.
     * 
     * @param jbxx_id
     */
    public void setJbxx_id(int jbxx_id) {
        this.jbxx_id = jbxx_id;
    }


    /**
     * Gets the bm_id value for this Employee.
     * 
     * @return bm_id
     */
    public int getBm_id() {
        return bm_id;
    }


    /**
     * Sets the bm_id value for this Employee.
     * 
     * @param bm_id
     */
    public void setBm_id(int bm_id) {
        this.bm_id = bm_id;
    }


    /**
     * Gets the zw_id value for this Employee.
     * 
     * @return zw_id
     */
    public int getZw_id() {
        return zw_id;
    }


    /**
     * Sets the zw_id value for this Employee.
     * 
     * @param zw_id
     */
    public void setZw_id(int zw_id) {
        this.zw_id = zw_id;
    }


    /**
     * Gets the zwu_id value for this Employee.
     * 
     * @return zwu_id
     */
    public int getZwu_id() {
        return zwu_id;
    }


    /**
     * Sets the zwu_id value for this Employee.
     * 
     * @param zwu_id
     */
    public void setZwu_id(int zwu_id) {
        this.zwu_id = zwu_id;
    }


    /**
     * Gets the jg_id value for this Employee.
     * 
     * @return jg_id
     */
    public int getJg_id() {
        return jg_id;
    }


    /**
     * Sets the jg_id value for this Employee.
     * 
     * @param jg_id
     */
    public void setJg_id(int jg_id) {
        this.jg_id = jg_id;
    }


    /**
     * Gets the cs_id value for this Employee.
     * 
     * @return cs_id
     */
    public int getCs_id() {
        return cs_id;
    }


    /**
     * Sets the cs_id value for this Employee.
     * 
     * @param cs_id
     */
    public void setCs_id(int cs_id) {
        this.cs_id = cs_id;
    }


    /**
     * Gets the jbxx_xm value for this Employee.
     * 
     * @return jbxx_xm
     */
    public String getJbxx_xm() {
        return jbxx_xm;
    }


    /**
     * Sets the jbxx_xm value for this Employee.
     * 
     * @param jbxx_xm
     */
    public void setJbxx_xm(String jbxx_xm) {
        this.jbxx_xm = jbxx_xm;
    }


    /**
     * Gets the jbxx_sex value for this Employee.
     * 
     * @return jbxx_sex
     */
    public String getJbxx_sex() {
        return jbxx_sex;
    }


    /**
     * Sets the jbxx_sex value for this Employee.
     * 
     * @param jbxx_sex
     */
    public void setJbxx_sex(String jbxx_sex) {
        this.jbxx_sex = jbxx_sex;
    }


    /**
     * Gets the jbxx_csrq value for this Employee.
     * 
     * @return jbxx_csrq
     */
    public java.util.Calendar getJbxx_csrq() {
        return jbxx_csrq;
    }


    /**
     * Sets the jbxx_csrq value for this Employee.
     * 
     * @param jbxx_csrq
     */
    public void setJbxx_csrq(java.util.Calendar jbxx_csrq) {
        this.jbxx_csrq = jbxx_csrq;
    }


    /**
     * Gets the jbxx_rzrq value for this Employee.
     * 
     * @return jbxx_rzrq
     */
    public java.util.Calendar getJbxx_rzrq() {
        return jbxx_rzrq;
    }


    /**
     * Sets the jbxx_rzrq value for this Employee.
     * 
     * @param jbxx_rzrq
     */
    public void setJbxx_rzrq(java.util.Calendar jbxx_rzrq) {
        this.jbxx_rzrq = jbxx_rzrq;
    }


    /**
     * Gets the jbxx_zzrq value for this Employee.
     * 
     * @return jbxx_zzrq
     */
    public java.util.Calendar getJbxx_zzrq() {
        return jbxx_zzrq;
    }


    /**
     * Sets the jbxx_zzrq value for this Employee.
     * 
     * @param jbxx_zzrq
     */
    public void setJbxx_zzrq(java.util.Calendar jbxx_zzrq) {
        this.jbxx_zzrq = jbxx_zzrq;
    }


    /**
     * Gets the jbxx_hyzk value for this Employee.
     * 
     * @return jbxx_hyzk
     */
    public String getJbxx_hyzk() {
        return jbxx_hyzk;
    }


    /**
     * Sets the jbxx_hyzk value for this Employee.
     * 
     * @param jbxx_hyzk
     */
    public void setJbxx_hyzk(String jbxx_hyzk) {
        this.jbxx_hyzk = jbxx_hyzk;
    }


    /**
     * Gets the jbxx_zzmm value for this Employee.
     * 
     * @return jbxx_zzmm
     */
    public String getJbxx_zzmm() {
        return jbxx_zzmm;
    }


    /**
     * Sets the jbxx_zzmm value for this Employee.
     * 
     * @param jbxx_zzmm
     */
    public void setJbxx_zzmm(String jbxx_zzmm) {
        this.jbxx_zzmm = jbxx_zzmm;
    }


    /**
     * Gets the jbxx_mz value for this Employee.
     * 
     * @return jbxx_mz
     */
    public String getJbxx_mz() {
        return jbxx_mz;
    }


    /**
     * Sets the jbxx_mz value for this Employee.
     * 
     * @param jbxx_mz
     */
    public void setJbxx_mz(String jbxx_mz) {
        this.jbxx_mz = jbxx_mz;
    }


    /**
     * Gets the jbxx_jg value for this Employee.
     * 
     * @return jbxx_jg
     */
    public String getJbxx_jg() {
        return jbxx_jg;
    }


    /**
     * Sets the jbxx_jg value for this Employee.
     * 
     * @param jbxx_jg
     */
    public void setJbxx_jg(String jbxx_jg) {
        this.jbxx_jg = jbxx_jg;
    }


    /**
     * Gets the jbxx_xl value for this Employee.
     * 
     * @return jbxx_xl
     */
    public String getJbxx_xl() {
        return jbxx_xl;
    }


    /**
     * Sets the jbxx_xl value for this Employee.
     * 
     * @param jbxx_xl
     */
    public void setJbxx_xl(String jbxx_xl) {
        this.jbxx_xl = jbxx_xl;
    }


    /**
     * Gets the jbxx_zy value for this Employee.
     * 
     * @return jbxx_zy
     */
    public String getJbxx_zy() {
        return jbxx_zy;
    }


    /**
     * Sets the jbxx_zy value for this Employee.
     * 
     * @param jbxx_zy
     */
    public void setJbxx_zy(String jbxx_zy) {
        this.jbxx_zy = jbxx_zy;
    }


    /**
     * Gets the jbxx_byyx value for this Employee.
     * 
     * @return jbxx_byyx
     */
    public String getJbxx_byyx() {
        return jbxx_byyx;
    }


    /**
     * Sets the jbxx_byyx value for this Employee.
     * 
     * @param jbxx_byyx
     */
    public void setJbxx_byyx(String jbxx_byyx) {
        this.jbxx_byyx = jbxx_byyx;
    }


    /**
     * Gets the jbxx_lxdz value for this Employee.
     * 
     * @return jbxx_lxdz
     */
    public String getJbxx_lxdz() {
        return jbxx_lxdz;
    }


    /**
     * Sets the jbxx_lxdz value for this Employee.
     * 
     * @param jbxx_lxdz
     */
    public void setJbxx_lxdz(String jbxx_lxdz) {
        this.jbxx_lxdz = jbxx_lxdz;
    }


    /**
     * Gets the jbxx_dzxx value for this Employee.
     * 
     * @return jbxx_dzxx
     */
    public String getJbxx_dzxx() {
        return jbxx_dzxx;
    }


    /**
     * Sets the jbxx_dzxx value for this Employee.
     * 
     * @param jbxx_dzxx
     */
    public void setJbxx_dzxx(String jbxx_dzxx) {
        this.jbxx_dzxx = jbxx_dzxx;
    }


    /**
     * Gets the jbxx_sfzh value for this Employee.
     * 
     * @return jbxx_sfzh
     */
    public String getJbxx_sfzh() {
        return jbxx_sfzh;
    }


    /**
     * Sets the jbxx_sfzh value for this Employee.
     * 
     * @param jbxx_sfzh
     */
    public void setJbxx_sfzh(String jbxx_sfzh) {
        this.jbxx_sfzh = jbxx_sfzh;
    }


    /**
     * Gets the jbxx_lxdh value for this Employee.
     * 
     * @return jbxx_lxdh
     */
    public String getJbxx_lxdh() {
        return jbxx_lxdh;
    }


    /**
     * Sets the jbxx_lxdh value for this Employee.
     * 
     * @param jbxx_lxdh
     */
    public void setJbxx_lxdh(String jbxx_lxdh) {
        this.jbxx_lxdh = jbxx_lxdh;
    }


    /**
     * Gets the jbxx_dbr value for this Employee.
     * 
     * @return jbxx_dbr
     */
    public String getJbxx_dbr() {
        return jbxx_dbr;
    }


    /**
     * Sets the jbxx_dbr value for this Employee.
     * 
     * @param jbxx_dbr
     */
    public void setJbxx_dbr(String jbxx_dbr) {
        this.jbxx_dbr = jbxx_dbr;
    }


    /**
     * Gets the jbxx_dbrsfz value for this Employee.
     * 
     * @return jbxx_dbrsfz
     */
    public String getJbxx_dbrsfz() {
        return jbxx_dbrsfz;
    }


    /**
     * Sets the jbxx_dbrsfz value for this Employee.
     * 
     * @param jbxx_dbrsfz
     */
    public void setJbxx_dbrsfz(String jbxx_dbrsfz) {
        this.jbxx_dbrsfz = jbxx_dbrsfz;
    }


    /**
     * Gets the jbxx_dbrzz value for this Employee.
     * 
     * @return jbxx_dbrzz
     */
    public String getJbxx_dbrzz() {
        return jbxx_dbrzz;
    }


    /**
     * Sets the jbxx_dbrzz value for this Employee.
     * 
     * @param jbxx_dbrzz
     */
    public void setJbxx_dbrzz(String jbxx_dbrzz) {
        this.jbxx_dbrzz = jbxx_dbrzz;
    }


    /**
     * Gets the jbxx_dbrdh value for this Employee.
     * 
     * @return jbxx_dbrdh
     */
    public String getJbxx_dbrdh() {
        return jbxx_dbrdh;
    }


    /**
     * Sets the jbxx_dbrdh value for this Employee.
     * 
     * @param jbxx_dbrdh
     */
    public void setJbxx_dbrdh(String jbxx_dbrdh) {
        this.jbxx_dbrdh = jbxx_dbrdh;
    }


    /**
     * Gets the jbxx_cczm value for this Employee.
     * 
     * @return jbxx_cczm
     */
    public String getJbxx_cczm() {
        return jbxx_cczm;
    }


    /**
     * Sets the jbxx_cczm value for this Employee.
     * 
     * @param jbxx_cczm
     */
    public void setJbxx_cczm(String jbxx_cczm) {
        this.jbxx_cczm = jbxx_cczm;
    }


    /**
     * Gets the jbxx_fj value for this Employee.
     * 
     * @return jbxx_fj
     */
    public String getJbxx_fj() {
        return jbxx_fj;
    }


    /**
     * Sets the jbxx_fj value for this Employee.
     * 
     * @param jbxx_fj
     */
    public void setJbxx_fj(String jbxx_fj) {
        this.jbxx_fj = jbxx_fj;
    }


    /**
     * Gets the jbxx_qtlxr value for this Employee.
     * 
     * @return jbxx_qtlxr
     */
    public String getJbxx_qtlxr() {
        return jbxx_qtlxr;
    }


    /**
     * Sets the jbxx_qtlxr value for this Employee.
     * 
     * @param jbxx_qtlxr
     */
    public void setJbxx_qtlxr(String jbxx_qtlxr) {
        this.jbxx_qtlxr = jbxx_qtlxr;
    }


    /**
     * Gets the jbxx_qtlxrdh value for this Employee.
     * 
     * @return jbxx_qtlxrdh
     */
    public String getJbxx_qtlxrdh() {
        return jbxx_qtlxrdh;
    }


    /**
     * Sets the jbxx_qtlxrdh value for this Employee.
     * 
     * @param jbxx_qtlxrdh
     */
    public void setJbxx_qtlxrdh(String jbxx_qtlxrdh) {
        this.jbxx_qtlxrdh = jbxx_qtlxrdh;
    }


    /**
     * Gets the jbxx_zzzt value for this Employee.
     * 
     * @return jbxx_zzzt
     */
    public String getJbxx_zzzt() {
        return jbxx_zzzt;
    }


    /**
     * Sets the jbxx_zzzt value for this Employee.
     * 
     * @param jbxx_zzzt
     */
    public void setJbxx_zzzt(String jbxx_zzzt) {
        this.jbxx_zzzt = jbxx_zzzt;
    }


    /**
     * Gets the jbxx_lzrq value for this Employee.
     * 
     * @return jbxx_lzrq
     */
    public java.util.Calendar getJbxx_lzrq() {
        return jbxx_lzrq;
    }


    /**
     * Sets the jbxx_lzrq value for this Employee.
     * 
     * @param jbxx_lzrq
     */
    public void setJbxx_lzrq(java.util.Calendar jbxx_lzrq) {
        this.jbxx_lzrq = jbxx_lzrq;
    }


    /**
     * Gets the jbxx_lzyy value for this Employee.
     * 
     * @return jbxx_lzyy
     */
    public String getJbxx_lzyy() {
        return jbxx_lzyy;
    }


    /**
     * Sets the jbxx_lzyy value for this Employee.
     * 
     * @param jbxx_lzyy
     */
    public void setJbxx_lzyy(String jbxx_lzyy) {
        this.jbxx_lzyy = jbxx_lzyy;
    }


    /**
     * Gets the jbxx_bz value for this Employee.
     * 
     * @return jbxx_bz
     */
    public String getJbxx_bz() {
        return jbxx_bz;
    }


    /**
     * Sets the jbxx_bz value for this Employee.
     * 
     * @param jbxx_bz
     */
    public void setJbxx_bz(String jbxx_bz) {
        this.jbxx_bz = jbxx_bz;
    }


    /**
     * Gets the jbxx_zp value for this Employee.
     * 
     * @return jbxx_zp
     */
    public String getJbxx_zp() {
        return jbxx_zp;
    }


    /**
     * Sets the jbxx_zp value for this Employee.
     * 
     * @param jbxx_zp
     */
    public void setJbxx_zp(String jbxx_zp) {
        this.jbxx_zp = jbxx_zp;
    }


    /**
     * Gets the jbxx_username value for this Employee.
     * 
     * @return jbxx_username
     */
    public String getJbxx_username() {
        return jbxx_username;
    }


    /**
     * Sets the jbxx_username value for this Employee.
     * 
     * @param jbxx_username
     */
    public void setJbxx_username(String jbxx_username) {
        this.jbxx_username = jbxx_username;
    }


    /**
     * Gets the jbxx_userpwd value for this Employee.
     * 
     * @return jbxx_userpwd
     */
    public String getJbxx_userpwd() {
        return jbxx_userpwd;
    }


    /**
     * Sets the jbxx_userpwd value for this Employee.
     * 
     * @param jbxx_userpwd
     */
    public void setJbxx_userpwd(String jbxx_userpwd) {
        this.jbxx_userpwd = jbxx_userpwd;
    }


    /**
     * Gets the nf value for this Employee.
     * 
     * @return nf
     */
    public String getNf() {
        return nf;
    }


    /**
     * Sets the nf value for this Employee.
     * 
     * @param nf
     */
    public void setNf(String nf) {
        this.nf = nf;
    }


    /**
     * Gets the ibxx_dabh value for this Employee.
     * 
     * @return ibxx_dabh
     */
    public String getIbxx_dabh() {
        return ibxx_dabh;
    }


    /**
     * Sets the ibxx_dabh value for this Employee.
     * 
     * @param ibxx_dabh
     */
    public void setIbxx_dabh(String ibxx_dabh) {
        this.ibxx_dabh = ibxx_dabh;
    }


    /**
     * Gets the bm_name value for this Employee.
     * 
     * @return bm_name
     */
    public String getBm_name() {
        return bm_name;
    }


    /**
     * Sets the bm_name value for this Employee.
     * 
     * @param bm_name
     */
    public void setBm_name(String bm_name) {
        this.bm_name = bm_name;
    }


    /**
     * Gets the cs_mc value for this Employee.
     * 
     * @return cs_mc
     */
    public String getCs_mc() {
        return cs_mc;
    }


    /**
     * Sets the cs_mc value for this Employee.
     * 
     * @param cs_mc
     */
    public void setCs_mc(String cs_mc) {
        this.cs_mc = cs_mc;
    }


    /**
     * Gets the jbxx_photo value for this Employee.
     * 
     * @return jbxx_photo
     */
    public byte[] getJbxx_photo() {
        return jbxx_photo;
    }


    /**
     * Sets the jbxx_photo value for this Employee.
     * 
     * @param jbxx_photo
     */
    public void setJbxx_photo(byte[] jbxx_photo) {
        this.jbxx_photo = jbxx_photo;
    }


    /**
     * Gets the bankAccountName value for this Employee.
     * 
     * @return bankAccountName
     */
    public String getBankAccountName() {
        return bankAccountName;
    }


    /**
     * Sets the bankAccountName value for this Employee.
     * 
     * @param bankAccountName
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }


    /**
     * Gets the bankAccountNo value for this Employee.
     * 
     * @return bankAccountNo
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }


    /**
     * Sets the bankAccountNo value for this Employee.
     * 
     * @param bankAccountNo
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }


    /**
     * Gets the qx_id value for this Employee.
     * 
     * @return qx_id
     */
    public int getQx_id() {
        return qx_id;
    }


    /**
     * Sets the qx_id value for this Employee.
     * 
     * @param qx_id
     */
    public void setQx_id(int qx_id) {
        this.qx_id = qx_id;
    }


    /**
     * Gets the ht_user value for this Employee.
     * 
     * @return ht_user
     */
    public String getHt_user() {
        return ht_user;
    }


    /**
     * Sets the ht_user value for this Employee.
     * 
     * @param ht_user
     */
    public void setHt_user(String ht_user) {
        this.ht_user = ht_user;
    }


    /**
     * Gets the ht_pass value for this Employee.
     * 
     * @return ht_pass
     */
    public String getHt_pass() {
        return ht_pass;
    }


    /**
     * Sets the ht_pass value for this Employee.
     * 
     * @param ht_pass
     */
    public void setHt_pass(String ht_pass) {
        this.ht_pass = ht_pass;
    }


    /**
     * Gets the zwu_name value for this Employee.
     * 
     * @return zwu_name
     */
    public String getZwu_name() {
        return zwu_name;
    }


    /**
     * Sets the zwu_name value for this Employee.
     * 
     * @param zwu_name
     */
    public void setZwu_name(String zwu_name) {
        this.zwu_name = zwu_name;
    }


    /**
     * Gets the zw_mc value for this Employee.
     * 
     * @return zw_mc
     */
    public String getZw_mc() {
        return zw_mc;
    }


    /**
     * Sets the zw_mc value for this Employee.
     * 
     * @param zw_mc
     */
    public void setZw_mc(String zw_mc) {
        this.zw_mc = zw_mc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.orgid == other.getOrgid() &&
            this.bm_newid == other.getBm_newid() &&
            ((this.jbxx_hkxz==null && other.getJbxx_hkxz()==null) || 
             (this.jbxx_hkxz!=null &&
              this.jbxx_hkxz.equals(other.getJbxx_hkxz()))) &&
            ((this.jbxx_yns==null && other.getJbxx_yns()==null) || 
             (this.jbxx_yns!=null &&
              this.jbxx_yns.equals(other.getJbxx_yns()))) &&
            ((this.jbxx_ynk==null && other.getJbxx_ynk()==null) || 
             (this.jbxx_ynk!=null &&
              this.jbxx_ynk.equals(other.getJbxx_ynk()))) &&
            ((this.jbxx_yold==null && other.getJbxx_yold()==null) || 
             (this.jbxx_yold!=null &&
              this.jbxx_yold.equals(other.getJbxx_yold()))) &&
            this.onint == other.getOnint() &&
            this.onin == other.getOnin() &&
            this.cg_id == other.getCg_id() &&
            this.jbxx_id == other.getJbxx_id() &&
            this.bm_id == other.getBm_id() &&
            this.zw_id == other.getZw_id() &&
            this.zwu_id == other.getZwu_id() &&
            this.jg_id == other.getJg_id() &&
            this.cs_id == other.getCs_id() &&
            ((this.jbxx_xm==null && other.getJbxx_xm()==null) || 
             (this.jbxx_xm!=null &&
              this.jbxx_xm.equals(other.getJbxx_xm()))) &&
            ((this.jbxx_sex==null && other.getJbxx_sex()==null) || 
             (this.jbxx_sex!=null &&
              this.jbxx_sex.equals(other.getJbxx_sex()))) &&
            ((this.jbxx_csrq==null && other.getJbxx_csrq()==null) || 
             (this.jbxx_csrq!=null &&
              this.jbxx_csrq.equals(other.getJbxx_csrq()))) &&
            ((this.jbxx_rzrq==null && other.getJbxx_rzrq()==null) || 
             (this.jbxx_rzrq!=null &&
              this.jbxx_rzrq.equals(other.getJbxx_rzrq()))) &&
            ((this.jbxx_zzrq==null && other.getJbxx_zzrq()==null) || 
             (this.jbxx_zzrq!=null &&
              this.jbxx_zzrq.equals(other.getJbxx_zzrq()))) &&
            ((this.jbxx_hyzk==null && other.getJbxx_hyzk()==null) || 
             (this.jbxx_hyzk!=null &&
              this.jbxx_hyzk.equals(other.getJbxx_hyzk()))) &&
            ((this.jbxx_zzmm==null && other.getJbxx_zzmm()==null) || 
             (this.jbxx_zzmm!=null &&
              this.jbxx_zzmm.equals(other.getJbxx_zzmm()))) &&
            ((this.jbxx_mz==null && other.getJbxx_mz()==null) || 
             (this.jbxx_mz!=null &&
              this.jbxx_mz.equals(other.getJbxx_mz()))) &&
            ((this.jbxx_jg==null && other.getJbxx_jg()==null) || 
             (this.jbxx_jg!=null &&
              this.jbxx_jg.equals(other.getJbxx_jg()))) &&
            ((this.jbxx_xl==null && other.getJbxx_xl()==null) || 
             (this.jbxx_xl!=null &&
              this.jbxx_xl.equals(other.getJbxx_xl()))) &&
            ((this.jbxx_zy==null && other.getJbxx_zy()==null) || 
             (this.jbxx_zy!=null &&
              this.jbxx_zy.equals(other.getJbxx_zy()))) &&
            ((this.jbxx_byyx==null && other.getJbxx_byyx()==null) || 
             (this.jbxx_byyx!=null &&
              this.jbxx_byyx.equals(other.getJbxx_byyx()))) &&
            ((this.jbxx_lxdz==null && other.getJbxx_lxdz()==null) || 
             (this.jbxx_lxdz!=null &&
              this.jbxx_lxdz.equals(other.getJbxx_lxdz()))) &&
            ((this.jbxx_dzxx==null && other.getJbxx_dzxx()==null) || 
             (this.jbxx_dzxx!=null &&
              this.jbxx_dzxx.equals(other.getJbxx_dzxx()))) &&
            ((this.jbxx_sfzh==null && other.getJbxx_sfzh()==null) || 
             (this.jbxx_sfzh!=null &&
              this.jbxx_sfzh.equals(other.getJbxx_sfzh()))) &&
            ((this.jbxx_lxdh==null && other.getJbxx_lxdh()==null) || 
             (this.jbxx_lxdh!=null &&
              this.jbxx_lxdh.equals(other.getJbxx_lxdh()))) &&
            ((this.jbxx_dbr==null && other.getJbxx_dbr()==null) || 
             (this.jbxx_dbr!=null &&
              this.jbxx_dbr.equals(other.getJbxx_dbr()))) &&
            ((this.jbxx_dbrsfz==null && other.getJbxx_dbrsfz()==null) || 
             (this.jbxx_dbrsfz!=null &&
              this.jbxx_dbrsfz.equals(other.getJbxx_dbrsfz()))) &&
            ((this.jbxx_dbrzz==null && other.getJbxx_dbrzz()==null) || 
             (this.jbxx_dbrzz!=null &&
              this.jbxx_dbrzz.equals(other.getJbxx_dbrzz()))) &&
            ((this.jbxx_dbrdh==null && other.getJbxx_dbrdh()==null) || 
             (this.jbxx_dbrdh!=null &&
              this.jbxx_dbrdh.equals(other.getJbxx_dbrdh()))) &&
            ((this.jbxx_cczm==null && other.getJbxx_cczm()==null) || 
             (this.jbxx_cczm!=null &&
              this.jbxx_cczm.equals(other.getJbxx_cczm()))) &&
            ((this.jbxx_fj==null && other.getJbxx_fj()==null) || 
             (this.jbxx_fj!=null &&
              this.jbxx_fj.equals(other.getJbxx_fj()))) &&
            ((this.jbxx_qtlxr==null && other.getJbxx_qtlxr()==null) || 
             (this.jbxx_qtlxr!=null &&
              this.jbxx_qtlxr.equals(other.getJbxx_qtlxr()))) &&
            ((this.jbxx_qtlxrdh==null && other.getJbxx_qtlxrdh()==null) || 
             (this.jbxx_qtlxrdh!=null &&
              this.jbxx_qtlxrdh.equals(other.getJbxx_qtlxrdh()))) &&
            ((this.jbxx_zzzt==null && other.getJbxx_zzzt()==null) || 
             (this.jbxx_zzzt!=null &&
              this.jbxx_zzzt.equals(other.getJbxx_zzzt()))) &&
            ((this.jbxx_lzrq==null && other.getJbxx_lzrq()==null) || 
             (this.jbxx_lzrq!=null &&
              this.jbxx_lzrq.equals(other.getJbxx_lzrq()))) &&
            ((this.jbxx_lzyy==null && other.getJbxx_lzyy()==null) || 
             (this.jbxx_lzyy!=null &&
              this.jbxx_lzyy.equals(other.getJbxx_lzyy()))) &&
            ((this.jbxx_bz==null && other.getJbxx_bz()==null) || 
             (this.jbxx_bz!=null &&
              this.jbxx_bz.equals(other.getJbxx_bz()))) &&
            ((this.jbxx_zp==null && other.getJbxx_zp()==null) || 
             (this.jbxx_zp!=null &&
              this.jbxx_zp.equals(other.getJbxx_zp()))) &&
            ((this.jbxx_username==null && other.getJbxx_username()==null) || 
             (this.jbxx_username!=null &&
              this.jbxx_username.equals(other.getJbxx_username()))) &&
            ((this.jbxx_userpwd==null && other.getJbxx_userpwd()==null) || 
             (this.jbxx_userpwd!=null &&
              this.jbxx_userpwd.equals(other.getJbxx_userpwd()))) &&
            ((this.nf==null && other.getNf()==null) || 
             (this.nf!=null &&
              this.nf.equals(other.getNf()))) &&
            ((this.ibxx_dabh==null && other.getIbxx_dabh()==null) || 
             (this.ibxx_dabh!=null &&
              this.ibxx_dabh.equals(other.getIbxx_dabh()))) &&
            ((this.bm_name==null && other.getBm_name()==null) || 
             (this.bm_name!=null &&
              this.bm_name.equals(other.getBm_name()))) &&
            ((this.cs_mc==null && other.getCs_mc()==null) || 
             (this.cs_mc!=null &&
              this.cs_mc.equals(other.getCs_mc()))) &&
            ((this.jbxx_photo==null && other.getJbxx_photo()==null) || 
             (this.jbxx_photo!=null &&
              java.util.Arrays.equals(this.jbxx_photo, other.getJbxx_photo()))) &&
            ((this.bankAccountName==null && other.getBankAccountName()==null) || 
             (this.bankAccountName!=null &&
              this.bankAccountName.equals(other.getBankAccountName()))) &&
            ((this.bankAccountNo==null && other.getBankAccountNo()==null) || 
             (this.bankAccountNo!=null &&
              this.bankAccountNo.equals(other.getBankAccountNo()))) &&
            this.qx_id == other.getQx_id() &&
            ((this.ht_user==null && other.getHt_user()==null) || 
             (this.ht_user!=null &&
              this.ht_user.equals(other.getHt_user()))) &&
            ((this.ht_pass==null && other.getHt_pass()==null) || 
             (this.ht_pass!=null &&
              this.ht_pass.equals(other.getHt_pass()))) &&
            ((this.zwu_name==null && other.getZwu_name()==null) || 
             (this.zwu_name!=null &&
              this.zwu_name.equals(other.getZwu_name()))) &&
            ((this.zw_mc==null && other.getZw_mc()==null) || 
             (this.zw_mc!=null &&
              this.zw_mc.equals(other.getZw_mc())));
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
        _hashCode += getOrgid();
        _hashCode += getBm_newid();
        if (getJbxx_hkxz() != null) {
            _hashCode += getJbxx_hkxz().hashCode();
        }
        if (getJbxx_yns() != null) {
            _hashCode += getJbxx_yns().hashCode();
        }
        if (getJbxx_ynk() != null) {
            _hashCode += getJbxx_ynk().hashCode();
        }
        if (getJbxx_yold() != null) {
            _hashCode += getJbxx_yold().hashCode();
        }
        _hashCode += getOnint();
        _hashCode += getOnin();
        _hashCode += getCg_id();
        _hashCode += getJbxx_id();
        _hashCode += getBm_id();
        _hashCode += getZw_id();
        _hashCode += getZwu_id();
        _hashCode += getJg_id();
        _hashCode += getCs_id();
        if (getJbxx_xm() != null) {
            _hashCode += getJbxx_xm().hashCode();
        }
        if (getJbxx_sex() != null) {
            _hashCode += getJbxx_sex().hashCode();
        }
        if (getJbxx_csrq() != null) {
            _hashCode += getJbxx_csrq().hashCode();
        }
        if (getJbxx_rzrq() != null) {
            _hashCode += getJbxx_rzrq().hashCode();
        }
        if (getJbxx_zzrq() != null) {
            _hashCode += getJbxx_zzrq().hashCode();
        }
        if (getJbxx_hyzk() != null) {
            _hashCode += getJbxx_hyzk().hashCode();
        }
        if (getJbxx_zzmm() != null) {
            _hashCode += getJbxx_zzmm().hashCode();
        }
        if (getJbxx_mz() != null) {
            _hashCode += getJbxx_mz().hashCode();
        }
        if (getJbxx_jg() != null) {
            _hashCode += getJbxx_jg().hashCode();
        }
        if (getJbxx_xl() != null) {
            _hashCode += getJbxx_xl().hashCode();
        }
        if (getJbxx_zy() != null) {
            _hashCode += getJbxx_zy().hashCode();
        }
        if (getJbxx_byyx() != null) {
            _hashCode += getJbxx_byyx().hashCode();
        }
        if (getJbxx_lxdz() != null) {
            _hashCode += getJbxx_lxdz().hashCode();
        }
        if (getJbxx_dzxx() != null) {
            _hashCode += getJbxx_dzxx().hashCode();
        }
        if (getJbxx_sfzh() != null) {
            _hashCode += getJbxx_sfzh().hashCode();
        }
        if (getJbxx_lxdh() != null) {
            _hashCode += getJbxx_lxdh().hashCode();
        }
        if (getJbxx_dbr() != null) {
            _hashCode += getJbxx_dbr().hashCode();
        }
        if (getJbxx_dbrsfz() != null) {
            _hashCode += getJbxx_dbrsfz().hashCode();
        }
        if (getJbxx_dbrzz() != null) {
            _hashCode += getJbxx_dbrzz().hashCode();
        }
        if (getJbxx_dbrdh() != null) {
            _hashCode += getJbxx_dbrdh().hashCode();
        }
        if (getJbxx_cczm() != null) {
            _hashCode += getJbxx_cczm().hashCode();
        }
        if (getJbxx_fj() != null) {
            _hashCode += getJbxx_fj().hashCode();
        }
        if (getJbxx_qtlxr() != null) {
            _hashCode += getJbxx_qtlxr().hashCode();
        }
        if (getJbxx_qtlxrdh() != null) {
            _hashCode += getJbxx_qtlxrdh().hashCode();
        }
        if (getJbxx_zzzt() != null) {
            _hashCode += getJbxx_zzzt().hashCode();
        }
        if (getJbxx_lzrq() != null) {
            _hashCode += getJbxx_lzrq().hashCode();
        }
        if (getJbxx_lzyy() != null) {
            _hashCode += getJbxx_lzyy().hashCode();
        }
        if (getJbxx_bz() != null) {
            _hashCode += getJbxx_bz().hashCode();
        }
        if (getJbxx_zp() != null) {
            _hashCode += getJbxx_zp().hashCode();
        }
        if (getJbxx_username() != null) {
            _hashCode += getJbxx_username().hashCode();
        }
        if (getJbxx_userpwd() != null) {
            _hashCode += getJbxx_userpwd().hashCode();
        }
        if (getNf() != null) {
            _hashCode += getNf().hashCode();
        }
        if (getIbxx_dabh() != null) {
            _hashCode += getIbxx_dabh().hashCode();
        }
        if (getBm_name() != null) {
            _hashCode += getBm_name().hashCode();
        }
        if (getCs_mc() != null) {
            _hashCode += getCs_mc().hashCode();
        }
        if (getJbxx_photo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJbxx_photo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getJbxx_photo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBankAccountName() != null) {
            _hashCode += getBankAccountName().hashCode();
        }
        if (getBankAccountNo() != null) {
            _hashCode += getBankAccountNo().hashCode();
        }
        _hashCode += getQx_id();
        if (getHt_user() != null) {
            _hashCode += getHt_user().hashCode();
        }
        if (getHt_pass() != null) {
            _hashCode += getHt_pass().hashCode();
        }
        if (getZwu_name() != null) {
            _hashCode += getZwu_name().hashCode();
        }
        if (getZw_mc() != null) {
            _hashCode += getZw_mc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://360buy.com/", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Orgid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bm_newid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Bm_newid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_hkxz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_hkxz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_yns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Jbxx_yns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_ynk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Jbxx_ynk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_yold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Jbxx_yold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Onint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Onin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cg_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "cg_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Jbxx_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bm_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Bm_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zw_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "zw_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zwu_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "zwu_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jg_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jg_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cs_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "cs_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_xm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_xm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_sex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Jbxx_sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_csrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_csrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_rzrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_rzrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_zzrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_zzrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_hyzk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_hyzk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_zzmm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_zzmm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_mz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_mz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_jg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_jg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_xl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_xl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_zy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_zy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_byyx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_byyx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_lxdz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_lxdz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_dzxx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_dzxx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_sfzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_sfzh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_lxdh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_lxdh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_dbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_dbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_dbrsfz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_dbrsfz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_dbrzz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_dbrzz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_dbrdh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_dbrdh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_cczm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_cczm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_fj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_fj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_qtlxr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_qtlxr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_qtlxrdh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_qtlxrdh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_zzzt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_zzzt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_lzrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_lzrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_lzyy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_lzyy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_bz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_bz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_zp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_zp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_userpwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "jbxx_userpwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "nf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibxx_dabh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "ibxx_dabh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bm_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "bm_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cs_mc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "cs_mc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jbxx_photo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Jbxx_photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "BankAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "BankAccountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qx_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "Qx_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ht_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "ht_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ht_pass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "ht_pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zwu_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "zwu_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zw_mc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://360buy.com/", "zw_mc"));
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
