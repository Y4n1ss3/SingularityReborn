package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.ui.geometry.Offset;
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
@bq(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {107, 108}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextContextMenuGestureNode$tryShowContextMenu$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-localClickOffset$0, reason: not valid java name */
    final /* synthetic */ long f56$$v$c$androidxcomposeuigeometryOffset$localClickOffset$0;
    final /* synthetic */ TextContextMenuGestureNode.ClickTextContextMenuDataProvider $dataProvider;
    final /* synthetic */ TextContextMenuProvider $provider;
    int label;
    final /* synthetic */ TextContextMenuGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuGestureNode$tryShowContextMenu$1(TextContextMenuGestureNode textContextMenuGestureNode, long j, TextContextMenuProvider textContextMenuProvider, TextContextMenuGestureNode.ClickTextContextMenuDataProvider clickTextContextMenuDataProvider, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textContextMenuGestureNode;
        this.f56$$v$c$androidxcomposeuigeometryOffset$localClickOffset$0 = j;
        this.$provider = textContextMenuProvider;
        this.$dataProvider = clickTextContextMenuDataProvider;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.this$0, this.f56$$v$c$androidxcomposeuigeometryOffset$localClickOffset$0, this.$provider, this.$dataProvider, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r7.showTextContextMenu(r0, r6) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7.invoke(r0, r6) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        my myVar;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            myVar = this.this$0.onPreShowContextMenu;
            if (myVar != null) {
                Offset m4505boximpl = Offset.m4505boximpl(this.f56$$v$c$androidxcomposeuigeometryOffset$localClickOffset$0);
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        TextContextMenuProvider textContextMenuProvider = this.$provider;
        TextContextMenuGestureNode.ClickTextContextMenuDataProvider clickTextContextMenuDataProvider = this.$dataProvider;
        this.label = 2;
    }
}
