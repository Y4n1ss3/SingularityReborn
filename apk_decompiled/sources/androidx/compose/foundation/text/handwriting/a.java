package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.ui.Modifier;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier.Node e;

    public /* synthetic */ a(int i, Modifier.Node node) {
        this.d = i;
        this.e = node;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        ComposeInputMethodManager composeImm_delegate$lambda$0;
        w01 pointerInputNode$lambda$0;
        ComposeInputMethodManager composeImm_delegate$lambda$02;
        int i = this.d;
        Modifier.Node node = this.e;
        switch (i) {
            case 0:
                composeImm_delegate$lambda$0 = HandwritingDetectorNode.composeImm_delegate$lambda$0((HandwritingDetectorNode) node);
                return composeImm_delegate$lambda$0;
            case 1:
                pointerInputNode$lambda$0 = HandwritingDetectorNode.pointerInputNode$lambda$0((HandwritingDetectorNode) node);
                return pointerInputNode$lambda$0;
            default:
                composeImm_delegate$lambda$02 = HandwritingHandlerNode.composeImm_delegate$lambda$0((HandwritingHandlerNode) node);
                return composeImm_delegate$lambda$02;
        }
    }
}
