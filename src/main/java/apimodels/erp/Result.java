package apimodels.erp;

import apimodels.erknm.InspectionObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Result {

    public InspectionObject actDate;
    public String actPlace;
    public String actNotReaded;
    public InspectionObject startDate;
    public String inspDurDays;
    public boolean hasViolations;
    public int violNumber;
    public String actPlaceTypeCode;
    public String actPlaceType;
    public ArrayList<ObjInspector> objInspectors;
    public ArrayList<InspViolation> inspViolations;
    public ArrayList<ObjRepresentative> objRepresentatives;
    public ArrayList<InspectionObject> resultInfos;
    public String inspDurHours;
}
