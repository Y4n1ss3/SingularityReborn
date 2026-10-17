package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", l = {187}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionManager$contextMenuAreaModifier$1 extends us0 implements my {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$contextMenuAreaModifier$1(SelectionManager selectionManager, hm hmVar) {
        super(2, hmVar);
        this.this$0 = selectionManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SelectionManager$contextMenuAreaModifier$1 selectionManager$contextMenuAreaModifier$1 = new SelectionManager$contextMenuAreaModifier$1(this.this$0, hmVar);
        selectionManager$contextMenuAreaModifier$1.J$0 = ((Offset) obj).m4526unboximpl();
        return selectionManager$contextMenuAreaModifier$1;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1530invoke3MmeM6k(((Offset) obj).m4526unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1530invoke3MmeM6k(long j, hm hmVar) {
        return ((SelectionManager$contextMenuAreaModifier$1) create(Offset.m4505boximpl(j), hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            long j = this.J$0;
            xe0 contextTextAndSelection$foundation = this.this$0.getContextTextAndSelection$foundation();
            if (contextTextAndSelection$foundation != null) {
                SelectionManager selectionManager = this.this$0;
                AnnotatedString annotatedString = (AnnotatedString) contextTextAndSelection$foundation.d;
                long m7064unboximpl = ((TextRange) contextTextAndSelection$foundation.e).m7064unboximpl();
                PlatformSelectionBehaviors platformSelectionBehaviors$foundation = selectionManager.getPlatformSelectionBehaviors$foundation();
                if (platformSelectionBehaviors$foundation != null) {
                    Offset m4505boximpl = Offset.m4505boximpl(j);
                    this.label = 1;
                    Object mo1489onShowContextMenu_2OEclM = platformSelectionBehaviors$foundation.mo1489onShowContextMenu_2OEclM(annotatedString, m7064unboximpl, m4505boximpl, this);
                    vn vnVar = vn.d;
                    if (mo1489onShowContextMenu_2OEclM == vnVar) {
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
