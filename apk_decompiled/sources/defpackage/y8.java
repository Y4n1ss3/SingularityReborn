package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class y8 implements ny {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ un f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ PackageManager i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    public /* synthetic */ y8(un unVar, Context context, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f = unVar;
        this.g = context;
        this.h = sharedPreferences;
        this.i = packageManager;
        this.e = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1590589947, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1204)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composer, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
                    uo.h(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Modules from Singularity-Vector-Repo", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 6, 0, 131066);
                    un unVar = this.f;
                    boolean changedInstance = composer.changedInstance(unVar);
                    Context context = this.g;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(context);
                    SharedPreferences sharedPreferences = this.h;
                    boolean changedInstance3 = changedInstance2 | composer.changedInstance(sharedPreferences);
                    PackageManager packageManager = this.i;
                    boolean changedInstance4 = changedInstance3 | composer.changedInstance(packageManager);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance4 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new i9(unVar, context, this.e, this.j, sharedPreferences, packageManager, this.k, 0);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, false, null, null, null, wk.v, composer, 1572864, 62);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(860104447, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1236)");
                    }
                    final MutableState mutableState = this.e;
                    String str = (String) mutableState.getValue();
                    if (str == null) {
                        str = "";
                    }
                    final un unVar2 = this.f;
                    final Context context2 = this.g;
                    final SharedPreferences sharedPreferences2 = this.h;
                    final PackageManager packageManager2 = this.i;
                    final MutableState mutableState2 = this.j;
                    final MutableState mutableState3 = this.k;
                    kb.a("Couldn't load module list", str, ComposableLambdaKt.rememberComposableLambda(1009207779, true, new my() { // from class: m9
                        @Override // defpackage.my
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer3 = (Composer) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            if (composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1009207779, intValue3, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1237)");
                                }
                                un unVar3 = un.this;
                                boolean changedInstance5 = composer3.changedInstance(unVar3);
                                Context context3 = context2;
                                boolean changedInstance6 = changedInstance5 | composer3.changedInstance(context3);
                                SharedPreferences sharedPreferences3 = sharedPreferences2;
                                boolean changedInstance7 = changedInstance6 | composer3.changedInstance(sharedPreferences3);
                                PackageManager packageManager3 = packageManager2;
                                boolean changedInstance8 = changedInstance7 | composer3.changedInstance(packageManager3);
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (changedInstance8 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    i9 i9Var = new i9(unVar3, context3, mutableState2, mutableState, sharedPreferences3, packageManager3, mutableState3, 1);
                                    composer3.updateRememberedValue(i9Var);
                                    rememberedValue2 = i9Var;
                                }
                                ButtonKt.Button((iy) rememberedValue2, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.y, composer3, 805306368, 502);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return w01.a;
                        }
                    }, composer2, 54), composer2, 390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ y8(MutableState mutableState, un unVar, Context context, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState2, MutableState mutableState3) {
        this.e = mutableState;
        this.f = unVar;
        this.g = context;
        this.h = sharedPreferences;
        this.i = packageManager;
        this.j = mutableState2;
        this.k = mutableState3;
    }
}
