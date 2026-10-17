package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1", f = "CommonContextMenuArea.kt", l = {82, 83}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 extends us0 implements my {
    final /* synthetic */ TextFieldSelectionState $selectionState;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(2, hmVar);
        this.$selectionState = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(this.$selectionState, hmVar);
        commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1.J$0 = ((Offset) obj).m4526unboximpl();
        return commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1084invoke3MmeM6k(((Offset) obj).m4526unboximpl(), (hm) obj2);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1084invoke3MmeM6k(long j, hm hmVar) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1) create(Offset.m4505boximpl(j), hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r6.mo1489onShowContextMenu_2OEclM(r7, r8, r10, r12) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r13.updateClipboardEntry(r12) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            j = this.J$0;
            TextFieldSelectionState textFieldSelectionState = this.$selectionState;
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
        PlatformSelectionBehaviors platformSelectionBehaviors$foundation = this.$selectionState.getPlatformSelectionBehaviors$foundation();
        if (platformSelectionBehaviors$foundation != null) {
            CharSequence text = this.$selectionState.getTextFieldState$foundation().getVisualText().getText();
            long m1239getSelectiond9O1mEE = this.$selectionState.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE();
            Offset m4505boximpl = Offset.m4505boximpl(j);
            this.label = 2;
        }
        return w01.a;
    }
}
