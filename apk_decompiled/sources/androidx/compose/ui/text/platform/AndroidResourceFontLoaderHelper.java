package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
final class AndroidResourceFontLoaderHelper {
    public static final AndroidResourceFontLoaderHelper INSTANCE = new AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    public final Typeface create(Context context, int i) {
        return context.getResources().getFont(i);
    }
}
