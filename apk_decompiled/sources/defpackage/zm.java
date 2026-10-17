package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ zm(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = mutableState;
        this.e = z;
        this.i = rw0Var;
        this.j = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 CoreTextField$lambda$20$0;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                CoreTextField$lambda$20$0 = CoreTextFieldKt.CoreTextField$lambda$20$0((LegacyTextFieldState) obj6, this.e, (WindowInfo) obj5, (TextFieldSelectionManager) obj4, (TextFieldValue) obj3, (OffsetMapping) obj2, (LayoutCoordinates) obj);
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((MutableState) obj4).setValue(bool);
                sharedPreferences.edit().putBoolean("root_blocker_is_running", booleanValue).apply();
                p01.t((un) obj5, null, null, new d01(booleanValue, (Context) obj3, this.e, sharedPreferences, (SnackbarHostState) obj2, null), 3);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                r6.f((MutableState) obj4, bool2, (SharedPreferences) obj6, "persist_protect_toggle_enabled", booleanValue2);
                nq nqVar = nr.a;
                p01.t((un) obj5, hq.d, null, new pe(this.e, booleanValue2, (rw0) obj3, (ky) obj2, null, 2), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ zm(SharedPreferences sharedPreferences, un unVar, Context context, MutableState mutableState, boolean z, SnackbarHostState snackbarHostState) {
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = mutableState;
        this.i = context;
        this.e = z;
        this.j = snackbarHostState;
    }

    public /* synthetic */ zm(LegacyTextFieldState legacyTextFieldState, boolean z, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        this.f = legacyTextFieldState;
        this.e = z;
        this.g = windowInfo;
        this.h = textFieldSelectionManager;
        this.i = textFieldValue;
        this.j = offsetMapping;
    }
}
