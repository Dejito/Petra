package com.mobile.petra.router

import androidx.navigation.NavHostController


class Navigator(private val navController: NavHostController) {

    fun navigateToHome() {
        navController.navigate(Routes.Home.route) {
            launchSingleTop = true
            restoreState = true
            popUpTo(Routes.Home.route) {
                inclusive = false
            }
        }
    }

    fun navToOnboarding1() {
        navController.navigate(Routes.Onboarding1.route)
    }

    fun navToSwipeScreen() {
        navController.navigate(Routes.SwipeScreen.route)
    }

    fun navToOnboarding2() {
        navController.navigate(Routes.Onboarding2.route) {}
    }

    fun navToOnboarding3() {
        navController.navigate(Routes.Onboarding3.route)
    }
    fun navToCreateTransactionSuccessful() {
        navController.navigate(Routes.CreateTransactionPinSuccessful.route)
    }

    fun navigateToOnboarding4() {
        navController.navigate(Routes.Onboarding4.route)
    }

    fun navToLoginScreen() {
        navController.navigate(Routes.Login.route) {
            popUpTo(Routes.ResetLoginPinSuccessful.route){
                inclusive = true
            }
        }
    }

    fun navToCapturePhoneNumber() {
        navController.navigate(Routes.EnterPhoneNumber.route) {
            popUpTo(Routes.EnterPhoneNumber.route) {
                this@navigate.launchSingleTop = true
            }
        }
    }

    fun navToResetPin() {
        navController.navigate(Routes.ResetPin.route)
    }

    fun navToResetLoginPinInputOTP() {
        navController.navigate(Routes.ResetPinOTP.route)
    }

    fun navToVerifyPhoneNumber() {
        navController.navigate(Routes.VerifyPhoneNumber.route)
    }

    fun navToCreateAccount() {
        navController.navigate(Routes.CreateAccount.route)
    }

    fun navToCompleteProfile() {
        navController.navigate(Routes.CreateAccountCompleteProfile.route)
    }
//
//    fun navToTakeASelfie1() {
//        navController.navigate(Routes.TakeASelfie1.route)
//    }
//
//    fun navToTakeASelfie2() {
//        navController.navigate(Routes.TakeASelfie2.route)
//    }
//    fun navToTakeASelfie1UpdateProfile() {
//        navController.navigate(Routes.TakeASelfie1UpdateProfile.route)
//    }
//
//    fun navToTakeASelfie2UpdateProfile() {
//        navController.navigate(Routes.TakeASelfie2UpdateProfile.route)
//    }
//
//    fun navToTakeASelfie3() {
//        navController.navigate(Routes.TakeASelfie3.route)
//    }

//    fun navToCapturedImage() {
//        navController.navigate(Routes.CapturedImage.route)
//    }
//    fun navToCapturedImageUpdateProfile() {
//        navController.navigate(Routes.CapturedImageUpdateProfile.route)
//    }

    fun navToSetPinCode() {
        navController.navigate(Routes.SetPinCode.route)
    }

    fun navToRevampedSetPinCode() {
        navController.navigate(Routes.RevampedSetPinCode.route)
    }

    fun navToConfirmPinCode() {
        navController.navigate(Routes.ConfirmPinCode.route)
    }


    fun navToRevampedConfirmPinCode() {
        navController.navigate(Routes.RevampedConfirmPinCode.route)
    }

    fun navToEnableBiometricDialog() {
        navController.navigate(Routes.BiometricAccessEnabledDialog.route)
    }

    fun navToEnableBiometricScreen() {
        navController.navigate(Routes.EnableBiometric.route)
    }

    fun navToWalletCreationSuccessfulPrompt() {
        navController.navigate(Routes.WalletCreationSuccessful.route)
    }

    fun navToKegowApp() {
        navController.navigate(Routes.KegowApp.route){
            popUpToRoute
        }
    }

    fun navToFundWallet() {
        navController.navigate(Routes.FundWallet.route)
    }

    fun navToTransactionHistory(walletNumber:String) {
        navController.navigate(Routes.TransactionsHistory.route+"/$walletNumber")
    }

    fun navToAlertDialog() {
        navController.navigate(Routes.DialogScreen.route)
    }

    fun navToFundTransferOptions() {
        navController.navigate(Routes.FundTransferOptions.route)
    }

    fun navToKegowTransfer() {
        navController.navigate(Routes.KegowTransfer.route)
    }

    fun navToBankTransfer() {
        navController.navigate(Routes.BankTransfer.route)
    }
    fun navToDashboard() {
        navController.navigate(Routes.Dashboard.route)
    }

    fun navToSelectRecipientBank() {
        navController.navigate(Routes.SelectRecipientBank.route){
            popUpTo(Routes.SelectRecipientBank.route) {
                inclusive = true
            }
        }
    }

    fun navToTransferSuccessfulScreen() {
        navController.navigate(Routes.TransferSuccessful.route) {
            popUpTo(Routes.BankTransfer.route) {
                inclusive = true
            }
            popUpTo(Routes.KegowTransfer.route) {
                inclusive = true
            }
        }
    }

    fun navToBankTransferProcessing() {
        navController.navigate(Routes.TransferProcessing.route)
    }

    fun navToSelectBeneficiary() {
        navController.navigate(Routes.Beneficiaries.route) {
            popUpTo(Routes.Beneficiaries.route) {
                inclusive = true
            }
        }
    }

    fun navToBankTransferFundWallet() {
        navController.navigate(Routes.FundWalletBankTransfer.route)
    }

    fun navToCashDepositFundWallet() {
        navController.navigate(Routes.FundWalletCashDeposit.route)
    }
    fun navToQRCodeFundWallet() {
        navController.navigate(Routes.FundWalletScanQRCode.route)
    }

    fun navToBillsHomepage(state:String?="") {
        navController.navigate(Routes.BillsHomepage.route+"/$state")
    }

    fun navToAirtimeSuccessful() {
        navController.navigate(Routes.AirtimeSuccessfulPrompt.route) {
            popUpTo(Routes.Airtime.route) {
                inclusive = true
            }
        }
    }

    fun navToData() {
        navController.navigate(Routes.Data.route)
    }

    fun navToDataSuccessful() {
        navController.navigate(Routes.DataSuccessfulScreen.route) {
            popUpTo(Routes.Data.route) {
                inclusive = true
            }
        }
    }

    fun navToDataFailed() {
        navController.navigate(Routes.DataFailedScreen.route)
    }

    fun navToElectricity() {
        navController.navigate(Routes.Electricity.route)
    }


    fun navToElectricityBillSuccessful() {
        navController.navigate(Routes.ElectricityBillSuccessful.route) {
            popUpTo(Routes.Electricity.route) {
                inclusive = true
            }
        }
    }

    fun navToCableTV() {
        navController.navigate(Routes.CableTV.route)
    }

    fun navToCableTVSuccessful() {
        navController.navigate(Routes.CableTVSuccessful.route) {
            popUpTo(Routes.CableTV.route) {
                inclusive = true
            }
        }
    }

    fun navToInternet() {
        navController.navigate(Routes.Internet.route)
    }

    fun navToUserDetails() {
        navController.navigate(Routes.AccountDetails.route) {
            popUpTo(Routes.UpdateUserAddress.route) {
                inclusive = true
            }
        }
    }

    fun navToUserAddress() {
        navController.navigate(Routes.UserAddress.route)
    }

    fun navToUpdateUserAddress() {
        navController.navigate(Routes.UpdateUserAddress.route)
    }

    fun navToSupport() {
        navController.navigate(Routes.Support.route)
    }

    fun navToCardsAndBanks() {
        navController.navigate(Routes.CardsAndBanks.route)
    }

    fun navToStatementAndReport() {
        navController.navigate(Routes.StatementAndReport.route)
    }

    fun navToStatementAndReportSent() {
        navController.navigate(Routes.StatementAndReportSent.route)
    }

    fun navToSecurityQuestionsAuth() {
        navController.navigate(Routes.SecurityQuestionsAuth.route)
    }

    fun navToSecurityQuestions() {
        navController.navigate(Routes.SecurityQuestions.route)
    }

    fun navToSecurityQuestionsAddedDialog() {
        navController.navigate(Routes.SecurityQuestionAddSuccessfulDialog.route)
    }

    fun navToNotification() {
        navController.navigate(Routes.Notification.route)
    }

    fun navToReferrals() {
        navController.navigate(Routes.Referrals.route)
    }

    fun navToTermsAndConditions() {
        navController.navigate(Routes.TermsAndConditions.route)
    }

    fun navToAddEmail() {
        navController.navigate(Routes.ChangeEmail.route)
    }

    fun navToNewEmail() {
        navController.navigate(Routes.NewEmail.route)
    }

    fun navToWelcomeScreen() {
        navController.navigate(Routes.WelcomeScreen.route)
    }

    fun popWelcomeScreen(){
        navController.popBackStack(Routes.WelcomeScreen.route, inclusive = true, saveState = true)
    }

    fun navToAddEmailSuccessfulDialog() {
        navController.navigate(
            Routes.AddEmailSuccessfulDialog.route,
        )
    }

    fun navToVerifyEmail() {
        navController.navigate(
            Routes.VerifyNewEmailOTP.route,
        )
    }

    fun navToTierUpgradeSelection() {
        navController.navigate(Routes.TierUpgradeSelection.route) {
            popUpTo(Routes.TierUpgradeSelection.route) {
                this@navigate.launchSingleTop = true
            }
        }
    }

    fun navToTier2UpgradeSelection() {
        navController.navigate(Routes.Tier2UpgradeSelection.route)
    }

    fun navToTier2IdentificationCard() {
        navController.navigate(Routes.Tier2IdentificationCard.route)
    }

    fun navToTier3UpgradeSelection() {
        navController.navigate(Routes.Tier3UpgradeSelection.route)
    }

    fun navToAddIDCardSuccessfulDialog() {
        navController.navigate(
            Routes.UploadIDSuccessful.route,
        )
    }

    fun navToTier3UpgradeUtilityBill() {
        navController.navigate(Routes.Tier3UpgradeUtilityBill.route)
    }

    fun navToUploadUtilityBillSuccessfulDialog() {
        navController.navigate(Routes.UploadUtilityBillSuccessful.route)
    }

    fun navToRestrictAccount() {
        navController.navigate(Routes.RestrictAccount.route)
    }

    fun navToRestrictAccountPinInput() {
        navController.navigate(Routes.RestrictAccountPinInput.route)
    }

    fun navToRestrictAccountPrompt() {
        navController.navigate(Routes.RestrictAccountPrompt.route)
    }

    fun navToAirtimeReceipt() {
        navController.navigate(Routes.AirtimeReceipt.route)
    }
    fun navToCardRequestReceipt() {
        navController.navigate(Routes.CardRequestReceipt.route)
    }

    fun navToGiveUsACall() {
        navController.navigate(Routes.GiveUsACall.route)
    }

    fun navToChatWithUs() {
        navController.navigate(Routes.ChatWithUs.route)
    }

    fun navToEmailUs() {
        navController.navigate(Routes.EmailUs.route)
    }

    fun navToFAQs() {
        navController.navigate(Routes.FAQs.route)
    }

    fun navToChangePIN() {
        navController.navigate(Routes.ChangePIN.route)
    }

    fun navToChangePINSuccessful() {
        navController.navigate(Routes.ChangePINSuccessfulPrompt.route)
    }
    fun navToPersonalDetail() {
        navController.navigate(Routes.PersonalDetail.route)
    }
    fun navToAdditionalPersonalDetail() {
        navController.navigate(Routes.AdditionalPersonalDetail.route)
    }

    fun navToAppNotification() {
        navController.navigate(Routes.AppTransactionsNotification.route)
    }

    fun navToVerificationTypeSelection() {
        navController.navigate(Routes.VerificationTypeSelection.route)
    }

    fun navToSavingsHomepage() {
        navController.navigate(Routes.SavingsHomepage.route)
    }

    fun navToTargetSavingsOnboarding() {
        navController.navigate(Routes.TargetSavingsOnboarding.route)
    }

    fun navToCreateTargetSavings() {
        navController.navigate(Routes.CreateTargetSavings.route)
    }

    fun navToTargetSavingsCreatedSuccessful() {
        navController.navigate(Routes.TargetSavingsCreationSuccessful.route)
    }

    fun navToTargetSavingsCreatedFailed() {
        navController.navigate(Routes.CreateTargetSavings.route)
    }

    fun navToTargetSavingsProgressDashboard() {
        navController.navigate(Routes.TargetSavingsProgressDashboard.route)
    }

    fun navToEditTargetSafe() {
        navController.navigate(Routes.EditTargetSafe.route)
    }

    fun navToEditTargetSafeChangeSavingPlan() {
        navController.navigate(Routes.EditTargetSafeChangeSavingsPlan.route)
    }

    fun navToEditTargetSafeChangeYourTarget() {
        navController.navigate(Routes.EditTargetSafeChangeYourTarget.route)
    }

    fun navToTargetSavingsSettingsChangeSuccessful() {
        navController.navigate(Routes.TargetSavingsSettingsChangeSuccessful.route)
    }

    fun navToTargetSavingsTopUpSuccessful() {
        navController.navigate(Routes.TargetSavingsTopUpSuccessful.route)
    }

    fun navToSavingsWithdrawalScreen() {
        navController.navigate(Routes.TargetSavingsWithdrawal.route)
    }

    fun navToSavingsOTPVerification() {
        navController.navigate(Routes.WithdrawalOTPVerification.route)
    }

    fun navToSavingsWithdrawalCompletedPrompt() {
        navController.navigate(Routes.SavingsWithdrawalCompletedPrompt.route)
    }

    fun navToSafeHistory() {
        navController.navigate(Routes.SafeHistory.route)
    }

    fun navToFixedSavingsOnboarding() {
        navController.navigate(Routes.FixedSavingsOnboarding.route)
    }

    fun navToCreateFixedSavings() {
        navController.navigate(Routes.CreateFixedSavings.route)
    }

    fun navToFixedSavingsCreationSuccessful() {
        navController.navigate(Routes.FixedSavingsCreationSuccessfulPrompt.route)
    }

    fun navToFixedSavingsCreationFailed() {
        navController.navigate(Routes.FixedSavingsCreationFailedPrompt.route)
    }

    fun navToFixedSavingsProgressDashboard() {
        navController.navigate(Routes.FixedSavingsProgressDashboard.route)
    }

    fun navToPeriodicSavingsOnboarding() {
        navController.navigate(Routes.PeriodicSavingsOnboarding.route)
    }

    fun navToCreatePeriodicSavings() {
        navController.navigate(Routes.CreatePeriodicSavings.route)
    }

    fun navToPeriodicSavingsCreationSuccessful() {
        navController.navigate(Routes.PeriodicSavingsCreationSuccessfulPrompt.route)
    }

    fun navToPeriodicSavingsProgressDashboard() {
        navController.navigate(Routes.FixedSavingsProgressDashboard.route)
    }

    fun goBack() {
        navController.navigateUp()
    }

    fun navToAirtime() {
        navController.navigate(Routes.Airtime.route) {
        }
    }

    fun navToElectricityReceipt() {
        navController.navigate(Routes.ElectricityReceipt.route)
    }

    fun navToCableReceipt() {
        navController.navigate(Routes.CableReceipt.route)
    }

    fun navToBankTransferReceipt() {
        navController.navigate(Routes.BankTransferReceipt.route)
    }

    fun navToCreateTransactionPin() {
        navController.navigate(Routes.CreateTransactionPin.route)
    }

    fun navToBankSuccessful() {
        navController.navigate(Routes.BankSuccessful.route)
    }

    fun navToKegowTransferReceipt() {
        navController.navigate(Routes.KegowTransferReceipt.route)
    }

    fun navToSetTransactionPin() {
        navController.navigate(Routes.SetTransactionPIN.route)
    }

    fun navToOTP() {
        navController.navigate(Routes.OTP.route)
    }
    fun navToOTPSignUp() {
        navController.navigate(Routes.OTPSignUp.route)
    }

    fun navToDeviceChange() {
        navController.navigate(Routes.DeviceChangeOTP.route)
    }

    fun navToTransactionPINSettings() {
        navController.navigate(Routes.TransactionPINSettings.route)
    }

    fun navToWebView() {
        navController.navigate(Routes.WebView.route)
    }

    fun navToChangeTransactionPinVerifyOTPScreen() {
        navController.navigate(Routes.ChangeTransactionPinVerifyOTPScreen.route)
    }

    fun navToBreakSafe() {
    }

    //    fun navToResetTransactionPin() {
//        navController.navigate(Routes.Reset.route)
//    }
    fun navToChangeTransactionPin() {
        navController.navigate(Routes.UpdateTransactionPin.route)
    }

    fun navToConfirmTransactionPin() {
        navController.navigate(Routes.ConfirmUpdateTransactionPin.route)
    }
    fun navToConfirmTransactionPinCreation() {
        navController.navigate(Routes.ConfirmTransactionPinCreation.route)
    }

    fun navToKegowTransferSuccessfulScreen() {
        navController.navigate(Routes.KegowTransferSuccessful.route)
    }

    fun navToChangeTransactionPinSuccessful() {
        navController.navigate(Routes.ChangeTransactionPinSuccessful.route) {
            popUpTo(Routes.ChangeTransactionPinSuccessful.route) {
                inclusive = false
            }
        }
    }
    fun navToSecuritySettings() {
        navController.navigate(Routes.SecuritySettings.route) {
            popUpTo(Routes.TransactionPINSettings.route) {
                inclusive = true
            }
        }
    }
    fun navToResetLoginPinValidateUserScreen() {
        navController.navigate(Routes.ResetLoginPinValidateUserScreen.route)
    }
    fun navToRevampedCreateAccountScreen() {
        navController.navigate(Routes.RevampedCreateAccount.route) {
            popUpTo(Routes.EnterPhoneNumber.route) {
            }
        }
    }
    fun navToResetLoginPinSuccessful() {
        navController.navigate(Routes.ResetLoginPinSuccessful.route)
    }
    fun navToConfirmResetLoginPin() {
        navController.navigate(Routes.ConfirmResetLoginPin.route)
    }
    fun navToSpectranet() {
        navController.navigate(Routes.Spectranet.route)
    }
    fun navToChangePinInputOTP() {
        navController.navigate(Routes.ChangePinInputOTP.route)
    }
    fun navToCameraPreview() {
        navController.navigate(Routes.CameraPreview.route)
    }
    fun navToDisplayQRCode() {
        navController.navigate(Routes.DisplayQRCode.route)
    }
    fun navToQRCodeTransfer() {
        navController.navigate(Routes.QRCodeTransfer.route)
    }
    fun navToQRCodeScannerScreen() {
        navController.navigate(Routes.QRCodeScannerScreen.route)
    }
    fun navToBVNVerification() {
        navController.navigate(Routes.BVNVerify.route)
    }
    fun navToNINVerification() {
        navController.navigate(Routes.NINVerify.route)
    }
    fun navToTermsAndConditionPdfViewer() {
        navController.navigate(Routes.TermsAndConditionPdfReader.route)
    }
    fun navToAddressForCardDelivery() {
        navController.navigate(Routes.CardHomeDeliveryDetails.route){
            popUpTo(Routes.ConfirmCardHomeDeliveryDetails.route) {
                inclusive = true
            }
        }
    }
    fun navToConfirmAddressForCardDelivery() {
        navController.navigate(Routes.ConfirmCardHomeDeliveryDetails.route)
    }

    fun navToCardInTransit() {
        navController.navigate(Routes.CardInTransit.route)
    }
    fun navToActivateCard() {
        navController.navigate(Routes.ActivateCard.route)
    }
    fun navToViewCardPin(){
        navController.navigate(Routes.ViewCardPIN.route)
    }
    fun navToSelectVerificationChannel() {
        navController.navigate(Routes.SelectVerificationChannel.route)
    }
    fun navToCardManagementDashboard() {
        navController.navigate(Routes.CardManagementDashboard.route)
    }
    fun navToManageCardPIN() {
        navController.navigate(Routes.ManageCardPIN.route)
    }
    fun navToDeactivateCardHomePage() {
        navController.navigate(Routes.DeactivateCardHomePage.route)
    }
    fun navToDeactivateCard() {
        navController.navigate(Routes.DeactivateCard.route)
    }
    fun navToSmartLockersLocationsMap() {
        navController.navigate(Routes.SmartLockersLocations.route)
    }
    fun navToSelectSmartLockerLocation() {
        navController.navigate(Routes.SelectSmartLockerLocation.route)
    }
    fun navToSmartLockerCreateParcel() {
        navController.navigate(Routes.SmartLockerCreateParcel.route)
    }
    fun navToSelectSmartLockerCity() {
        navController.navigate(Routes.SelectSmartLockerCity.route)
    }
    fun navToCardPickup() {
        navController.navigate(Routes.CardPickup.route)
    }
    fun navToCardHomeDeliveryAddress() {
        navController.navigate(Routes.CardHomeDeliveryAddress.route)
    }
    fun navToCardHomeDeliveryAgent() {
        navController.navigate(Routes.CardHomeDeliveryAgent.route)
    }

    fun navToFaceLive() {
        navController.navigate(Routes.NavigateLiveness.route)
    }

    fun navToPicturePreview() {
        navController.navigate(Routes.PicturePreview.route)
    }

    fun navToMap() {
        navController.navigate(Routes.Map.route)
    }
//
//    fun navToOTPModule() {
//        navController.navigate(Routes.OTPModule.route)
//    }


}
