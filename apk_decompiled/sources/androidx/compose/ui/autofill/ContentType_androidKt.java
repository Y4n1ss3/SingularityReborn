package androidx.compose.ui.autofill;

import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentType_androidKt {
    public static final ContentType ContentType(String str) {
        return new AndroidContentType(p01.C(str));
    }

    public static final String[] getContentHints(ContentType contentType) {
        contentType.getClass();
        return (String[]) ((AndroidContentType) contentType).getAndroidAutofillHints().toArray(new String[0]);
    }
}
