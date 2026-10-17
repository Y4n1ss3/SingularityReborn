package androidx.compose.ui.text.font;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", l = {43}, m = "preload", v = 1)
/* loaded from: classes2.dex */
public final class FontFamilyResolverImpl$preload$1 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, hm hmVar) {
        super(hmVar);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preload(null, this);
    }
}
