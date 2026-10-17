package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class oa implements my {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b8 g;
    public final /* synthetic */ un h;
    public final /* synthetic */ PackageManager i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ g80 k;
    public final /* synthetic */ e8 l;
    public final /* synthetic */ ky m;
    public final /* synthetic */ SnapshotStateMap n;
    public final /* synthetic */ MutableState o;

    public oa(boolean z, boolean z2, boolean z3, b8 b8Var, un unVar, PackageManager packageManager, Context context, g80 g80Var, e8 e8Var, ky kyVar, SnapshotStateMap snapshotStateMap, MutableState mutableState) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = b8Var;
        this.h = unVar;
        this.i = packageManager;
        this.j = context;
        this.k = g80Var;
        this.l = e8Var;
        this.m = kyVar;
        this.n = snapshotStateMap;
        this.o = mutableState;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Composer composer = (Composer) obj;
        int intValue = ((Number) obj2).intValue();
        if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060068266, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:900)");
            }
            b8 b8Var = this.g;
            boolean z = this.f;
            boolean z2 = this.e;
            boolean z3 = this.d;
            if (z3) {
                str = "Processing...";
            } else if (z2) {
                str = "Update";
            } else if (z) {
                str = "Launch";
            } else {
                d8 d8Var = b8Var.e;
                str = d8Var == d8.e ? "Open Link" : d8Var == d8.f ? "Select" : "Install";
            }
            boolean changed = composer.changed(z) | composer.changed(z2) | composer.changedInstance(this.h) | composer.changedInstance(this.i) | composer.changedInstance(b8Var);
            Context context = this.j;
            boolean changedInstance = changed | composer.changedInstance(context) | composer.changedInstance(this.k);
            e8 e8Var = this.l;
            boolean changed2 = changedInstance | composer.changed(e8Var) | composer.changed(this.m);
            Object rememberedValue = composer.rememberedValue();
            if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                na naVar = new na(this.f, this.e, this.h, b8Var, this.k, this.n, e8Var, this.i, context, this.o, this.m);
                composer.updateRememberedValue(naVar);
                rememberedValue = naVar;
            }
            ButtonKt.Button((iy) rememberedValue, null, !z3, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-463794246, true, new ka(str, 1), composer, 54), composer, 805306368, 498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }
}
