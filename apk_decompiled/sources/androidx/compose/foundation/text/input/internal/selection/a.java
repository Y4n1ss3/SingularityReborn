package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2;
import androidx.compose.ui.geometry.Offset;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Offset invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = TextFieldMagnifierNodeImpl28$restartAnimationJob$1.invokeSuspend$lambda$0((TextFieldMagnifierNodeImpl28) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2.invokeSuspend$lambda$0((TextFieldSelectionState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
