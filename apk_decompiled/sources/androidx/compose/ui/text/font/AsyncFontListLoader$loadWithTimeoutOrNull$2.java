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
@bq(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {315}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends us0 implements my {
    final /* synthetic */ Font $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, hm hmVar) {
        super(2, hmVar);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = font;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        PlatformFontLoader platformFontLoader;
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
        platformFontLoader = this.this$0.platformFontLoader;
        Font font = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object awaitLoad = platformFontLoader.awaitLoad(font, this);
        vn vnVar = vn.d;
        return awaitLoad == vnVar ? vnVar : awaitLoad;
    }
}
