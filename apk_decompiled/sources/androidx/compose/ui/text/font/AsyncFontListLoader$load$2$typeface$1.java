package androidx.compose.ui.text.font;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends us0 implements ky {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, hm hmVar) {
        super(1, hmVar);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return obj;
            }
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object loadWithTimeoutOrNull$ui_text = asyncFontListLoader.loadWithTimeoutOrNull$ui_text(font, this);
        vn vnVar = vn.d;
        return loadWithTimeoutOrNull$ui_text == vnVar ? vnVar : loadWithTimeoutOrNull$ui_text;
    }
}
