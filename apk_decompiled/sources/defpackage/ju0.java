package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ju0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ju0(ii0 ii0Var, ii0 ii0Var2, Handle handle, TextFieldSelectionState textFieldSelectionState, boolean z) {
        this.f = ii0Var;
        this.h = textFieldSelectionState;
        this.i = handle;
        this.g = ii0Var2;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 detectSelectionHandleDragGestures$lambda$3;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                detectSelectionHandleDragGestures$lambda$3 = TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$3((ii0) obj6, (TextFieldSelectionState) obj4, (Handle) obj3, (ii0) obj5, this.e, (PointerInputChange) obj, (Offset) obj2);
                return detectSelectionHandleDragGestures$lambda$3;
            default:
                Context context = (Context) obj6;
                MutableState mutableState = (MutableState) obj5;
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                ky kyVar = (ky) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-410361333, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2706)");
                    }
                    Alignment.Companion companion = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f));
                    Modifier.Companion companion2 = Modifier.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m647spacedBy0680j_4, centerVertically, composer, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
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
                    uo.h(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer, 48);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
                    iy constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer);
                    uo.h(companion3, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Run on Boot", null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getLabelMedium(), composer, 6, 0, 131066);
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed = composer.changed(mutableState) | composer.changedInstance(sharedPreferences) | composer.changed(kyVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new dy0(sharedPreferences, kyVar, mutableState, 9);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    boolean z = this.e;
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z, null, null, composer, 0, 108);
                    composer.endNode();
                    Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(companion2, Dp.m7611constructorimpl(90.0f));
                    RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                    boolean changedInstance = composer.changedInstance(context);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new b70(context, 7);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    ButtonKt.Button((iy) rememberedValue2, m812width3ABfNKs, z, m1056RoundedCornerShape0680j_4, null, null, null, null, null, gl.j, composer, 805306416, 496);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01.a;
        }
    }

    public /* synthetic */ ju0(Context context, boolean z, MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar) {
        this.f = context;
        this.e = z;
        this.g = mutableState;
        this.h = sharedPreferences;
        this.i = kyVar;
    }
}
