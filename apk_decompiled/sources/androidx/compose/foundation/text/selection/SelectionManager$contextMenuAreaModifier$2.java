package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", l = {208}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionManager$contextMenuAreaModifier$2 extends us0 implements ky {
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$contextMenuAreaModifier$2(SelectionManager selectionManager, hm hmVar) {
        super(1, hmVar);
        this.this$0 = selectionManager;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new SelectionManager$contextMenuAreaModifier$2(this.this$0, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((SelectionManager$contextMenuAreaModifier$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            xe0 contextTextAndSelection$foundation = this.this$0.getContextTextAndSelection$foundation();
            if (contextTextAndSelection$foundation != null) {
                SelectionManager selectionManager = this.this$0;
                AnnotatedString annotatedString = (AnnotatedString) contextTextAndSelection$foundation.d;
                long m7064unboximpl = ((TextRange) contextTextAndSelection$foundation.e).m7064unboximpl();
                PlatformSelectionBehaviors platformSelectionBehaviors$foundation = selectionManager.getPlatformSelectionBehaviors$foundation();
                if (platformSelectionBehaviors$foundation != null) {
                    this.label = 1;
                    Object mo1490onShowSelectionToolbarSbBc2M = platformSelectionBehaviors$foundation.mo1490onShowSelectionToolbarSbBc2M(annotatedString, m7064unboximpl, this);
                    vn vnVar = vn.d;
                    if (mo1490onShowSelectionToolbarSbBc2M == vnVar) {
                        return vnVar;
                    }
                }
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
