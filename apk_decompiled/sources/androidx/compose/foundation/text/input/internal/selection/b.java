package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements iy {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        String onExtendDrag_k_4lQ0M$lambda$0;
        String onExtend_k_4lQ0M$lambda$0;
        String onDragDone$lambda$0;
        String onStart_9KIMszo$lambda$0;
        String onDragStop$lambda$0;
        switch (this.d) {
            case 0:
                onExtendDrag_k_4lQ0M$lambda$0 = TextFieldSelectionState.TextFieldMouseSelectionObserver.onExtendDrag_k_4lQ0M$lambda$0();
                return onExtendDrag_k_4lQ0M$lambda$0;
            case 1:
                onExtend_k_4lQ0M$lambda$0 = TextFieldSelectionState.TextFieldMouseSelectionObserver.onExtend_k_4lQ0M$lambda$0();
                return onExtend_k_4lQ0M$lambda$0;
            case 2:
                onDragDone$lambda$0 = TextFieldSelectionState.TextFieldMouseSelectionObserver.onDragDone$lambda$0();
                return onDragDone$lambda$0;
            case 3:
                onStart_9KIMszo$lambda$0 = TextFieldSelectionState.TextFieldMouseSelectionObserver.onStart_9KIMszo$lambda$0();
                return onStart_9KIMszo$lambda$0;
            default:
                onDragStop$lambda$0 = TextFieldSelectionState.TextFieldTextDragObserver.onDragStop$lambda$0();
                return onDragStop$lambda$0;
        }
    }
}
