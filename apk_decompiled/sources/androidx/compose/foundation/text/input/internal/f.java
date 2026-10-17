package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import defpackage.hi0;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$0$0;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = TextFieldCoreModifierNode$startCursorJob$1.invokeSuspend$lambda$0((TextFieldCoreModifierNode) obj2, (hi0) obj);
                return Integer.valueOf(invokeSuspend$lambda$0);
            default:
                invokeSuspend$lambda$0$0 = TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1.invokeSuspend$lambda$0$0((TextFieldSelectionState) obj2, (TextFieldDecoratorModifierNode) obj);
                return invokeSuspend$lambda$0$0;
        }
    }
}
