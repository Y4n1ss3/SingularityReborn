package androidx.compose.ui.text.font;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached", v = 1)
/* loaded from: classes2.dex */
public final class AsyncTypefaceCache$runCached$1 extends im {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, hm hmVar) {
        super(hmVar);
        this.this$0 = asyncTypefaceCache;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runCached(null, null, false, null, this);
    }
}
