package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class w8 implements ny {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ un f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    public /* synthetic */ w8(un unVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f = unVar;
        this.g = context;
        this.h = sharedPreferences;
        this.e = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
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
                        ComposerKt.traceEventStart(2080839251, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1127)");
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
                    TextKt.m2607TextNvy7gAk("Modules from Singularity-Magisk-Repo", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 6, 0, 131066);
                    un unVar = this.f;
                    boolean changedInstance = composer.changedInstance(unVar);
                    Context context = this.g;
                    boolean changedInstance2 = changedInstance | composer.changedInstance(context);
                    SharedPreferences sharedPreferences = this.h;
                    boolean changedInstance3 = changedInstance2 | composer.changedInstance(sharedPreferences);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new n9(unVar, context, this.e, this.i, sharedPreferences, this.j, 0);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, false, null, null, null, wk.q, composer, 1572864, 62);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(163942999, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1159)");
                    }
                    MutableState mutableState = this.e;
                    String str = (String) mutableState.getValue();
                    if (str == null) {
                        str = "";
                    }
                    kb.a("Couldn't load module list", str, ComposableLambdaKt.rememberComposableLambda(1718324283, true, new g9(this.f, this.g, this.h, this.i, mutableState, this.j), composer2, 54), composer2, 390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864139459, intValue3, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:946)");
                    }
                    kb.a("Prevent Auto-Installs", "Stops the auto installation of default meta apps.", ComposableLambdaKt.rememberComposableLambda(-1437018591, true, new g9(this.e, this.h, this.f, this.g, this.i, this.j), composer3, 54), composer3, 438);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ w8(MutableState mutableState, un unVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState2, MutableState mutableState3) {
        this.e = mutableState;
        this.f = unVar;
        this.g = context;
        this.h = sharedPreferences;
        this.i = mutableState2;
        this.j = mutableState3;
    }

    public /* synthetic */ w8(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, Context context, MutableState mutableState2, MutableState mutableState3) {
        this.e = mutableState;
        this.h = sharedPreferences;
        this.f = unVar;
        this.g = context;
        this.i = mutableState2;
        this.j = mutableState3;
    }
}
