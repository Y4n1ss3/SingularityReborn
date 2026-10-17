package defpackage;

import android.os.Build;
import android.text.Spannable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1;
import androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.lumi.singularity.ui.activities.MainActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xl implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xl(ky kyVar, iy iyVar) {
        this.d = 4;
        this.f = iyVar;
        this.e = kyVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 ContextMenuColumnBuilder$lambda$0;
        Modifier indication$lambda$1;
        w01 SearchBarImpl_j1jLAyQ$lambda$35$lambda$34;
        Modifier animatedSelectionMagnifier$lambda$0;
        w01 fontAttributes$lambda$2;
        MeasureResult tabIndicatorLayout$lambda$0;
        MeasureResult tabIndicatorLayout$lambda$02;
        Modifier tapPressTextFieldModifier$lambda$0;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ContextMenuColumnBuilder$lambda$0 = ContextMenuUiKt.ContextMenuColumnBuilder$lambda$0((ky) obj5, (ContextMenuColors) obj4, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return ContextMenuColumnBuilder$lambda$0;
            case 1:
                indication$lambda$1 = IndicationKt.indication$lambda$1((Indication) obj5, (InteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return indication$lambda$1;
            case 2:
                MutableState mutableState = (MutableState) obj5;
                cq0 cq0Var = (cq0) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-973485026, intValue, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1560)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(14.0f)), 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(6.0f)), centerHorizontally, composer, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                    Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(56.0f)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(((Boolean) mutableState.getValue()).booleanValue() ? 4293587934L : 4294634727L), null, 2, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m227backgroundbw27NRU$default);
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
                    uo.h(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    IconKt.m2055Iconww6aTOc(((Boolean) mutableState.getValue()).booleanValue() ? CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()) : WarningKt.getWarning(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(28.0f)), ColorKt.Color(((Boolean) mutableState.getValue()).booleanValue() ? 4282084625L : 4288232477L), composer, 432, 0);
                    composer.endNode();
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
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
                    String str = ((Boolean) mutableState.getValue()).booleanValue() ? "Root access granted" : "Not rooted";
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodyLarge(), composer, 1572864, 0, 131006);
                    ((MainActivity) cq0Var).m();
                    String str2 = Build.PRODUCT;
                    switch (str2.hashCode()) {
                        case -1291874439:
                            if (str2.equals("eureka")) {
                                str2 = "Quest 3 · eureka";
                                break;
                            }
                            break;
                        case -796628930:
                            if (str2.equals("panther")) {
                                str2 = "Quest 3S · panther";
                                break;
                            }
                            break;
                        case 875062001:
                            if (str2.equals("seacliff")) {
                                str2 = "Quest Pro · seacliff";
                                break;
                            }
                            break;
                        case 1455215167:
                            if (str2.equals("hollywood")) {
                                str2 = "Quest 2 · hollywood";
                                break;
                            }
                            break;
                        case 1551834924:
                            if (str2.equals("vr_monterey")) {
                                str2 = "Quest 1 · monterey";
                                break;
                            }
                            break;
                        case 1682273737:
                            if (str2.equals("xse_panther")) {
                                str2 = "Quest 3S · panther xbox";
                                break;
                            }
                            break;
                    }
                    TextKt.m2607TextNvy7gAk(str2, null, materialTheme.getColorScheme(composer, i2).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodyMedium(), composer, 0, 0, 131066);
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 3:
                SearchBarImpl_j1jLAyQ$lambda$35$lambda$34 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$35$lambda$34((Density) obj5, (Animatable) obj4, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                return SearchBarImpl_j1jLAyQ$lambda$35$lambda$34;
            case 4:
                animatedSelectionMagnifier$lambda$0 = SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0((iy) obj4, (ky) obj5, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return animatedSelectionMagnifier$lambda$0;
            case 5:
                fontAttributes$lambda$2 = SpannableExtensions_androidKt.setFontAttributes$lambda$2((Spannable) obj5, (oy) obj4, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return fontAttributes$lambda$2;
            case 6:
                tabIndicatorLayout$lambda$0 = TabRowKt$ScrollableTabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0((oy) obj5, (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return tabIndicatorLayout$lambda$0;
            case 7:
                tabIndicatorLayout$lambda$02 = TabRowKt$TabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0((oy) obj5, (TabRowKt$TabRowImpl$1$scope$1$1) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return tabIndicatorLayout$lambda$02;
            case 8:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj5;
                LazyListState lazyListState = (LazyListState) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2103819284, intValue2, -1, "com.lumi.singularity.ui.activities.TerminalScreen.<anonymous>.<anonymous>.<anonymous> (TerminalActivity.kt:165)");
                    }
                    if (snapshotStateList.isEmpty()) {
                        composer2.startReplaceGroup(-1577406198);
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                        iy constructor4 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer2);
                        uo.h(companion4, m3878constructorimpl4, maybeCachedBoxMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion4, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        TextKt.m2607TextNvy7gAk("No output yet — run a command below", null, ColorKt.Color(4285231744L), null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 390, 0, 130938);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1576944453);
                        Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f));
                        Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new mb0(snapshotStateList, 28);
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        LazyDslKt.LazyColumn(m762padding3ABfNKs, lazyListState, null, false, null, null, null, false, null, (ky) rememberedValue, composer2, 805306374, 508);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            default:
                tapPressTextFieldModifier$lambda$0 = TextFieldPressGestureFilterKt.tapPressTextFieldModifier$lambda$0((ky) obj5, (MutableInteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return tapPressTextFieldModifier$lambda$0;
        }
    }

    public /* synthetic */ xl(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }
}
