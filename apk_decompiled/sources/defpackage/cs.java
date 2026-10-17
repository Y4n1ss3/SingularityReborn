package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class cs implements ny {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ cs(SharedPreferences sharedPreferences, un unVar, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.e = sharedPreferences;
        this.j = unVar;
        this.f = context;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.k = mutableState4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f3, code lost:
    
        if (r2 == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        un unVar;
        MutableState mutableState2;
        Context context;
        SharedPreferences sharedPreferences;
        MutableState mutableState3;
        List list;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = 54;
        float f = 0.0f;
        float f2 = 12.0f;
        Object obj4 = this.k;
        Object obj5 = this.f;
        Object obj6 = this.j;
        int i3 = 0;
        switch (i) {
            case 0:
                un unVar2 = (un) obj6;
                Context context2 = (Context) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-115569439, intValue, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DomainBlockerActivity.kt:279)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(companion, Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m763paddingVpY3zN4);
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
                    uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                    uo.h(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight$default);
                    iy constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer);
                    uo.h(companion3, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("Custom Domains", null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodyLarge(), composer, 1572870, 0, 131006);
                    MutableState mutableState5 = this.g;
                    TextKt.m2607TextNvy7gAk("Blocks " + ((List) mutableState5.getValue()).size() + " domain" + (((List) mutableState5.getValue()).size() == 1 ? "" : "s") + " you've added", null, materialTheme.getColorScheme(composer, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodyMedium(), composer, 0, 0, 131066);
                    composer.endNode();
                    MutableState mutableState6 = this.h;
                    boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
                    Object obj7 = this.e;
                    boolean changedInstance = composer.changedInstance(obj7) | composer.changedInstance(unVar2) | composer.changedInstance(context2);
                    Object rememberedValue = composer.rememberedValue();
                    MutableState mutableState7 = this.i;
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        mutableState = mutableState5;
                        rememberedValue = new y4(obj7, unVar2, mutableState6, mutableState7, context2, 4);
                        mutableState6 = mutableState6;
                        context2 = context2;
                        mutableState7 = mutableState7;
                        unVar = unVar2;
                        composer.updateRememberedValue(rememberedValue);
                    } else {
                        mutableState = mutableState5;
                        unVar = unVar2;
                    }
                    SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, false, null, null, composer, 0, 124);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer, 6);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
                    iy constructor4 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer);
                    uo.h(companion3, m3878constructorimpl4, rowMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion3, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    String str = (String) mutableState4.getValue();
                    Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    Object rememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion4 = Composer.Companion;
                    if (rememberedValue2 == companion4.getEmpty()) {
                        rememberedValue2 = new i3(mutableState4, 8);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    OutlinedTextFieldKt.OutlinedTextField(str, (ky) rememberedValue2, weight$default2, false, false, (TextStyle) null, (my) cl.c, (my) null, (my) null, (my) null, (my) null, (my) null, (my) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257464);
                    SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(8.0f)), composer, 6);
                    boolean changedInstance2 = composer.changedInstance(context2) | composer.changedInstance(unVar);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == companion4.getEmpty()) {
                        mutableState2 = mutableState;
                        Object r2Var = new r2(context2, mutableState4, mutableState2, unVar, mutableState7, mutableState6);
                        composer.updateRememberedValue(r2Var);
                        rememberedValue3 = r2Var;
                    } else {
                        mutableState2 = mutableState;
                    }
                    ButtonKt.Button((iy) rememberedValue3, null, false, null, null, null, null, null, null, cl.d, composer, 805306368, 510);
                    composer.endNode();
                    if (((List) mutableState2.getValue()).isEmpty()) {
                        composer.startReplaceGroup(712633751);
                    } else {
                        composer.startReplaceGroup(729830908);
                        float f3 = 4.0f;
                        SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion, Dp.m7611constructorimpl(4.0f)), composer, 6);
                        for (String str2 : (List) mutableState2.getValue()) {
                            Modifier.Companion companion5 = Modifier.Companion;
                            Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, Dp.m7611constructorimpl(f3), 1, null);
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
                            int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, m764paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                            iy constructor5 = companion6.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor5);
                            } else {
                                composer.useNode();
                            }
                            Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer);
                            uo.h(companion6, m3878constructorimpl5, rowMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
                            Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion6, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                            TextKt.m2607TextNvy7gAk(str2, RowScope.weight$default(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 131068);
                            boolean changedInstance3 = composer.changedInstance(context2) | composer.changed(str2) | composer.changedInstance(unVar);
                            Object rememberedValue4 = composer.rememberedValue();
                            if (changedInstance3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                Object r2Var2 = new r2(context2, str2, mutableState2, unVar, mutableState7, mutableState6);
                                composer.updateRememberedValue(r2Var2);
                                rememberedValue4 = r2Var2;
                            }
                            IconButtonKt.IconButton((iy) rememberedValue4, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1547876126, true, new n2(str2, 2), composer, 54), composer, 1572864, 62);
                            composer.endNode();
                            f3 = 4.0f;
                        }
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer.skipToGroupEnd();
                    break;
                }
                break;
            case 1:
                Context context3 = (Context) obj5;
                ky kyVar = (ky) obj4;
                un unVar3 = (un) obj6;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(648510291, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2068)");
                    }
                    Object rememberedValue5 = composer2.rememberedValue();
                    Composer.Companion companion7 = Composer.Companion;
                    if (rememberedValue5 == companion7.getEmpty()) {
                        rememberedValue5 = y80.E(72, 80, 90, 100, 120, 144, 180, Integer.valueOf(ComposerKt.invocationKey), 240);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    List list2 = (List) rememberedValue5;
                    Object rememberedValue6 = composer2.rememberedValue();
                    Object empty = companion7.getEmpty();
                    SharedPreferences sharedPreferences2 = this.e;
                    if (rememberedValue6 == empty) {
                        String string = sharedPreferences2.getString("fps_available_rates", null);
                        if (string != null) {
                            List w0 = ds0.w0(string, new String[]{","});
                            ArrayList arrayList = new ArrayList();
                            Iterator it = w0.iterator();
                            while (it.hasNext()) {
                                Integer e0 = ks0.e0(ds0.E0((String) it.next()).toString());
                                if (e0 != null) {
                                    arrayList.add(e0);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj8 = arrayList.get(i3);
                                i3++;
                                if (list2.contains(Integer.valueOf(((Number) obj8).intValue()))) {
                                    arrayList2.add(obj8);
                                }
                            }
                            boolean isEmpty = arrayList2.isEmpty();
                            list = arrayList2;
                            break;
                        }
                        list = null;
                        if (list == null) {
                            list = list2;
                        }
                        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list, null, 2, null);
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    MutableState mutableState8 = (MutableState) rememberedValue6;
                    boolean changedInstance4 = composer2.changedInstance(sharedPreferences2) | composer2.changedInstance(context3);
                    MutableState mutableState9 = this.g;
                    boolean changed = changedInstance4 | composer2.changed(mutableState9) | composer2.changedInstance(list2);
                    MutableState mutableState10 = this.h;
                    boolean changed2 = changed | composer2.changed(mutableState10);
                    Object rememberedValue7 = composer2.rememberedValue();
                    if (changed2 || rememberedValue7 == Composer.Companion.getEmpty()) {
                        context = context3;
                        sharedPreferences = sharedPreferences2;
                        mutableState3 = mutableState9;
                        dz0 dz0Var = new dz0(sharedPreferences, context, list2, mutableState3, mutableState8, mutableState10, null);
                        mutableState10 = mutableState10;
                        composer2.updateRememberedValue(dz0Var);
                        rememberedValue7 = dz0Var;
                    } else {
                        context = context3;
                        sharedPreferences = sharedPreferences2;
                        mutableState3 = mutableState9;
                    }
                    EffectsKt.LaunchedEffect(w01Var, (my) rememberedValue7, composer2, 6);
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1451910689, true, new n3(this.i, sharedPreferences, mutableState10, kyVar, mutableState3, unVar3, context, mutableState8), composer2, 54), composer2, 196614, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer2.skipToGroupEnd();
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = (ArrayList) obj6;
                rw0 rw0Var = (rw0) obj5;
                ky kyVar2 = (ky) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1943510839, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4131)");
                    }
                    int size2 = arrayList3.size();
                    while (i3 < size2) {
                        Object obj9 = arrayList3.get(i3);
                        i3++;
                        String str3 = (String) obj9;
                        PaddingValues m756PaddingValuesYgX7TsA = PaddingKt.m756PaddingValuesYgX7TsA(Dp.m7611constructorimpl(f2), Dp.m7611constructorimpl(f));
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1521841993, true, new n2(str3, 4), composer3, i2);
                        MutableState mutableState11 = this.g;
                        boolean changed3 = composer3.changed(mutableState11) | composer3.changed(str3);
                        float f4 = f2;
                        SharedPreferences sharedPreferences3 = this.e;
                        boolean changedInstance5 = changed3 | composer3.changedInstance(sharedPreferences3) | composer3.changedInstance(rw0Var) | composer3.changed(kyVar2);
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changedInstance5 || rememberedValue8 == Composer.Companion.getEmpty()) {
                            rememberedValue8 = new uw0(str3, sharedPreferences3, rw0Var, kyVar2, mutableState11, this.h, this.i);
                            composer3.updateRememberedValue(rememberedValue8);
                        }
                        AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (iy) rememberedValue8, null, null, null, false, null, m756PaddingValuesYgX7TsA, null, composer3, 12582918, 380);
                        f2 = f4;
                        i2 = 54;
                        f = 0.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer3.skipToGroupEnd();
                    break;
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ cs(SharedPreferences sharedPreferences, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ky kyVar, un unVar) {
        this.e = sharedPreferences;
        this.f = context;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.k = kyVar;
        this.j = unVar;
    }

    public /* synthetic */ cs(ArrayList arrayList, MutableState mutableState, SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, MutableState mutableState2, MutableState mutableState3) {
        this.j = arrayList;
        this.g = mutableState;
        this.e = sharedPreferences;
        this.f = rw0Var;
        this.k = kyVar;
        this.h = mutableState2;
        this.i = mutableState3;
    }
}
