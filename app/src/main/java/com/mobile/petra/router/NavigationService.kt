package com.mobile.petra.router

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.annotation.OptIn
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink

@OptIn(ExperimentalGetImage::class)
@SuppressLint("NewApi")
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigators(kegowViewModel: KegowViewModel) {
    val appInBackground = kegowViewModel.isAppInBackground.collectAsState().value
    val navController = rememberNavController()
    val navigation = Navigator(navController)


    NavHost(navController, startDestination = Routes.Home.route) {

        if (appInBackground == 1) {
            navigation.navToWelcomeScreen()
            kegowViewModel.setBackground(0)
        } else if (appInBackground == 2) {
            navigation.navToLoginScreen()
            kegowViewModel.setBackground(0)
        }

        composable(Routes.WelcomeScreen.route) {
            WelcomeBack(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.Home.route) {
            DashboardWithDelay(navigation = navigation, kegowViewModel)
        }
        composable(Routes.Onboarding1.route) {
            Onboarding_1(navigation)
        }
        composable(Routes.Onboarding2.route) {
            Onboarding_2(navigation)
        }
        composable(Routes.Onboarding3.route) {
            Onboarding_3(navigation)
        }
        composable(Routes.Onboarding4.route) {
            Onboarding_4(navigation)
        }
        composable(Routes.Login.route) {
            Login(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ResetPin.route) {
            ResetPin(navigation, kegowViewModel)
        }
        composable(Routes.ResetPinOTP.route) {
            ResetPinOTP(navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.EnterPhoneNumber.route,
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = if(isDebugConstant){"https://staging-dot-kegow-315917.nw.r.appspot.com/referral/{id}"}else{"https://app.kegow.com/signup/{id}"}
                    // uriPattern = "https://app.kegow.com/{id}"
                    action = Intent.ACTION_VIEW
                }
            ),
            arguments = listOf(
                navArgument(name = "id") {
                    type = NavType.StringType
                    defaultValue = ""
                }
            )
        ) { entry ->

            val referral = entry.arguments?.getString("id") ?: ""
            InputPhoneNumber(
                navigator = navigation,
                kegowViewModel = kegowViewModel,
                referral =  referral
            )

        }

        composable(Routes.NavigateLiveness.route){
            FaceRecognitionScreens(kegowViewModel = kegowViewModel, navigator = navigation)
        }

        composable(Routes.PicturePreview.route){
            PicturePreviewScreen(navigator = navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.CreateAccount.route) {
            CreateAccount(navigation, kegowViewModel)
        }
        composable(Routes.CreateAccountCompleteProfile.route) {
            CompleteProfile(navigation, kegowViewModel)
        }
        composable(Routes.BiometricAccessEnabledDialog.route) {
            BiometricAccessEnabledDialog(navigation)
        }
        composable(Routes.SetPinCode.route) {
            // SetPIN(navigation, kegowViewModel)
        }
        composable(Routes.RevampedSetPinCode.route) {
            RevampedSetPIN(navigation, kegowViewModel)
        }
//        composable(Routes.ConfirmPinCode.route) {
//            ConfirmPIN(
//                navigator = navigation,
//                kegowViewModel = kegowViewModel
//            )
//        }
        composable(Routes.RevampedConfirmPinCode.route) {
            RevampedConfirmPIN(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.EnableBiometric.route) {
            EnableBiometric(navigation, kegowViewModel)
        }
        composable(Routes.CheckMarkDialog.route) {
            PasswordResetSuccessfulDialog()
        }
        composable(Routes.WalletCreationSuccessful.route) {
            WalletCreationSuccessfulPrompt(navigation)
        }
        composable(Routes.FundTransferOptions.route) {
            FundTransferOptions(navigation = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.KegowTransfer.route) {
            KegowToKegowTransfer(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.BankTransfer.route) {
            BankTransfer(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.SelectRecipientBank.route) {
            SelectRecipientBank(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }

        composable(Routes.FundWalletBankTransfer.route) {
            BankTransferFundWallet(navigation, kegowViewModel)
        }
        composable(Routes.FundWalletCashDeposit.route) {
            FundWallet_CashDeposit(navigation, kegowViewModel)
        }
        composable(Routes.Airtime.route) {
            Airtime(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ReusableSuccessfulTransaction.route) {
            ReusableSuccessfulScreen(onNavigateDashBoard = {
                navController.navigate(Routes.KegowApp.route)
            })
        }

        composable(Routes.BillsHomepage.route){
            BillsHomepage(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.AirtimeSuccessfulPrompt.route) {
            AirtimeRechargeSuccessfulPrompt(navigator = navigation, kegowViewModel)
        }
        composable(Routes.Data.route) {
            Data(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.DataSuccessfulScreen.route) {
            DataRechargeSuccessfulPrompt(navigator = navigation, kegowViewModel)
        }
        composable(Routes.DataFailedScreen.route) {
            DataRechargeFailedPrompt(
                kegowViewModel, navigation
            )
        }

        composable(
            Routes.TransactionsHistory.route + "/{walletNumber}",
            arguments = listOf(navArgument("walletNumber") {
                type = NavType.StringType
            })
        ) { args ->
            val state = args.arguments?.getString("walletNumber")
            TransactionsHistory(
                navigation = navigation,
                kegowViewModel = kegowViewModel,
                walletNumber = state,

                )
        }

        composable(Routes.KegowApp.route){
            KegowAppEntry(navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }

        composable(Routes.FundWallet.route) {
            FundWallet(navigation, kegowViewModel)
        }
        composable(Routes.Electricity.route) {
            Electricity(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ElectricityBillSuccessful.route) {
            ElectricityPaymentSuccessfulPrompt(navigation)
        }
        composable(Routes.CableTV.route) {
            CableTV(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.CableTVSuccessful.route) {
            CableTVSuccessfulPrompt(navigation, kegowViewModel)
        }
        composable(Routes.Internet.route) {
            InternetPlansList(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.AccountDetails.route) {
            AccountDetails(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.UserAddress.route) {
            UserAddress(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.UpdateUserAddress.route) {
            UpdateUserAddress(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.Support.route) {
            Support(navigation, kegowViewModel)
        }
        composable(Routes.StatementAndReport.route) {
            StatementsAndReport(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.StatementAndReportSent.route) {
            StatementOfAccountPrompt(navigator = navigation, kegowViewModel)
        }
        composable(Routes.SecuritySettings.route) {
            SecuritySettingsHomePage(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.SecurityQuestions.route) {
            SecurityQuestions(navigation)
        }
        composable(Routes.SecurityQuestionsAuth.route) {
            SecurityQuestionsAuth(navigator = navigation)
        }
        composable(Routes.SecurityQuestionAddSuccessfulDialog.route) {
            SecurityQuestionSuccessfulDialog(navigator = navigation)
        }
        composable(Routes.Notification.route) {
            Notifications(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.Referrals.route) {
            Referrals(
                kegowViewModel = kegowViewModel,
                navigator = navigation
            )
        }
        composable(Routes.ChangeEmail.route) {
            CurrentEmailAddress(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.NewEmail.route) {
            NewEmailAddress(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.AddEmailSuccessfulDialog.route) {
            AddEmailSuccessfulDialog(navigator = navigation)
        }
        composable(Routes.VerifyNewEmailOTP.route) {
            VerifyNewEmailOTP(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.TierUpgradeSelection.route) {
            TierUpgradeSelection(navigator = navigation, kegowViewModel)
        }
        composable(Routes.Tier2UpgradeSelection.route) {
            Tier2UpgradeSelection(navigator = navigation, kegowViewModel)
        }
        composable(Routes.Tier3UpgradeSelection.route) {
            Tier3UpgradeSelection(navigator = navigation, kegowViewModel)
        }
        composable(Routes.Tier2IdentificationCard.route) {
            Tier2IdentificationCard(kegowViewModel = kegowViewModel, navigator = navigation)
        }
        composable(Routes.Tier3UpgradeUtilityBill.route) {
            Tier3UpgradeUtilityBill(kegowViewModel = kegowViewModel, navigator = navigation)
        }
        composable(Routes.RestrictAccount.route) {
            RestrictAccount(navigation)
        }
        composable(Routes.RestrictAccountPinInput.route) {
            RestrictAccount_PinInput(navigation)
        }
        composable(Routes.RestrictAccountPrompt.route) {
            RestrictAccountPrompt(navigation)
        }
        composable(Routes.ChatWithUs.route) {
            ChatWithUs(navigator = navigation)
        }
        composable(Routes.FAQs.route) {
            FAQs(navigator = navigation, kegowViewModel)
        }
        composable(Routes.ChangePIN.route) {
            ChangePIN(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ChangePINSuccessfulPrompt.route) {
            ChangePINSuccessfulPrompt(navigation, kegowViewModel)
        }
        composable(Routes.AppTransactionsNotification.route) {
            AppNotification(navigation, kegowViewModel)
        }
        composable(Routes.PersonalDetail.route) {
            PersonalDetails(navigation, kegowViewModel)
        }
        composable(Routes.AdditionalPersonalDetail.route) {
            AdditionalPersonalDetails(navigation, kegowViewModel)
        }
        composable(Routes.VerificationTypeSelection.route) {
            VerificationTypeSelection(
                navigation,
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.BankTransferReceipt.route) {
            BankTransferReceipt(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.KegowTransferReceipt.route) {
            KegowTransferReceipt(navigator = navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.BankSuccessful.route) {
            BankSuccessful(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.AirtimeReceipt.route) {
            AirtimePurchaseReceipt(navigator = navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.ElectricityReceipt.route) {
            ElectricityReceipt(navigator = navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.CardRequestReceipt.route) {
            CardRequestReceipt(kegowViewModel = kegowViewModel, navigator = navigation)
        }

        composable(Routes.CableReceipt.route) {
            CableReceipt(navigator = navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.TransactionPIN.route) {
            ChangeTransactionPin(navigator = navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.SetTransactionPIN.route) {
            SetTransactionPin_VerifyNumber(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }


        composable(Routes.OTPSignUp.route) {
            SendOTPSignUp(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }

        composable(Routes.BankTransferReceipt.route) {
            BankTransferReceipt(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.WebView.route) {
            WebViewImpl(navigation)
        }
        composable(Routes.TransactionPINSettings.route) {
            TransactionPINChange_ValidateUser(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ChangeTransactionPinVerifyOTPScreen.route) {
            ChangeTransactionPin_InputOTP(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.UpdateTransactionPin.route) {
            ChangeTransactionPin(navigator = navigation, kegowViewModel)
        }
        composable(Routes.ConfirmUpdateTransactionPin.route) {
            ConfirmChangeTransactionPin(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ConfirmTransactionPinCreation.route) {
            CreateTransactionPinConfirm(navigation, kegowViewModel = kegowViewModel)
        }

        composable(Routes.CreateTransactionPin.route) {
            TransactionPinCreation(navigation, kegowViewModel)
        }
        composable(Routes.ChangeTransactionPinSuccessful.route) {
            ChangeTransactionPinSuccessful(navigation, kegowViewModel)
        }

        composable(Routes.CreateTransactionPinSuccessful.route) {
            CreateTransactionPinSuccessful(navigation)
        }
        composable(Routes.ResetLoginPinValidateUserScreen.route) {
            ResetLoginPin_InputPhoneNumber(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.RevampedCreateAccount.route) {
            RevampedCreateAccount(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.ResetLoginPinSuccessful.route) {
            ResetLoginPinSuccessful(navigator = navigation)
        }
        composable(Routes.ConfirmResetLoginPin.route) {
            ConfirmResetLoginPin(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.Spectranet.route) {
            Spectranet(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.ChangePinInputOTP.route) {
            ChangePIN_InputOTP(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.DisplayQRCode.route) {
            DisplayQRCode(kegowViewModel, navigation)
        }
        composable(Routes.QRCodeTransfer.route) {
            QRCodeTransfer(navigator = navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.QRCodeScannerScreen.route) {
            QRCodeScannerScreen(navigation, kegowViewModel)
        }
        composable(Routes.BVNVerify.route) {
            BVNInput(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.NINVerify.route) {
            NINInput(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.FundWalletScanQRCode.route) {
            FundWalletQRCode(navigation, kegowViewModel = kegowViewModel)
        }
        composable(Routes.CardHomeDeliveryDetails.route) {
            AddressForCardDelivery(navigator = navigation)
        }
        composable(Routes.ConfirmCardHomeDeliveryDetails.route) {
            ConfirmCardRequest(
                kegowViewModel = kegowViewModel,
                onNavigateUp = { navController.navigateUp() },
                onNavigateToCardInTransit = { navController.navigate(Routes.KegowApp.route) }
            )
        }
        composable(Routes.CardInTransit.route) {
            CardInTransit()
        }
        composable(Routes.ActivateCard.route) {

            ActivateCard(
                onNavigateUp = { navController.navigateUp() },
                onNavigateToConfirmCardActivationDetails = { navController.navigate(Routes.ConfirmCardActivationDetails.route) }
            )
        }
        composable(Routes.ConfirmCardActivationDetails.route) {
            ConfirmCardActivationDetails(navigation, kegowViewModel)
        }
        composable(Routes.SelectVerificationChannel.route) {
            SelectVerificationChannel(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.CardManagementDashboard.route) {
            CardManagementDashboard(
                navigator = navigation
            )
        }
        composable(Routes.ManageCardPIN.route) {
            ManageCard(
                navigator = navigation,
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.ViewCardPIN.route) {
            ViewCardPIN(
                navigator = navigation,
                onClickOkay = {
                    navController.navigate(Routes.KegowApp.route) {
                        navController.popBackStack(
                            BottomNavigationScreen.Home.route,
                            inclusive = true
                        )
                    }
                },
                kegowViewModel = kegowViewModel
            )
        }
        composable(Routes.DeactivateCardHomePage.route) {
            DeactivateCardHomePage(
                navigator = navigation,
                onNavigateUp = { navController.navigateUp() },
                onToggleSwitch = { navController.navigate(Routes.DeactivateCard.route) }
            )
        }
        composable(Routes.DeactivateCard.route) {
            DeactivateCard(
                onNavigateUp = { navController.navigateUp() },
                onOkayClicked = {
                    navController.navigate(Routes.KegowApp.route) {
                        navController.popBackStack(
                            BottomNavigationScreen.Card.route,
                            inclusive = true
                        )
                    }
                }
            )
        }
        composable(Routes.SmartLockersLocations.route) {
            SmartLockersLocationsMap(navigator = navigation)
        }
        composable(Routes.SelectSmartLockerLocation.route) {
            SelectSmartLockerLocation(navigator = navigation)
        }
        composable(Routes.SmartLockerCreateParcel.route) {
            SmartLockerCreateParcel(navigator = navigation)
        }
        composable(Routes.SelectSmartLockerCity.route) {
            SelectSmartLockerCity(navigator = navigation)
        }

        composable(Routes.Map.route){
            MapMarker()
        }
        composable(Routes.CardPickup.route) {
            CardPickup(navigator = navigation)
        }
        composable(Routes.CardHomeDeliveryAddress.route) {
            CardHomeDeliveryAddress(navigator = navigation)
        }
        composable(Routes.CardHomeDeliveryAgent.route) {
            DeliveryAgent(navigator = navigation)
        }
    }
}


@Composable
fun DashboardWithDelay(
    navigation: Navigator,
    kegowViewModel: KegowViewModel,

    )