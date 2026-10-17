package androidx.compose.ui.text;

import defpackage.dq;
import defpackage.q10;
import defpackage.s60;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;
    private final s60 cache;
    private CacheTextLayoutInput singleSizeCacheInput;
    private TextLayoutResult singleSizeCacheResult;

    public TextLayoutCache(int i) {
        this.cache = i != 1 ? new s60(i) : null;
    }

    public final TextLayoutResult get(TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
        s60 s60Var = this.cache;
        if (s60Var != null) {
            textLayoutResult = (TextLayoutResult) s60Var.a(cacheTextLayoutInput);
        } else {
            if (!q10.b(this.singleSizeCacheInput, cacheTextLayoutInput)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(TextLayoutInput textLayoutInput, TextLayoutResult textLayoutResult) {
        s60 s60Var = this.cache;
        if (s60Var != null) {
            s60Var.b(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
        } else {
            this.singleSizeCacheInput = new CacheTextLayoutInput(textLayoutInput);
            this.singleSizeCacheResult = textLayoutResult;
        }
    }

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public /* synthetic */ TextLayoutCache(int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
