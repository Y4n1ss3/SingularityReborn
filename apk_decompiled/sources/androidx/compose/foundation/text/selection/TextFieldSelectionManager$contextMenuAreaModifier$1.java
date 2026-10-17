package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
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
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends us0 implements my {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, hmVar);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((Offset) obj).m4526unboximpl();
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1566invoke3MmeM6k(((Offset) obj).m4526unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1566invoke3MmeM6k(long j, hm hmVar) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$1) create(Offset.m4505boximpl(j), hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r6.mo1489onShowContextMenu_2OEclM(r7, r8, r10, r12) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r13.updateClipboardEntry$foundation(r12) == r3) goto L19;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        xe0 contextTextAndSelection;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            j = this.J$0;
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            this.J$0 = j;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            p10.Q(obj);
        }
        contextTextAndSelection = this.this$0.getContextTextAndSelection();
        if (contextTextAndSelection != null) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
            String str = (String) contextTextAndSelection.d;
            long m7064unboximpl = ((TextRange) contextTextAndSelection.e).m7064unboximpl();
            PlatformSelectionBehaviors platformSelectionBehaviors$foundation = textFieldSelectionManager2.getPlatformSelectionBehaviors$foundation();
            if (platformSelectionBehaviors$foundation != null) {
                Offset m4505boximpl = Offset.m4505boximpl(j);
                this.label = 2;
            }
        }
        return w01.a;
    }
}
