package androidx.compose.ui.text.font;

import defpackage.ac;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontFamilyKt {
    public static final FontFamily FontFamily(Font... fontArr) {
        return new FontListFontFamily(ac.K(fontArr));
    }

    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
