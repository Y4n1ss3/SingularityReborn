package androidx.compose.foundation.text;

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
@bq(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextLinkScope$LinksComposables$1$3$1 extends us0 implements my {
    final /* synthetic */ LinkStateInteractionSourceObserver $linkStateObserver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$3$1(LinkStateInteractionSourceObserver linkStateInteractionSourceObserver, hm hmVar) {
        super(2, hmVar);
        this.$linkStateObserver = linkStateInteractionSourceObserver;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextLinkScope$LinksComposables$1$3$1(this.$linkStateObserver, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextLinkScope$LinksComposables$1$3$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this.$linkStateObserver;
            this.label = 1;
            Object collectInteractionsForLinks = linkStateInteractionSourceObserver.collectInteractionsForLinks(this);
            vn vnVar = vn.d;
            if (collectInteractionsForLinks == vnVar) {
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
