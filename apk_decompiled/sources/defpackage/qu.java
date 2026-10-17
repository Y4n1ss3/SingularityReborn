package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qu implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ qu(String str, MutableState mutableState, int i) {
        this.d = i;
        this.e = str;
        this.f = mutableState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 menuAnchor_2Hz36ac$lambda$0;
        int i = this.d;
        MutableState mutableState = this.f;
        String str = this.e;
        switch (i) {
            case 0:
                menuAnchor_2Hz36ac$lambda$0 = ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$0(str, mutableState);
                return menuAnchor_2Hz36ac$lambda$0;
            default:
                mutableState.setValue(str);
                return w01.a;
        }
    }
}
