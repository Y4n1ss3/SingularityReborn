package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class o9 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ o9(SnapshotStateList snapshotStateList, un unVar, MutableState mutableState, my myVar, LazyListState lazyListState) {
        this.d = 3;
        this.i = snapshotStateList;
        this.h = unVar;
        this.e = mutableState;
        this.f = myVar;
        this.g = lazyListState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        w01 ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.h;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                p01.t((un) obj4, null, null, new ma((Context) obj5, (MutableState) obj3, (MutableState) obj2, (MutableState) obj, null, 0), 3);
                return w01Var;
            case 1:
                Activity activity = (Activity) obj5;
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                MutableState mutableState3 = (MutableState) obj;
                ((SharedPreferences) obj4).edit().putInt("led_red", (int) ((Number) mutableState.getValue()).floatValue()).putInt("led_green", (int) ((Number) mutableState2.getValue()).floatValue()).putInt("led_blue", (int) ((Number) mutableState3.getValue()).floatValue()).putBoolean("custom_led_is_running", true).apply();
                if (activity != null) {
                    Intent intent = new Intent();
                    intent.putExtra("RED", (int) ((Number) mutableState.getValue()).floatValue());
                    intent.putExtra("GREEN", (int) ((Number) mutableState2.getValue()).floatValue());
                    intent.putExtra("BLUE", (int) ((Number) mutableState3.getValue()).floatValue());
                    activity.setResult(-1, intent);
                }
                if (activity != null) {
                    activity.finish();
                }
                return w01Var;
            case 2:
                ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10((DrawerState) obj4, (Density) obj5, (FiniteAnimationSpec) obj3, (FiniteAnimationSpec) obj2, (FiniteAnimationSpec) obj);
                return ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj5;
                un unVar = (un) obj4;
                MutableState mutableState4 = (MutableState) obj3;
                my myVar = (my) obj2;
                LazyListState lazyListState = (LazyListState) obj;
                if (!ds0.n0((String) mutableState4.getValue())) {
                    String str = (String) mutableState4.getValue();
                    snapshotStateList.add("> " + str);
                    mutableState4.setValue("");
                    p01.t(unVar, null, null, new u3(snapshotStateList, myVar, str, lazyListState, (hm) null), 3);
                }
                return w01Var;
        }
    }

    public /* synthetic */ o9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.d = i;
        this.h = obj;
        this.i = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
