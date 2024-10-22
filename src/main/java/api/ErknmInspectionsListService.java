package api;

import apimodels.erknm.ErknmInspectionsListPojo;

import static api.Specifications.*;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ErknmInspectionsListService  {

    public static ErknmInspectionsListPojo getErknmInspectionsList(String accTValue, Integer countSize, String sortParameter, String kindType, String statusId ) {
        installSpec (requestSpec(), responseSpecOK());
        return given()
                .when()
                .header("Cookie", "acc_t=" + accTValue)
                .queryParam("pageNumber", DEFAULT_PAGE_NUMBER)
                .queryParam("countSize", countSize)
                .queryParam("kind", kindType)
                .queryParam("sort", sortParameter)
                .queryParam("statusId", statusId)
                .when()
                .get("/api/knd/v2/inspection/erknm/")
                .then()
                .body(matchesJsonSchemaInClasspath("jsonschema/erknm_inspection_list_schema.json"))
                .extract().response().as(ErknmInspectionsListPojo.class);
    }
}
