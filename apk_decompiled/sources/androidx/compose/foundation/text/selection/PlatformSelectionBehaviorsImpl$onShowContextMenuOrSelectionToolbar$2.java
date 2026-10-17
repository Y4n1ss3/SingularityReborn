package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", l = {172}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-text-TextRange$-selection$0, reason: not valid java name */
    final /* synthetic */ long f58$$v$c$androidxcomposeuitextTextRange$selection$0;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = platformSelectionBehaviorsImpl;
        this.$text = charSequence;
        this.f58$$v$c$androidxcomposeuitextTextRange$selection$0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 = new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this.this$0, this.$text, this.f58$$v$c$androidxcomposeuitextTextRange$selection$0, hmVar);
        platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2;
    }

    @Override // defpackage.my
    public final Object invoke(TextClassifier textClassifier, hm hmVar) {
        return ((PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2) create(textClassifier, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object m1494classifyTextM8tDOmk;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.f58$$v$c$androidxcomposeuitextTextRange$selection$0;
            this.label = 1;
            m1494classifyTextM8tDOmk = platformSelectionBehaviorsImpl.m1494classifyTextM8tDOmk(charSequence, j, textClassifier, this);
            vn vnVar = vn.d;
            if (m1494classifyTextM8tDOmk == vnVar) {
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
