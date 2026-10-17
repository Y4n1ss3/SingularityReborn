package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import defpackage.dq;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidFileFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final String cacheKey;
    private final File file;

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, dq dqVar) {
        this(file, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m7179getNormal_LCdwA() : i, settings, null);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text(Context context) {
        return TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final File getFile() {
        return this.file;
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m7174toStringimpl(mo7125getStyle_LCdwA())) + ')';
    }

    private AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(fontWeight, i, settings, null);
        this.file = file;
        setTypeface$ui_text(doLoad$ui_text(null));
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, dq dqVar) {
        this(file, fontWeight, i, settings);
    }
}
