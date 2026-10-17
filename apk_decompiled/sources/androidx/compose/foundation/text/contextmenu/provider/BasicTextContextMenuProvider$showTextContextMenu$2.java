package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BasicTextContextMenuProvider$showTextContextMenu$2 extends us0 implements ky {
    final /* synthetic */ BasicTextContextMenuProvider.SessionImpl $localSession;
    int label;
    final /* synthetic */ BasicTextContextMenuProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(BasicTextContextMenuProvider basicTextContextMenuProvider, BasicTextContextMenuProvider.SessionImpl sessionImpl, hm hmVar) {
        super(1, hmVar);
        this.this$0 = basicTextContextMenuProvider;
        this.$localSession = sessionImpl;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.this$0, this.$localSession, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, w01] */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                this.this$0.setSession(this.$localSession);
                BasicTextContextMenuProvider.SessionImpl sessionImpl = this.$localSession;
                this.label = 1;
                Object awaitClose = sessionImpl.awaitClose(this);
                vn vnVar = vn.d;
                if (awaitClose == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            this.this$0.setSession(null);
            this = w01.a;
            return this;
        } catch (Throwable th) {
            this.this$0.setSession(null);
            throw th;
        }
    }
}
