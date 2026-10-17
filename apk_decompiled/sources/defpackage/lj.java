package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class lj implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldSelectionState e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ my g;
    public final /* synthetic */ int h;

    public /* synthetic */ lj(TextFieldSelectionState textFieldSelectionState, boolean z, my myVar, int i, int i2) {
        this.d = i2;
        this.e = textFieldSelectionState;
        this.f = z;
        this.g = myVar;
        this.h = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CommonContextMenuArea$lambda$11;
        w01 ContextMenuArea$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CommonContextMenuArea$lambda$11 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$11(this.e, this.f, this.g, this.h, (Composer) obj, intValue);
                return CommonContextMenuArea$lambda$11;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ContextMenuArea$lambda$1 = ContextMenu_androidKt.ContextMenuArea$lambda$1(this.e, this.f, this.g, this.h, (Composer) obj, intValue2);
                return ContextMenuArea$lambda$1;
        }
    }
}
