package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid$baseInputConnection$2 extends f30 implements iy {
    final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.this$0 = textInputServiceAndroid;
    }

    @Override // defpackage.iy
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.getView(), false);
    }
}
