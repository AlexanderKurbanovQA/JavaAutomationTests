package api;

import apimodels.businessActivity.BusinessActivityListPojo;

import static api.Specifications.*;
import static io.restassured.RestAssured.given;

public class BusinessActivityListService {

    public static BusinessActivityListPojo getObjectsOfBusinessActivityList(String accTValue) {

        installSpec (requestSpec(), responseSpecOK());

        return given()
                .header("Cookie", "acc_t=" + accTValue)
                .queryParam("pageNumber", DEFAULT_PAGE_NUMBER)
                .queryParam("pageSize", DEFAULT_PAGE_SIZE)
                .when()
                .get("/api/knd/v1/orgactivity/objects")
                .then()
                .extract().as(BusinessActivityListPojo.class);
    }
}