package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import defpackage.hm;
import defpackage.jj0;
import defpackage.lu0;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitLoad(Font font, hm hmVar) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i;
        if (hmVar instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) hmVar;
            int i2 = androidFontLoader$awaitLoad$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidFontLoader$awaitLoad$1.result;
                i = androidFontLoader$awaitLoad$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    boolean z = font instanceof AndroidFont;
                    vn vnVar = vn.d;
                    if (z) {
                        AndroidFont androidFont = (AndroidFont) font;
                        AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
                        Context context = this.context;
                        androidFontLoader$awaitLoad$1.label = 1;
                        Object awaitLoad = typefaceLoader.awaitLoad(context, androidFont, androidFontLoader$awaitLoad$1);
                        if (awaitLoad != vnVar) {
                            return awaitLoad;
                        }
                    } else {
                        if (!(font instanceof ResourceFont)) {
                            o.e(font, "Unknown font type: ");
                            return null;
                        }
                        Context context2 = this.context;
                        androidFontLoader$awaitLoad$1.L$0 = font;
                        androidFontLoader$awaitLoad$1.label = 2;
                        obj = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context2, androidFontLoader$awaitLoad$1);
                    }
                    return vnVar;
                }
                if (i == 1) {
                    p10.Q(obj);
                    return obj;
                }
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                font = (Font) androidFontLoader$awaitLoad$1.L$0;
                p10.Q(obj);
                return PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj, ((ResourceFont) font).getVariationSettings(), this.context);
            }
        }
        androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, hmVar);
        Object obj2 = androidFontLoader$awaitLoad$1.result;
        i = androidFontLoader$awaitLoad$1.label;
        if (i != 0) {
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj2, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object jj0Var;
        android.graphics.Typeface typeface;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        ResourceFont resourceFont = (ResourceFont) font;
        int mo7117getLoadingStrategyPKNRLFQ = resourceFont.mo7117getLoadingStrategyPKNRLFQ();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
        if (FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ, companion.m7164getBlockingPKNRLFQ())) {
            typeface = AndroidFontLoader_androidKt.load(resourceFont, this.context);
        } else {
            if (!FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ, companion.m7165getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ, companion.m7163getAsyncPKNRLFQ())) {
                    lu0.a("Unsupported Async font load path");
                    return null;
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m7161toStringimpl(resourceFont.mo7117getLoadingStrategyPKNRLFQ())));
            }
            try {
                jj0Var = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
            } catch (Throwable th) {
                jj0Var = new jj0(th);
            }
            typeface = (android.graphics.Typeface) (jj0Var instanceof jj0 ? null : jj0Var);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typeface, resourceFont.getVariationSettings(), this.context);
    }
}
