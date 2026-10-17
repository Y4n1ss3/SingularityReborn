package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ContentType {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentType Username = ContentType_androidKt.ContentType("username");
        private static final ContentType Password = ContentType_androidKt.ContentType("password");
        private static final ContentType EmailAddress = ContentType_androidKt.ContentType("emailAddress");
        private static final ContentType NewUsername = ContentType_androidKt.ContentType("newUsername");
        private static final ContentType NewPassword = ContentType_androidKt.ContentType("newPassword");
        private static final ContentType PostalAddress = ContentType_androidKt.ContentType("postalAddress");
        private static final ContentType PostalCode = ContentType_androidKt.ContentType("postalCode");
        private static final ContentType CreditCardNumber = ContentType_androidKt.ContentType("creditCardNumber");
        private static final ContentType CreditCardSecurityCode = ContentType_androidKt.ContentType("creditCardSecurityCode");
        private static final ContentType CreditCardExpirationDate = ContentType_androidKt.ContentType("creditCardExpirationDate");
        private static final ContentType CreditCardExpirationMonth = ContentType_androidKt.ContentType("creditCardExpirationMonth");
        private static final ContentType CreditCardExpirationYear = ContentType_androidKt.ContentType("creditCardExpirationYear");
        private static final ContentType CreditCardExpirationDay = ContentType_androidKt.ContentType("creditCardExpirationDay");
        private static final ContentType AddressCountry = ContentType_androidKt.ContentType("addressCountry");
        private static final ContentType AddressRegion = ContentType_androidKt.ContentType("addressRegion");
        private static final ContentType AddressLocality = ContentType_androidKt.ContentType("addressLocality");
        private static final ContentType AddressStreet = ContentType_androidKt.ContentType("streetAddress");
        private static final ContentType AddressAuxiliaryDetails = ContentType_androidKt.ContentType("extendedAddress");
        private static final ContentType PostalCodeExtended = ContentType_androidKt.ContentType("extendedPostalCode");
        private static final ContentType PersonFullName = ContentType_androidKt.ContentType("personName");
        private static final ContentType PersonFirstName = ContentType_androidKt.ContentType("personGivenName");
        private static final ContentType PersonLastName = ContentType_androidKt.ContentType("personFamilyName");
        private static final ContentType PersonMiddleName = ContentType_androidKt.ContentType("personMiddleName");
        private static final ContentType PersonMiddleInitial = ContentType_androidKt.ContentType("personMiddleInitial");
        private static final ContentType PersonNamePrefix = ContentType_androidKt.ContentType("personNamePrefix");
        private static final ContentType PersonNameSuffix = ContentType_androidKt.ContentType("personNameSuffix");
        private static final ContentType PhoneNumber = ContentType_androidKt.ContentType("phoneNumber");
        private static final ContentType PhoneNumberDevice = ContentType_androidKt.ContentType("phoneNumberDevice");
        private static final ContentType PhoneCountryCode = ContentType_androidKt.ContentType("phoneCountryCode");
        private static final ContentType PhoneNumberNational = ContentType_androidKt.ContentType("phoneNational");
        private static final ContentType Gender = ContentType_androidKt.ContentType("gender");
        private static final ContentType BirthDateFull = ContentType_androidKt.ContentType("birthDateFull");
        private static final ContentType BirthDateDay = ContentType_androidKt.ContentType("birthDateDay");
        private static final ContentType BirthDateMonth = ContentType_androidKt.ContentType("birthDateMonth");
        private static final ContentType BirthDateYear = ContentType_androidKt.ContentType("birthDateYear");
        private static final ContentType SmsOtpCode = ContentType_androidKt.ContentType("smsOTPCode");

        private Companion() {
        }

        public final ContentType getAddressAuxiliaryDetails() {
            return AddressAuxiliaryDetails;
        }

        public final ContentType getAddressCountry() {
            return AddressCountry;
        }

        public final ContentType getAddressLocality() {
            return AddressLocality;
        }

        public final ContentType getAddressRegion() {
            return AddressRegion;
        }

        public final ContentType getAddressStreet() {
            return AddressStreet;
        }

        public final ContentType getBirthDateDay() {
            return BirthDateDay;
        }

        public final ContentType getBirthDateFull() {
            return BirthDateFull;
        }

        public final ContentType getBirthDateMonth() {
            return BirthDateMonth;
        }

        public final ContentType getBirthDateYear() {
            return BirthDateYear;
        }

        public final ContentType getCreditCardExpirationDate() {
            return CreditCardExpirationDate;
        }

        public final ContentType getCreditCardExpirationDay() {
            return CreditCardExpirationDay;
        }

        public final ContentType getCreditCardExpirationMonth() {
            return CreditCardExpirationMonth;
        }

        public final ContentType getCreditCardExpirationYear() {
            return CreditCardExpirationYear;
        }

        public final ContentType getCreditCardNumber() {
            return CreditCardNumber;
        }

        public final ContentType getCreditCardSecurityCode() {
            return CreditCardSecurityCode;
        }

        public final ContentType getEmailAddress() {
            return EmailAddress;
        }

        public final ContentType getGender() {
            return Gender;
        }

        public final ContentType getNewPassword() {
            return NewPassword;
        }

        public final ContentType getNewUsername() {
            return NewUsername;
        }

        public final ContentType getPassword() {
            return Password;
        }

        public final ContentType getPersonFirstName() {
            return PersonFirstName;
        }

        public final ContentType getPersonFullName() {
            return PersonFullName;
        }

        public final ContentType getPersonLastName() {
            return PersonLastName;
        }

        public final ContentType getPersonMiddleInitial() {
            return PersonMiddleInitial;
        }

        public final ContentType getPersonMiddleName() {
            return PersonMiddleName;
        }

        public final ContentType getPersonNamePrefix() {
            return PersonNamePrefix;
        }

        public final ContentType getPersonNameSuffix() {
            return PersonNameSuffix;
        }

        public final ContentType getPhoneCountryCode() {
            return PhoneCountryCode;
        }

        public final ContentType getPhoneNumber() {
            return PhoneNumber;
        }

        public final ContentType getPhoneNumberDevice() {
            return PhoneNumberDevice;
        }

        public final ContentType getPhoneNumberNational() {
            return PhoneNumberNational;
        }

        public final ContentType getPostalAddress() {
            return PostalAddress;
        }

        public final ContentType getPostalCode() {
            return PostalCode;
        }

        public final ContentType getPostalCodeExtended() {
            return PostalCodeExtended;
        }

        public final ContentType getSmsOtpCode() {
            return SmsOtpCode;
        }

        public final ContentType getUsername() {
            return Username;
        }
    }

    ContentType plus(ContentType contentType);
}
