package api.knd;

import apimodels.controlObjects.ItemsItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static api.ControlObjectCardService.getControlObjectCard;
import static api.ControlObjectsService.getAllControlObjects;

@Tag("SmokeTest")
@DisplayName("Проверка открытия каждой карточки объектов контроля")
public class ControlObjectCardTests extends BaseApiTests {

    public void verifyControlObjectCards(String accountTypeValue) {
        List<ItemsItem> objectIdList = getAllControlObjects(accountTypeValue).getItems();
        List<String> objectIds = objectIdList.stream()
                .map(ItemsItem::getObjectId)
                .collect(Collectors.toList());

        System.out.printf("Объектов контроля всего: %d %s%n", objectIds.size(), objectIds);

        for (String objectId : objectIds) {
            getControlObjectCard(accountTypeValue, objectId);
        }
    }

    @Test
    @DisplayName("Проверка открытия каждой карточки объектов контроля для ЮЛ")
    public void shouldVerifyControlObjectCardsForUL() {
        verifyControlObjectCards(accTValueUl);
    }

    @Test
    @DisplayName("Проверка открытия каждой карточки объектов контроля для ФЛ")
    public void shouldVerifyControlObjectCardsForFL() {
        verifyControlObjectCards(accTValueFl);
    }

    @Test
    @DisplayName("Проверка открытия каждой карточки объектов контроля для ИП")
    public void shouldVerifyControlObjectCardsForIP() {
        verifyControlObjectCards(accTValueIp);
    }

}