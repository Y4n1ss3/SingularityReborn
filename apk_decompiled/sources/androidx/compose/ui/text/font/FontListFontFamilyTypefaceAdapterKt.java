package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import defpackage.jj0;
import defpackage.ky;
import defpackage.o;
import defpackage.xe0;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final xe0 firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, ky kyVar) {
        Object invoke;
        Object obj;
        Object jj0Var;
        Object obj2;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int mo7117getLoadingStrategyPKNRLFQ = font.mo7117getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ, companion.m7164getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.a(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.d(key);
                        }
                        if (asyncTypefaceResult != null) {
                            obj = asyncTypefaceResult.m7134unboximpl();
                        } else {
                            try {
                                invoke = platformFontLoader.loadBlocking(font);
                            } catch (Exception unused) {
                                invoke = kyVar.invoke(typefaceRequest);
                            }
                            Object obj3 = invoke;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj3, false, 8, null);
                            obj = obj3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj == null) {
                    obj = kyVar.invoke(typefaceRequest);
                }
                return new xe0(arrayList, FontSynthesis_androidKt.m7194synthesizeTypefaceFxwP2eA(typefaceRequest.m7219getFontSynthesisGVVA2EU(), obj, font, typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ, companion.m7165getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.a(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.d(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            obj2 = asyncTypefaceResult2.m7134unboximpl();
                        } else {
                            try {
                                jj0Var = platformFontLoader.loadBlocking(font);
                            } catch (Throwable th2) {
                                jj0Var = new jj0(th2);
                            }
                            Object obj4 = jj0Var instanceof jj0 ? null : jj0Var;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, obj4, false, 8, null);
                            obj2 = obj4;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (obj2 != null) {
                    return new xe0(arrayList, FontSynthesis_androidKt.m7194synthesizeTypefaceFxwP2eA(typefaceRequest.m7219getFontSynthesisGVVA2EU(), obj2, font, typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ, companion.m7163getAsyncPKNRLFQ())) {
                    o.l(font, "Unknown font type ");
                    return null;
                }
                AsyncTypefaceCache.AsyncTypefaceResult m7126get1ASDuI8 = asyncTypefaceCache.m7126get1ASDuI8(font, platformFontLoader);
                if (m7126get1ASDuI8 == null) {
                    if (arrayList == null) {
                        arrayList = y80.G(font);
                    } else {
                        arrayList.add(font);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m7132isPermanentFailureimpl(m7126get1ASDuI8.m7134unboximpl()) && m7126get1ASDuI8.m7134unboximpl() != null) {
                    return new xe0(arrayList, FontSynthesis_androidKt.m7194synthesizeTypefaceFxwP2eA(typefaceRequest.m7219getFontSynthesisGVVA2EU(), m7126get1ASDuI8.m7134unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA()));
                }
            }
        }
        return new xe0(arrayList, kyVar.invoke(typefaceRequest));
    }
}
