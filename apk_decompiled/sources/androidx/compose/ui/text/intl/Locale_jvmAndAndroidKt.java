package androidx.compose.ui.text.intl;

import defpackage.er;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Locale_jvmAndAndroidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Locale parseLanguageTag(String str) {
        java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(str);
        if (q10.b(forLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    @er
    public static /* synthetic */ void PlatformLocale$annotations() {
    }
}
