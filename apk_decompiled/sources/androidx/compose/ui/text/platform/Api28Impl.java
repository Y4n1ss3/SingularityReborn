package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final TypefaceSpan createTypefaceSpan(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
