package androidx.compose.ui.text.font;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {159}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter$resolve$1 extends us0 implements my {
    final /* synthetic */ AsyncFontListLoader $asyncLoader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader asyncFontListLoader, hm hmVar) {
        super(2, hmVar);
        this.$asyncLoader = asyncFontListLoader;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.$asyncLoader, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AsyncFontListLoader asyncFontListLoader = this.$asyncLoader;
            this.label = 1;
            Object load = asyncFontListLoader.load(this);
            vn vnVar = vn.d;
            if (load == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
