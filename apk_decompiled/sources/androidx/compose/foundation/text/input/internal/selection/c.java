package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ c(long j, int i) {
        this.d = i;
        this.e = j;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return TextFieldSelectionState.TextFieldMouseSelectionObserver.onDrag_3MmeM6k$lambda$0(this.e);
            case 1:
                return TextFieldSelectionState.TextFieldTextDragObserver.onDrag_k_4lQ0M$lambda$0(this.e);
            default:
                return TextFieldSelectionState.TextFieldTextDragObserver.onStart_3MmeM6k$lambda$0(this.e);
        }
    }
}
