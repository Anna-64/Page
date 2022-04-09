package ru.netology.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.pages.LoginPageV1;


import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.data.DataHelper.getFirstCardInfo;
import static ru.netology.data.DataHelper.getSecondCardInfo;


public class MoneyTransferTest {

    @BeforeEach
    public void setUp() {
      Configuration.holdBrowserOpen = true;
      open("http://localhost:9999");
    }

    @AfterEach
    void setDown() {
      Configuration.holdBrowserOpen = true;
      open("http://localhost:9999");
      var loginPage = new LoginPageV1();
      var authInfo = DataHelper.getAuthInfo();
      var verificationPage = loginPage.validLogin(authInfo);
      var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
      var dashboardPage = verificationPage.validVerify(verifyInfo);
      var firstCardInfo = getFirstCardInfo();
      var secondCardInfo = getSecondCardInfo();
      int amount1 = dashboardPage.getCardBalance(secondCardInfo);
      var transferPage = dashboardPage.selectCardToTransfer(firstCardInfo);
      dashboardPage = transferPage.makeTransfer(String.valueOf(amount1), secondCardInfo);
      int amount2 = dashboardPage.getCardBalance(firstCardInfo) / 2;
      var transferPage2 = dashboardPage.selectCardToTransfer(secondCardInfo);
      dashboardPage = transferPage.makeTransfer2(String.valueOf(amount2), firstCardInfo);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCards4333() {
      var loginPage = new LoginPageV1();
      var authInfo = DataHelper.getAuthInfo();
      var verificationPage = loginPage.validLogin(authInfo);
      var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
      var dashboardPage = verificationPage.validVerify(verifyInfo);
      var firstCardInfo = getFirstCardInfo();
      var secondCardInfo = getSecondCardInfo();
      int amount = 4333;
      var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
      var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
      var transferPage = dashboardPage.selectCardToTransfer(secondCardInfo);
      dashboardPage = transferPage.makeTransfer(String.valueOf(amount), firstCardInfo);
      var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
      var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
      assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
      assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCards2() {
      Configuration.holdBrowserOpen = true;
      open("http://localhost:9999");
      var loginPage = new LoginPageV1();
      var authInfo = DataHelper.getAuthInfo();
      var verificationPage = loginPage.validLogin(authInfo);
      var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
      var dashboardPage = verificationPage.validVerify(verifyInfo);
      var firstCardInfo = getFirstCardInfo();
      var secondCardInfo = getSecondCardInfo();
      int amount = 6666;
      var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
      var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
      var transferPage = dashboardPage.selectCardToTransfer(secondCardInfo);
      dashboardPage = transferPage.makeTransfer(String.valueOf(amount), firstCardInfo);
      var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
      var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
      assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
      assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCards3() {
      Configuration.holdBrowserOpen = true;
      open("http://localhost:9999");
      var loginPage = new LoginPageV1();
      var authInfo = DataHelper.getAuthInfo();
      var verificationPage = loginPage.validLogin(authInfo);
      var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
      var dashboardPage = verificationPage.validVerify(verifyInfo);
      var firstCardInfo = getFirstCardInfo();
      var secondCardInfo = getSecondCardInfo();
      int amount = 0;
      var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
      var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
      var transferPage = dashboardPage.selectCardToTransfer(secondCardInfo);
      dashboardPage = transferPage.makeTransfer(String.valueOf(amount), firstCardInfo);
      var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
      var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
      assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
      assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCards10000() {
      Configuration.holdBrowserOpen = true;
      open("http://localhost:9999");
      var loginPage = new LoginPageV1();
      var authInfo = DataHelper.getAuthInfo();
      var verificationPage = loginPage.validLogin(authInfo);
      var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
      var dashboardPage = verificationPage.validVerify(verifyInfo);
      var firstCardInfo = getFirstCardInfo();
      var secondCardInfo = getSecondCardInfo();
      int amount = 10000;
      var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
      var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
      var transferPage = dashboardPage.selectCardToTransfer(secondCardInfo);
      dashboardPage = transferPage.makeTransfer(String.valueOf(amount), firstCardInfo);
      var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
      var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
      assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
      assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }

  @Test
  void shouldTransferMoneyBetweenOwnCards5() {
    Configuration.holdBrowserOpen = true;
    open("http://localhost:9999");
    var loginPage = new LoginPageV1();
    var authInfo = DataHelper.getAuthInfo();
    var verificationPage = loginPage.validLogin(authInfo);
    var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
    var dashboardPage = verificationPage.validVerify(verifyInfo);
    var firstCardInfo = getFirstCardInfo();
    var secondCardInfo = getSecondCardInfo();
    int amount = 20000;
    var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
    var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
    var transferPage = dashboardPage.selectCardToTransfer(secondCardInfo);
    dashboardPage = transferPage.makeTransfer(String.valueOf(amount), firstCardInfo);
    var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
    var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
    assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
    assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
  }

}

