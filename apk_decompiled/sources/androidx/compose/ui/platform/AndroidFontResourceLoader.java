package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import defpackage.er;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;
    private final Context context;

    public AndroidFontResourceLoader(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @er
    public Typeface load(Font font) {
        if (font instanceof ResourceFont) {
            return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
        }
        o.e(font, "Unknown font type: ");
        return null;
    }
}
