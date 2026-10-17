package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.runtime.ComposerKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {205, ComposerKt.referenceKey, 208, 208}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerNode$show$1 extends us0 implements my {
    final /* synthetic */ TextContextMenuProvider $provider;
    Object L$0;
    int label;
    final /* synthetic */ TextContextMenuToolbarHandlerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuToolbarHandlerNode$show$1(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode, TextContextMenuProvider textContextMenuProvider, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textContextMenuToolbarHandlerNode;
        this.$provider = textContextMenuProvider;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.this$0, this.$provider, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextContextMenuToolbarHandlerNode$show$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r7.invoke(r6) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r7.showTextContextMenu(r0, r6) == r5) goto L37;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i = this.label;
        vn vnVar = vn.d;
        try {
        } catch (Throwable th2) {
            ky onHide = this.this$0.getOnHide();
            if (onHide == null) {
                throw th2;
            }
            this.L$0 = th2;
            this.label = 4;
            if (onHide.invoke(this) != vnVar) {
                th = th2;
            }
        }
        if (i == 0) {
            p10.Q(obj);
            ky onShow = this.this$0.getOnShow();
            if (onShow != null) {
                this.label = 1;
                if (onShow.invoke(this) == vnVar) {
                    return vnVar;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    ky onHide2 = this.this$0.getOnHide();
                    if (onHide2 != null) {
                        this.label = 3;
                    }
                    return w01.a;
                }
                if (i == 3) {
                    p10.Q(obj);
                    return w01.a;
                }
                if (i != 4) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$0;
                p10.Q(obj);
                throw th;
            }
            p10.Q(obj);
        }
        TextContextMenuProvider textContextMenuProvider = this.$provider;
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = this.this$0;
        this.label = 2;
    }
}
