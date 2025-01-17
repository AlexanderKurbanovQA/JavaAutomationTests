package apimodels.erknm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PMInspectionDetailsCard {

    public String statusName;
    public String erknmId;
    public String knoOrganization;
    public String kindControl;
    public String kind;
    public String startDate;
    public String stopDate;
    public String announcementDate;
    public String ogrn;
    public String appealType;
    public String inn;
    public String organizationName;
    public ArrayList<InspectionObject> objects;
    public ArrayList<String> reasons;
    public ArrayList<Inspector> inspectors;
    public String typeName;
    public String prosecutorOrganizationName;
    public String resultOfInspection;
    public String mspCodeName;
    public String supervisionId;
    public boolean reviewFlag;
    public boolean reviewCompletedFlag;
    public boolean refusePreventiveVisit;
    public boolean isNotAppeal;
    private LocalDateTime refuseDate;
    public boolean isRejectSubject;
    public boolean appealPreventiveVisit;


}
