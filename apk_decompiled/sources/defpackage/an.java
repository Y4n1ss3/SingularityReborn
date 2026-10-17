package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ an(int i, boolean z, int i2, Object obj) {
        this.d = i2;
        this.g = obj;
        this.e = z;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SelectionToolbarAndHandles$lambda$1;
        w01 TrailingIcon$lambda$1;
        int i = this.d;
        int i2 = this.f;
        boolean z = this.e;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                SelectionToolbarAndHandles$lambda$1 = CoreTextFieldKt.SelectionToolbarAndHandles$lambda$1((TextFieldSelectionManager) obj3, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                return SelectionToolbarAndHandles$lambda$1;
            default:
                TrailingIcon$lambda$1 = ExposedDropdownMenuDefaults.TrailingIcon$lambda$1((ExposedDropdownMenuDefaults) obj3, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                return TrailingIcon$lambda$1;
        }
    }
}
