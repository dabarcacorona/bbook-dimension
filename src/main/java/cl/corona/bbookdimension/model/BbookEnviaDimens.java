package cl.corona.bbookdimension.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
public class BbookEnviaDimens {

    @Id
    @Column(name="idd" ,columnDefinition = "varchar2(100)")
    private String id;

    @Column(name="type_id" ,columnDefinition = "varchar2(10)")
    private String typeId;

    @Column(name="dimension_id" ,columnDefinition = "varchar2(20)")
    protected String dimensionId;

    @Column(name="dimension_name" ,columnDefinition = "varchar2(100)")
    protected String dimensionName;

    @Column(name="inactive" ,columnDefinition = "varchar2(10)")
    protected String inactive;

    @Column(name="tran_type" ,columnDefinition = "varchar2(1)")
    protected String tranType;

    public BbookEnviaDimens() {
        super();
    }

    public BbookEnviaDimens(String id, String typeId, String dimensionId, String dimensionName, String inactive, String tranType) {
        super();
        this.id = id;
        this.typeId = typeId;
        this.dimensionId = dimensionId;
        this.dimensionName = dimensionName;
        this.inactive = inactive;
        this.tranType = tranType;

    }

    @Override
    public String toString() {
        return "BbookEnviaDimens [id=" + id + ", typeId=" + typeId + ", dimensionId=" + dimensionId
                + ", dimensionName=" + dimensionName + ", inactive=" + inactive + ", tranType=" + tranType +"]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
    }

    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }
}
