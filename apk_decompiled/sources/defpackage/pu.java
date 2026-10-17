package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class pu implements ky {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ pu(un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, boolean z) {
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = mutableState;
        this.i = mutableState2;
        this.e = z;
        this.j = context;
        this.k = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 expandable_3_2CpT8$lambda$25;
        int i = this.d;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                expandable_3_2CpT8$lambda$25 = ExposedDropdownMenuKt.expandable_3_2CpT8$lambda$25((String) obj7, this.e, (String) obj6, (String) obj5, (String) obj4, (iy) obj3, (SoftwareKeyboardController) obj2, (SemanticsPropertyReceiver) obj);
                return expandable_3_2CpT8$lambda$25;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) obj7;
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "double_tap_passthrough_enabled", booleanValue);
                mutableState2.setValue(Boolean.TRUE);
                nq nqVar = nr.a;
                p01.t((un) obj6, hq.d, null, new pz0(booleanValue, this.e, (Context) obj3, sharedPreferences, (ky) obj2, mutableState2, mutableState, null), 2);
                return w01.a;
        }
    }

    public /* synthetic */ pu(String str, boolean z, String str2, String str3, String str4, iy iyVar, SoftwareKeyboardController softwareKeyboardController) {
        this.f = str;
        this.e = z;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = iyVar;
        this.k = softwareKeyboardController;
    }
}
