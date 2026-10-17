package defpackage;

import android.os.Build;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.lumi.singularity.ui.activities.MainActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class x6 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x6(ob0 ob0Var, nb0 nb0Var) {
        this.d = 9;
        this.e = ob0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22;
        boolean applySemantics$lambda$5;
        w01 detectDragGestures$lambda$3;
        w01 movableContentWithReceiverOf$lambda$0;
        Modifier selectionMagnifier$lambda$0;
        boolean applySemantics$lambda$52;
        MeasureResult textFieldLabelMinHeight$lambda$26;
        Modifier textFieldMagnifier$lambda$0;
        Modifier textFieldMinSize$lambda$0;
        w01 rememberTransformableState$lambda$0$0;
        int i = this.d;
        Object[] objArr = 0;
        w01 w01Var = w01.a;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22((BottomAppBarScrollBehavior) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22;
            case 1:
                un unVar = (un) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1057225081, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:824)");
                    }
                    kb.a("Android File Manager", "Launches the Android file manager", ComposableLambdaKt.rememberComposableLambda(-2058186133, true, new j9(unVar, objArr == true ? 1 : 0), composer, 54), composer, 438);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 2:
                ((mb0) obj4).invoke((Throwable) obj);
                return w01Var;
            case 3:
                applySemantics$lambda$5 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$5((CoreTextFieldSemanticsModifierNode) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
                return Boolean.valueOf(applySemantics$lambda$5);
            case 4:
                detectDragGestures$lambda$3 = DragGestureDetectorKt.detectDragGestures$lambda$3((ky) obj4, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
                return detectDragGestures$lambda$3;
            case 5:
                cq0 cq0Var = (cq0) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-831870992, intValue2, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1672)");
                    }
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m762padding3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                    uo.h(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composer2, i2).getBodyLarge();
                    FontWeight.Companion companion2 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk("⚠️ Exploit doesn't support this device", null, materialTheme.getColorScheme(composer2, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(bodyLarge, 0L, 0L, companion2.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 6, 0, 131066);
                    TextKt.m2607TextNvy7gAk("The exploit will NOT work on this headset", null, materialTheme.getColorScheme(composer2, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(materialTheme.getTypography(composer2, i2).getBodyMedium(), 0L, 0L, companion2.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 6, 0, 131066);
                    ((MainActivity) cq0Var).m();
                    TextKt.m2607TextNvy7gAk(uo.c("Headset: ", Build.PRODUCT), null, materialTheme.getColorScheme(composer2, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(materialTheme.getTypography(composer2, i2).getBodySmall(), 0L, 0L, companion2.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 131066);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            case 6:
                a11 a11Var = (a11) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1874471705, intValue3, -1, "com.lumi.singularity.ui.activities.UpdateDialog.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:2465)");
                    }
                    Modifier.Companion companion3 = Modifier.Companion;
                    Modifier m762padding3ABfNKs2 = PaddingKt.m762padding3ABfNKs(companion3, Dp.m7611constructorimpl(12.0f));
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m762padding3ABfNKs2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
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
                    uo.h(companion4, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion4, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk("What's new", PaddingKt.m766paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(6.0f), 7, null), materialTheme2.getColorScheme(composer3, i3).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i3).getLabelSmall(), composer3, 54, 0, 131064);
                    TextKt.m2607TextNvy7gAk(a11Var.b, ScrollKt.verticalScroll$default(SizeKt.m795heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, Dp.m7611constructorimpl(180.0f), 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i3).getBodySmall(), composer3, 0, 0, 131068);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return w01Var;
            case 7:
                t70 t70Var = (t70) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(88408421, intValue4, -1, "com.lumi.singularity.ui.activities.PayloadSelectorDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:2333)");
                    }
                    Modifier.Companion companion5 = Modifier.Companion;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(6.0f));
                    Alignment.Companion companion6 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m763paddingVpY3zN4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    iy constructor3 = companion7.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion7, m3878constructorimpl3, rowMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion7, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CheckboxKt.Checkbox(t70Var.c, t70Var.e, null, t70Var.d, null, null, composer4, 0, 52);
                    SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion5, Dp.m7611constructorimpl(4.0f)), composer4, 6);
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion5, 1.0f, false, 2, null);
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer4, 0);
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, weight$default);
                    iy constructor4 = companion7.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer4);
                    uo.h(companion7, m3878constructorimpl4, columnMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion7, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    String str = t70Var.a;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer4, i4).getBodyMedium(), composer4, 1572864, 0, 131006);
                    TextKt.m2607TextNvy7gAk(t70Var.b, null, materialTheme3.getColorScheme(composer4, i4).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer4, i4).getBodySmall(), composer4, 0, 0, 131066);
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return w01Var;
            case 8:
                movableContentWithReceiverOf$lambda$0 = MovableContentKt.movableContentWithReceiverOf$lambda$0((ny) obj4, obj, (Composer) obj2, ((Integer) obj3).intValue());
                return movableContentWithReceiverOf$lambda$0;
            case 9:
                ob0 ob0Var = (ob0) obj4;
                ob0.h.set(ob0Var, null);
                ob0Var.f(null);
                return w01Var;
            case 10:
                selectionMagnifier$lambda$0 = SelectionManager_androidKt.selectionMagnifier$lambda$0((SelectionManager) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return selectionMagnifier$lambda$0;
            case 11:
                ((vn0) obj4).b();
                return w01Var;
            case Matrix.TranslateX /* 12 */:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer5.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1083149086, intValue5, -1, "com.lumi.singularity.ui.activities.TerminalScreen.<anonymous>.<anonymous> (TerminalActivity.kt:121)");
                    }
                    Object rememberedValue = composer5.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new hm0(snapshotStateList, 9);
                        composer5.updateRememberedValue(rememberedValue);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, !snapshotStateList.isEmpty(), null, null, null, fl.b, composer5, 1572870, 58);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                applySemantics$lambda$52 = TextFieldDecoratorModifierNode.applySemantics$lambda$5((TextFieldDecoratorModifierNode) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
                return Boolean.valueOf(applySemantics$lambda$52);
            case Matrix.TranslateZ /* 14 */:
                textFieldLabelMinHeight$lambda$26 = TextFieldImplKt.textFieldLabelMinHeight$lambda$26((iy) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return textFieldLabelMinHeight$lambda$26;
            case 15:
                textFieldMagnifier$lambda$0 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0((TextFieldSelectionManager) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return textFieldMagnifier$lambda$0;
            case 16:
                textFieldMinSize$lambda$0 = TextFieldSizeKt.textFieldMinSize$lambda$0((TextStyle) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return textFieldMinSize$lambda$0;
            default:
                rememberTransformableState$lambda$0$0 = TransformableStateKt.rememberTransformableState$lambda$0$0((State) obj4, ((Float) obj).floatValue(), (Offset) obj2, ((Float) obj3).floatValue());
                return rememberTransformableState$lambda$0$0;
        }
    }

    public /* synthetic */ x6(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
