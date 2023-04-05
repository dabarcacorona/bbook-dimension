package cl.corona.bbookdimension.model;

public class JsonDet {

    private String type_id;
    private String dimension_id;
    private String dimension_name;
    private String inactive;


    public JsonDet() {
        super();
        // TODO Auto-generated constructor stub
    }


    public JsonDet(String type_id, String dimension_id, String dimension_name, String inactive) {
        super();
        this.type_id = type_id;
        this.dimension_id = dimension_id;
        this.dimension_name = dimension_name;
        this.inactive = inactive;

    }

    @Override
    public String toString() {
        return "JsonDet [type_id=" + type_id + ", dimension_id=" + dimension_id + ", dimension_name=" + dimension_name + ", inactive=" + inactive + "]";
    }

    public String getTypeId() {
        return type_id;
    }

    public void setId(String id) {
        this.type_id = id;
    }

    public String getDimensionId() { return dimension_id; }

    public void setDimensionId(String dimension_id) {
        this.dimension_id = dimension_id;
    }

    public String getDimensionName() { return dimension_name; }

    public void setDimensionName(String dimension_name) {
        this.dimension_name = dimension_name;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

}
