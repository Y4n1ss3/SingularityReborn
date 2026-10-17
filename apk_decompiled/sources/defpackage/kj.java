package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class kj implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectionManager e;
    public final /* synthetic */ my f;
    public final /* synthetic */ int g;

    public /* synthetic */ kj(SelectionManager selectionManager, my myVar, int i, int i2) {
        this.d = i2;
        this.e = selectionManager;
        this.f = myVar;
        this.g = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CommonContextMenuArea$lambda$14;
        w01 ContextMenuArea$lambda$2;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CommonContextMenuArea$lambda$14 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$14(this.e, this.f, this.g, composer, intValue);
                return CommonContextMenuArea$lambda$14;
            default:
                ContextMenuArea$lambda$2 = ContextMenu_androidKt.ContextMenuArea$lambda$2(this.e, this.f, this.g, composer, intValue);
                return ContextMenuArea$lambda$2;
        }
    }
}
