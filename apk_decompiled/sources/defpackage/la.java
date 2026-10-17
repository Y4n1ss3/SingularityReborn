package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class la implements my {
    public final /* synthetic */ SharedPreferences d;
    public final /* synthetic */ q90 e;
    public final /* synthetic */ sa f;
    public final /* synthetic */ LazyItemScope g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ ky j;

    public la(SharedPreferences sharedPreferences, q90 q90Var, sa saVar, LazyItemScope lazyItemScope, Context context, ky kyVar, ky kyVar2) {
        this.d = sharedPreferences;
        this.e = q90Var;
        this.f = saVar;
        this.g = lazyItemScope;
        this.h = context;
        this.i = kyVar;
        this.j = kyVar2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Intent intent;
        Object jj0Var;
        ActivityInfo activityInfo;
        Composer composer = (Composer) obj;
        int intValue = ((Number) obj2).intValue();
        if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-952503889, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1260)");
            }
            q90 q90Var = this.e;
            String string = this.d.getString("vector_pkg_".concat(q90Var.a), null);
            if (string == null) {
                string = q90Var.i;
            }
            String str = string;
            sa saVar = this.f;
            boolean z2 = saVar.d;
            boolean z3 = saVar.c;
            boolean z4 = saVar.g;
            boolean changed = composer.changed(saVar.f) | composer.changed(str) | composer.changed(z2);
            Object rememberedValue = composer.rememberedValue();
            Context context = this.h;
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                if (!z2 || str == null) {
                    z = true;
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                    if (launchIntentForPackage == null) {
                        z = true;
                        for (Object obj3 : y80.E(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LEANBACK_LAUNCHER"), new Intent("android.intent.action.MAIN").addCategory("de.robv.android.xposed.category.MODULE_SETTINGS"), new Intent("android.intent.action.APPLICATION_PREFERENCES"))) {
                            obj3.getClass();
                            Intent intent2 = (Intent) obj3;
                            intent2.setPackage(str);
                            try {
                                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                                queryIntentActivities.getClass();
                                jj0Var = (ResolveInfo) yi.q0(queryIntentActivities);
                            } catch (Throwable th) {
                                jj0Var = new jj0(th);
                            }
                            if (jj0Var instanceof jj0) {
                                jj0Var = null;
                            }
                            ResolveInfo resolveInfo = (ResolveInfo) jj0Var;
                            if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && activityInfo.exported) {
                                intent = new Intent(intent2).setClassName(activityInfo.packageName, activityInfo.name).addFlags(GroupFlagsKt.IsMovableContentFlag);
                                break;
                            }
                        }
                    } else {
                        intent = launchIntentForPackage.addFlags(GroupFlagsKt.IsMovableContentFlag);
                        z = true;
                    }
                    composer.updateRememberedValue(intent);
                    rememberedValue = intent;
                }
                intent = null;
                composer.updateRememberedValue(intent);
                rememberedValue = intent;
            } else {
                z = true;
            }
            Intent intent3 = (Intent) rememberedValue;
            boolean z5 = (!z2 || z4 || intent3 == null) ? false : z;
            String str2 = z3 ? "Processing..." : z4 ? "Update" : z5 ? "Open Module" : z2 ? "Open Vector" : "Install";
            boolean changed2 = composer.changed(q90Var) | composer.changed(z5) | composer.changed(this.g) | composer.changedInstance(context) | composer.changedInstance(intent3) | composer.changed(this.i) | composer.changed(saVar) | composer.changed(this.j);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                ja jaVar = new ja(z5, this.g, saVar, context, this.i, this.j, this.e, intent3);
                composer.updateRememberedValue(jaVar);
                rememberedValue2 = jaVar;
            }
            ButtonKt.Button((iy) rememberedValue2, null, !z3, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1616165823, z, new ka(str2, 0), composer, 54), composer, 805306368, 498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }
}
