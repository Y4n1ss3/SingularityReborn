package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        String invokeSuspend$lambda$1$0;
        CursorAnchorInfo access$calculateCursorAnchorInfo;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$1$0 = AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.invokeSuspend$lambda$1$0((TransformedTextFieldState) obj);
                return invokeSuspend$lambda$1$0;
            default:
                access$calculateCursorAnchorInfo = CursorAnchorInfoController.access$calculateCursorAnchorInfo((CursorAnchorInfoController) obj);
                return access$calculateCursorAnchorInfo;
        }
    }
}
