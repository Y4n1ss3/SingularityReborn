package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hl implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rr0) obj).cancel(null);
                break;
            case 1:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$0((TransformedTextFieldState) obj);
                break;
            default:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1((TextFieldSelectionManager) obj);
                break;
        }
    }
}
