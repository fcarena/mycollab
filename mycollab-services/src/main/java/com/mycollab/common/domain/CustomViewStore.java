/*Domain class of table s_table_customize_view*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_table_customize_view")
@Alias("CustomViewStore")
public class CustomViewStore extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.createdUser
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.viewId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("viewId")
    private String viewid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.viewInfo
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=65535, message="Field value is too long")
    @Column("viewInfo")
    private String viewinfo;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        CustomViewStore item = (CustomViewStore)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(37, 93).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.id
     *
     * @return the value of s_table_customize_view.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.id
     *
     * @param id the value for s_table_customize_view.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.createdUser
     *
     * @return the value of s_table_customize_view.createdUser
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.createdUser
     *
     * @param createduser the value for s_table_customize_view.createdUser
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.createdTime
     *
     * @return the value of s_table_customize_view.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.createdTime
     *
     * @param createdtime the value for s_table_customize_view.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.viewId
     *
     * @return the value of s_table_customize_view.viewId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getViewid() {
        return viewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.viewId
     *
     * @param viewid the value for s_table_customize_view.viewId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setViewid(String viewid) {
        this.viewid = viewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.sAccountId
     *
     * @return the value of s_table_customize_view.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.sAccountId
     *
     * @param saccountid the value for s_table_customize_view.sAccountId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.viewInfo
     *
     * @return the value of s_table_customize_view.viewInfo
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getViewinfo() {
        return viewinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.viewInfo
     *
     * @param viewinfo the value for s_table_customize_view.viewInfo
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setViewinfo(String viewinfo) {
        this.viewinfo = viewinfo;
    }

    public enum Field {
        id,
        createduser,
        createdtime,
        viewid,
        saccountid,
        viewinfo;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}