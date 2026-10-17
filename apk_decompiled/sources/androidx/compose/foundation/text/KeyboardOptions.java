package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.dq;
import defpackage.er;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (dq) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m7300getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (dq) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i4, dq dqVar) {
        this(r0, r1, r3, r4, r5, r6, (i4 & 64) == 0 ? localeList : null, (dq) null);
        int m7276getUnspecifiedIUNYP9k = (i4 & 1) != 0 ? KeyboardCapitalization.Companion.m7276getUnspecifiedIUNYP9k() : i;
        Boolean bool3 = (i4 & 2) != 0 ? null : bool;
        int m7303getUnspecifiedPjHm6EE = (i4 & 4) != 0 ? KeyboardType.Companion.m7303getUnspecifiedPjHm6EE() : i2;
        int m7249getUnspecifiedeUduSuo = (i4 & 8) != 0 ? ImeAction.Companion.m7249getUnspecifiedeUduSuo() : i3;
        PlatformImeOptions platformImeOptions2 = (i4 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i4 & 32) != 0 ? null : bool2;
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1120copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m1126copy3m2b7yw(i, z, i2, i3);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1122copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i4 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation());
        }
        if ((i4 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        Boolean bool2 = bool;
        LocaleList localeList2 = localeList;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i5 = i2;
        return keyboardOptions.m1128copyINvB4aQ(i, z, i5, i3, platformImeOptions2, bool2, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1123copyij11fho$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i5 = i2;
        return keyboardOptions.m1129copyij11fho(i, z, i5, i3, platformImeOptions2);
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m1124getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization m7261boximpl = KeyboardCapitalization.m7261boximpl(this.capitalization);
        int m7267unboximpl = m7261boximpl.m7267unboximpl();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.Companion;
        if (KeyboardCapitalization.m7264equalsimpl0(m7267unboximpl, companion.m7276getUnspecifiedIUNYP9k())) {
            m7261boximpl = null;
        }
        return m7261boximpl != null ? m7261boximpl.m7267unboximpl() : companion.m7274getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.Companion.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m1125getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType m7278boximpl = KeyboardType.m7278boximpl(this.keyboardType);
        int m7284unboximpl = m7278boximpl.m7284unboximpl();
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (KeyboardType.m7281equalsimpl0(m7284unboximpl, companion.m7303getUnspecifiedPjHm6EE())) {
            m7278boximpl = null;
        }
        return m7278boximpl != null ? m7278boximpl.m7284unboximpl() : companion.m7302getTextPjHm6EE();
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m7264equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m7276getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m7281equalsimpl0(this.keyboardType, KeyboardType.Companion.m7303getUnspecifiedPjHm6EE()) && ImeAction.m7228equalsimpl0(this.imeAction, ImeAction.Companion.m7249getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation$default(KeyboardOptions keyboardOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation(z);
    }

    @er
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1126copy3m2b7yw(int i, boolean z, int i2, int i3) {
        return new KeyboardOptions(i, Boolean.valueOf(z), i2, i3, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (dq) null);
    }

    @er
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1128copyINvB4aQ(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        return new KeyboardOptions(i, Boolean.valueOf(z), i2, i3, platformImeOptions, bool, localeList, (dq) null);
    }

    @er
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1129copyij11fho(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i, Boolean.valueOf(z), i2, i3, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.m7264equalsimpl0(this.capitalization, keyboardOptions.capitalization) && q10.b(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m7281equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m7228equalsimpl0(this.imeAction, keyboardOptions.imeAction) && q10.b(this.platformImeOptions, keyboardOptions.platformImeOptions) && q10.b(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && q10.b(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.isCompletelyUnspecified() || keyboardOptions.equals(this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return keyboardOptions;
        }
        KeyboardCapitalization m7261boximpl = KeyboardCapitalization.m7261boximpl(this.capitalization);
        if (KeyboardCapitalization.m7264equalsimpl0(m7261boximpl.m7267unboximpl(), KeyboardCapitalization.Companion.m7276getUnspecifiedIUNYP9k())) {
            m7261boximpl = null;
        }
        int m7267unboximpl = m7261boximpl != null ? m7261boximpl.m7267unboximpl() : keyboardOptions.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType m7278boximpl = KeyboardType.m7278boximpl(this.keyboardType);
        if (KeyboardType.m7281equalsimpl0(m7278boximpl.m7284unboximpl(), KeyboardType.Companion.m7303getUnspecifiedPjHm6EE())) {
            m7278boximpl = null;
        }
        int m7284unboximpl = m7278boximpl != null ? m7278boximpl.m7284unboximpl() : keyboardOptions.keyboardType;
        ImeAction m7225boximpl = ImeAction.m7225boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m7228equalsimpl0(m7225boximpl.m7231unboximpl(), ImeAction.Companion.m7249getUnspecifiedeUduSuo()) ? null : m7225boximpl;
        int m7231unboximpl = imeAction != null ? imeAction.m7231unboximpl() : keyboardOptions.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = keyboardOptions.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = keyboardOptions.hintLocales;
        }
        return new KeyboardOptions(m7267unboximpl, bool2, m7284unboximpl, m7231unboximpl, platformImeOptions2, bool4, localeList, (dq) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m1130getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m1131getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation, reason: not valid java name */
    public final int m1132getImeActionOrDefaulteUduSuo$foundation() {
        ImeAction m7225boximpl = ImeAction.m7225boximpl(this.imeAction);
        int m7231unboximpl = m7225boximpl.m7231unboximpl();
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m7228equalsimpl0(m7231unboximpl, companion.m7249getUnspecifiedeUduSuo())) {
            m7225boximpl = null;
        }
        return m7225boximpl != null ? m7225boximpl.m7231unboximpl() : companion.m7241getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m1133getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        int m7265hashCodeimpl = KeyboardCapitalization.m7265hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int m7229hashCodeimpl = (ImeAction.m7229hashCodeimpl(this.imeAction) + ((KeyboardType.m7282hashCodeimpl(this.keyboardType) + ((m7265hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int hashCode = (m7229hashCodeimpl + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return hashCode2 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final KeyboardOptions merge(KeyboardOptions keyboardOptions) {
        KeyboardOptions fillUnspecifiedValuesWith$foundation;
        return (keyboardOptions == null || (fillUnspecifiedValuesWith$foundation = keyboardOptions.fillUnspecifiedValuesWith$foundation(this)) == null) ? this : fillUnspecifiedValuesWith$foundation;
    }

    public final ImeOptions toImeOptions$foundation(boolean z) {
        return new ImeOptions(z, m1124getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m1125getKeyboardTypeOrDefaultPjHm6EE(), m1132getImeActionOrDefaulteUduSuo$foundation(), this.platformImeOptions, getHintLocalesOrDefault(), (dq) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m7266toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m7283toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m7230toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public final KeyboardOptions getSecureTextField$foundation() {
            return KeyboardOptions.SecureTextField;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getSecureTextField$foundation$annotations() {
        }
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m1127copyINvB4aQ(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        return new KeyboardOptions(i, bool, i2, i3, platformImeOptions, bool2, localeList, (dq) null);
    }

    @er
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    @er
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1121copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i4, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i5;
        PlatformImeOptions platformImeOptions2;
        Boolean bool4;
        int i6;
        KeyboardOptions keyboardOptions2;
        int i7;
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i4 & 32) != 0) {
            bool2 = null;
        }
        if ((i4 & 64) != 0) {
            localeList2 = null;
            platformImeOptions2 = platformImeOptions;
            bool3 = bool2;
            i6 = i2;
            i5 = i3;
            i7 = i;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i5 = i3;
            platformImeOptions2 = platformImeOptions;
            bool4 = bool;
            i6 = i2;
            keyboardOptions2 = keyboardOptions;
            i7 = i;
        }
        return keyboardOptions2.m1127copyINvB4aQ(i7, bool4, i6, i5, platformImeOptions2, bool3, localeList2);
    }

    @er
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, dq dqVar) {
        this(i, z, i2, i3);
    }

    @er
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, dq dqVar) {
        this(i, z, i2, i3, platformImeOptions);
    }

    @er
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, dq dqVar) {
        this(i, z, i2, i3, platformImeOptions, bool, localeList);
    }

    private KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, dq dqVar) {
        this(i, bool, i2, i3, platformImeOptions, bool2, localeList);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.Companion.m7276getUnspecifiedIUNYP9k() : i, z, (i4 & 4) != 0 ? KeyboardType.Companion.m7303getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.Companion.m7249getUnspecifiedeUduSuo() : i3, (i4 & 16) != 0 ? null : platformImeOptions, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : localeList, (dq) null);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i, Boolean.valueOf(z), i2, i3, platformImeOptions, bool, localeList, (dq) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.Companion.m7276getUnspecifiedIUNYP9k() : i, (i4 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i4 & 4) != 0 ? KeyboardType.Companion.m7303getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.Companion.m7241getDefaulteUduSuo() : i3, (dq) null);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3) {
        this(i, Boolean.valueOf(z), i2, i3, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (dq) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.Companion.m7274getNoneIUNYP9k() : i, (i4 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i4 & 4) != 0 ? KeyboardType.Companion.m7302getTextPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.Companion.m7241getDefaulteUduSuo() : i3, (i4 & 16) != 0 ? null : platformImeOptions, (dq) null);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions) {
        this(i, Boolean.valueOf(z), i2, i3, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation()), (LocaleList) null, 64, (dq) null);
    }
}
