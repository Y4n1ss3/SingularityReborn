package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class k9 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ un f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ k9(MutableState mutableState, un unVar, my myVar, MutableState mutableState2, SharedPreferences sharedPreferences, ky kyVar, boolean z, MutableState mutableState3, MutableState mutableState4) {
        this.g = mutableState;
        this.f = unVar;
        this.k = myVar;
        this.h = mutableState2;
        this.l = sharedPreferences;
        this.m = kyVar;
        this.e = z;
        this.i = mutableState3;
        this.j = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        Object r2Var;
        MutableState mutableState;
        Composer composer;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        switch (i) {
            case 0:
                final my myVar = (my) obj5;
                final MutableState mutableState2 = (MutableState) obj8;
                final SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                final ky kyVar = (ky) obj3;
                final MutableState mutableState3 = (MutableState) obj7;
                final MutableState mutableState4 = (MutableState) obj6;
                Composer composer2 = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1691556002, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:742)");
                    }
                    boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    final MutableState mutableState5 = this.g;
                    boolean changed = composer2.changed(mutableState5);
                    final un unVar = this.f;
                    boolean changedInstance = changed | composer2.changedInstance(unVar) | composer2.changedInstance(myVar) | composer2.changed(mutableState2) | composer2.changedInstance(sharedPreferences) | composer2.changed(kyVar);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        ky kyVar2 = new ky() { // from class: q9
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ky
                            public final Object invoke(Object obj9) {
                                xe0 xe0Var;
                                final boolean booleanValue2 = ((Boolean) obj9).booleanValue();
                                final String str = (String) MutableState.this.getValue();
                                final un unVar2 = unVar;
                                final SharedPreferences sharedPreferences2 = sharedPreferences;
                                if (str != null) {
                                    String str2 = booleanValue2 ? "This will restart your device's VR shell to unlock Dogfood Hub and Shell Debug." : "This will restart your device's VR shell and re-lock Dogfood Hub and Shell Debug.";
                                    final my myVar2 = myVar;
                                    final ky kyVar3 = kyVar;
                                    final MutableState mutableState6 = mutableState2;
                                    xe0Var = new xe0(str2, new iy() { // from class: m8
                                        @Override // defpackage.iy
                                        public final Object invoke() {
                                            nq nqVar = nr.a;
                                            p01.t(un.this, hq.d, null, new x9(str, booleanValue2, myVar2, sharedPreferences2, kyVar3, mutableState6, null), 2);
                                            return w01.a;
                                        }
                                    });
                                } else {
                                    xe0Var = booleanValue2 ? new xe0("This will restart your device's interface. After it reloads, please open this app again to complete the second step automatically.", new v4(5, unVar2, sharedPreferences2)) : new xe0("This will disable the Dogfood Hub and restart your device's interface", new x8(unVar2, 0));
                                }
                                mutableState3.setValue(xe0Var);
                                mutableState4.setValue(Boolean.TRUE);
                                return w01.a;
                            }
                        };
                        composer2.updateRememberedValue(kyVar2);
                        rememberedValue = kyVar2;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, this.e, null, null, composer2, 0, 108);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            default:
                List list = (List) obj8;
                ArrayList arrayList = (ArrayList) obj7;
                ArrayList arrayList2 = (ArrayList) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                Context context = (Context) obj3;
                Composer composer3 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer3.skipToGroupEnd();
                    return w01Var;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-513199301, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3411)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f));
                Modifier width = IntrinsicKt.width(Modifier.Companion, IntrinsicSize.Max);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m647spacedBy0680j_4, centerHorizontally, composer3, 54);
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, width);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                uo.h(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer3.startReplaceGroup(1725653736);
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        y80.V();
                        throw null;
                    }
                    yz0 yz0Var = (yz0) next;
                    MutableState mutableState6 = (MutableState) arrayList.get(i2);
                    MutableState mutableState7 = (MutableState) arrayList2.get(i2);
                    MutableState mutableState8 = (MutableState) arrayList3.get(i2);
                    boolean booleanValue2 = ((Boolean) arrayList4.get(i2)).booleanValue();
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    w01 w01Var2 = w01Var;
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_42 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f));
                    Iterator it2 = it;
                    Modifier.Companion companion3 = Modifier.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m647spacedBy0680j_42, centerVertically, composer3, 54);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    ArrayList arrayList5 = arrayList4;
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    ArrayList arrayList6 = arrayList3;
                    iy constructor2 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion4, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion4, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, weight$default);
                    iy constructor3 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                    uo.h(companion4, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion4, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String str = yz0Var.a;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    Composer composer4 = composer3;
                    TextKt.m2607TextNvy7gAk(str, null, materialTheme.getColorScheme(composer3, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getLabelMedium(), composer4, 0, 0, 131066);
                    Composer composer5 = composer4;
                    if (((CharSequence) mutableState8.getValue()).length() > 0) {
                        composer5.startReplaceGroup(-1058087249);
                        TextKt.m2607TextNvy7gAk((String) mutableState8.getValue(), null, materialTheme.getColorScheme(composer5, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getLabelSmall(), composer5, 0, 0, 131066);
                        composer5 = composer5;
                    } else {
                        composer5.startReplaceGroup(-1286413440);
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    if (!((Boolean) mutableState6.getValue()).booleanValue() || booleanValue2) {
                        Composer composer6 = composer5;
                        composer6.startReplaceGroup(-629283853);
                        PaddingValues m757PaddingValuesYgX7TsA$default = PaddingKt.m757PaddingValuesYgX7TsA$default(Dp.m7611constructorimpl(8.0f), 0.0f, 2, null);
                        boolean z = this.e && ((Boolean) this.g.getValue()).booleanValue() && !((Boolean) mutableState7.getValue()).booleanValue();
                        Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(companion3, Dp.m7611constructorimpl(80.0f));
                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                        un unVar2 = this.f;
                        boolean changedInstance2 = composer6.changedInstance(unVar2) | composer6.changed(mutableState7) | composer6.changed(mutableState8) | composer6.changedInstance(context) | composer6.changed(yz0Var) | composer6.changed(mutableState6);
                        Object rememberedValue2 = composer6.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                            mutableState = mutableState7;
                            r2Var = new r2(unVar2, mutableState, mutableState8, context, yz0Var, mutableState6);
                            composer6.updateRememberedValue(r2Var);
                        } else {
                            r2Var = rememberedValue2;
                            mutableState = mutableState7;
                        }
                        ButtonKt.Button((iy) r2Var, m812width3ABfNKs, z, m1056RoundedCornerShape0680j_4, null, null, null, m757PaddingValuesYgX7TsA$default, null, ComposableLambdaKt.rememberComposableLambda(-1469866524, true, new g6(5, booleanValue2, mutableState), composer6, 54), composer6, 817889328, 368);
                        composer = composer6;
                        composer.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-629784038);
                        composer = composer5;
                        TextKt.m2607TextNvy7gAk("Installed", null, materialTheme.getColorScheme(composer5, i4).m1772getPrimary0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getLabelMedium(), composer, 6, 0, 131066);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    composer3 = composer;
                    w01Var = w01Var2;
                    it = it2;
                    i2 = i3;
                    arrayList4 = arrayList5;
                    arrayList3 = arrayList6;
                }
                Composer composer7 = composer3;
                w01 w01Var3 = w01Var;
                composer7.endReplaceGroup();
                composer7.endNode();
                if (!ComposerKt.isTraceInProgress()) {
                    return w01Var3;
                }
                ComposerKt.traceEventEnd();
                return w01Var3;
        }
    }

    public /* synthetic */ k9(List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z, un unVar, Context context, MutableState mutableState) {
        this.h = list;
        this.i = arrayList;
        this.j = arrayList2;
        this.k = arrayList3;
        this.l = arrayList4;
        this.e = z;
        this.f = unVar;
        this.m = context;
        this.g = mutableState;
    }
}
