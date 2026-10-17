package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import defpackage.dq;
import defpackage.er;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, hm hmVar);

        android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader) {
        this(i, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo7117getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader, FontVariation.Settings settings, dq dqVar) {
        this(i, typefaceLoader, settings);
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    @er
    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader, dq dqVar) {
        this(i, typefaceLoader);
    }
}
