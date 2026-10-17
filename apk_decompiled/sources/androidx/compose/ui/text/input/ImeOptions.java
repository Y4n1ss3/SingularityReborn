package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m7274getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m7302getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m7241getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, (i4 & 64) != 0 ? LocaleList.Companion.getEmpty() : localeList, (dq) null);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m7250copyYTHSh70$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        if ((i4 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        int i5 = i3;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        return imeOptions.m7253copyYTHSh70(z, i, z2, i2, i5, platformImeOptions2);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m7251copyuxg59PA$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        int i5 = i3;
        boolean z3 = z2;
        return imeOptions.m7254copyuxg59PA(z, i, z3, i2, i5);
    }

    /* renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m7252copywBHncE4$default(ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        if ((i4 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        if ((i4 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        LocaleList localeList2 = localeList;
        int i5 = i3;
        boolean z3 = z2;
        return imeOptions.m7255copywBHncE4(z, i, z3, i2, i5, platformImeOptions2, localeList2);
    }

    @er
    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m7253copyYTHSh70(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z, i, z2, i2, i3, platformImeOptions, this.hintLocales, (dq) null);
    }

    @er
    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m7254copyuxg59PA(boolean z, int i, boolean z2, int i2, int i3) {
        return new ImeOptions(z, i, z2, i2, i3, this.platformImeOptions, this.hintLocales, (dq) null);
    }

    /* renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m7255copywBHncE4(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        return new ImeOptions(z, i, z2, i2, i3, platformImeOptions, localeList, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m7264equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m7281equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m7228equalsimpl0(this.imeAction, imeOptions.imeAction) && q10.b(this.platformImeOptions, imeOptions.platformImeOptions) && q10.b(this.hintLocales, imeOptions.hintLocales);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m7256getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m7257getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m7258getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        int m7229hashCodeimpl = (ImeAction.m7229hashCodeimpl(this.imeAction) + ((KeyboardType.m7282hashCodeimpl(this.keyboardType) + kp0.c((KeyboardCapitalization.m7265hashCodeimpl(this.capitalization) + (Boolean.hashCode(this.singleLine) * 31)) * 31, 31, this.autoCorrect)) * 31)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return this.hintLocales.hashCode() + ((m7229hashCodeimpl + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m7266toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m7283toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m7230toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        private Companion() {
        }
    }

    @er
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, dq dqVar) {
        this(z, i, z2, i2, i3, platformImeOptions);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList, dq dqVar) {
        this(z, i, z2, i2, i3, platformImeOptions, localeList);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    @er
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, dq dqVar) {
        this(z, i, z2, i2, i3);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m7274getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m7302getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m7241getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, (dq) null);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions) {
        this(z, i, z2, i2, i3, platformImeOptions, LocaleList.Companion.getEmpty(), (dq) null);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m7274getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m7302getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m7241getDefaulteUduSuo() : i3, (dq) null);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3) {
        this(z, i, z2, i2, i3, null, null, 64, null);
    }
}
