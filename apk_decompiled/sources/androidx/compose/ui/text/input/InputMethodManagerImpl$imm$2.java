package androidx.compose.ui.text.input;

import android.view.View;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputMethodManagerImpl$imm$2 extends f30 implements iy {
    final /* synthetic */ InputMethodManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.this$0 = inputMethodManagerImpl;
    }

    @Override // defpackage.iy
    public final android.view.inputmethod.InputMethodManager invoke() {
        View view;
        view = this.this$0.view;
        Object systemService = view.getContext().getSystemService("input_method");
        systemService.getClass();
        return (android.view.inputmethod.InputMethodManager) systemService;
    }
}
