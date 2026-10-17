package androidx.compose.ui.autofill;

import defpackage.ds0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutofillUtils_androidKt {
    public static final int MAX_AUTOFILL_TEXT_LENGTH = 5000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trimToSafeLength(String str) {
        return str.length() < 5000 ? str : (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(MAX_AUTOFILL_TEXT_LENGTH))) ? ds0.C0(4999, str) : ds0.C0(MAX_AUTOFILL_TEXT_LENGTH, str);
    }
}
