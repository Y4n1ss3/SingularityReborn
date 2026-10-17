package androidx.compose.ui.autofill;

import defpackage.o;
import defpackage.p80;
import defpackage.xe0;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes;

    static {
        xe0[] xe0VarArr = {new xe0(AutofillType.EmailAddress, "emailAddress"), new xe0(AutofillType.Username, "username"), new xe0(AutofillType.Password, "password"), new xe0(AutofillType.NewUsername, "newUsername"), new xe0(AutofillType.NewPassword, "newPassword"), new xe0(AutofillType.PostalAddress, "postalAddress"), new xe0(AutofillType.PostalCode, "postalCode"), new xe0(AutofillType.CreditCardNumber, "creditCardNumber"), new xe0(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), new xe0(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), new xe0(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), new xe0(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), new xe0(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), new xe0(AutofillType.AddressCountry, "addressCountry"), new xe0(AutofillType.AddressRegion, "addressRegion"), new xe0(AutofillType.AddressLocality, "addressLocality"), new xe0(AutofillType.AddressStreet, "streetAddress"), new xe0(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), new xe0(AutofillType.PostalCodeExtended, "extendedPostalCode"), new xe0(AutofillType.PersonFullName, "personName"), new xe0(AutofillType.PersonFirstName, "personGivenName"), new xe0(AutofillType.PersonLastName, "personFamilyName"), new xe0(AutofillType.PersonMiddleName, "personMiddleName"), new xe0(AutofillType.PersonMiddleInitial, "personMiddleInitial"), new xe0(AutofillType.PersonNamePrefix, "personNamePrefix"), new xe0(AutofillType.PersonNameSuffix, "personNameSuffix"), new xe0(AutofillType.PhoneNumber, "phoneNumber"), new xe0(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), new xe0(AutofillType.PhoneCountryCode, "phoneCountryCode"), new xe0(AutofillType.PhoneNumberNational, "phoneNational"), new xe0(AutofillType.Gender, "gender"), new xe0(AutofillType.BirthDateFull, "birthDateFull"), new xe0(AutofillType.BirthDateDay, "birthDateDay"), new xe0(AutofillType.BirthDateMonth, "birthDateMonth"), new xe0(AutofillType.BirthDateYear, "birthDateYear"), new xe0(AutofillType.SmsOtpCode, "smsOTPCode")};
        HashMap<AutofillType, String> hashMap = new HashMap<>(p80.L(36));
        p80.O(hashMap, xe0VarArr);
        androidAutofillTypes = hashMap;
    }

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        o.m("Unsupported autofill type");
        return null;
    }

    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
