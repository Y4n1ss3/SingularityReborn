package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.g11;
import defpackage.iy;
import defpackage.ji0;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.s30;
import defpackage.w01;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailKt$WideNavigationRailLayout$1 implements my {
    final /* synthetic */ MutableIntState $actualMaxExpandedWidth$delegate;
    final /* synthetic */ Arrangement.Vertical $arrangement;
    final /* synthetic */ my $content;
    final /* synthetic */ MutableIntState $currentWidth$delegate;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ my $header;
    final /* synthetic */ State<Dp> $itemMinHeight$delegate;
    final /* synthetic */ State<Dp> $itemVerticalSpacedBy$delegate;
    final /* synthetic */ State<Dp> $minWidth$delegate;
    final /* synthetic */ float $minimumA11ySize;
    final /* synthetic */ State<Dp> $widthFullRange$delegate;
    final /* synthetic */ WindowInsets $windowInsets;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2, reason: invalid class name */
    public static final class AnonymousClass2 implements MeasurePolicy {
        final /* synthetic */ MutableIntState $actualMaxExpandedWidth$delegate;
        final /* synthetic */ Arrangement.Vertical $arrangement;
        final /* synthetic */ MutableIntState $currentWidth$delegate;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ my $header;
        final /* synthetic */ State<Dp> $itemMinHeight$delegate;
        final /* synthetic */ State<Dp> $itemVerticalSpacedBy$delegate;
        final /* synthetic */ State<Dp> $minWidth$delegate;
        final /* synthetic */ float $minimumA11ySize;
        final /* synthetic */ State<Dp> $widthFullRange$delegate;

        public AnonymousClass2(my myVar, boolean z, State<Dp> state, float f, State<Dp> state2, State<Dp> state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State<Dp> state4) {
            this.$header = myVar;
            this.$expanded = z;
            this.$minWidth$delegate = state;
            this.$minimumA11ySize = f;
            this.$itemMinHeight$delegate = state2;
            this.$widthFullRange$delegate = state3;
            this.$actualMaxExpandedWidth$delegate = mutableIntState;
            this.$currentWidth$delegate = mutableIntState2;
            this.$arrangement = vertical;
            this.$itemVerticalSpacedBy$delegate = state4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
            return w01.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 measure_3p2s80s$lambda$6(int i, MeasureScope measureScope, ji0 ji0Var, List list, Arrangement.Vertical vertical, State state, Placeable.PlacementScope placementScope) {
            float f;
            int i2;
            float WideNavigationRailLayout$lambda$10;
            float f2;
            f = WideNavigationRailKt.WNRVerticalPadding;
            int mo361roundToPx0680j_4 = i - measureScope.mo361roundToPx0680j_4(f);
            Object obj = ji0Var.d;
            if (obj == null || ((Placeable) obj).getHeight() <= 0) {
                i2 = 0;
            } else {
                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) ji0Var.d, 0, 0, 0.0f, 4, null);
                int height = ((Placeable) ji0Var.d).getHeight();
                f2 = WideNavigationRailKt.WNRHeaderPadding;
                i2 = measureScope.mo361roundToPx0680j_4(f2) + height;
            }
            if (list != null) {
                if (!q10.b(vertical, Arrangement.INSTANCE.getCenter())) {
                    mo361roundToPx0680j_4 -= i2;
                }
                int[] iArr = new int[list.size()];
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((Placeable) list.get(i3)).getHeight();
                    if (i3 < list.size() - 1) {
                        int i4 = iArr[i3];
                        WideNavigationRailLayout$lambda$10 = WideNavigationRailKt.WideNavigationRailLayout$lambda$10(state);
                        iArr[i3] = measureScope.mo361roundToPx0680j_4(WideNavigationRailLayout$lambda$10) + i4;
                    }
                }
                int[] iArr2 = new int[list.size()];
                vertical.arrange(measureScope, mo361roundToPx0680j_4, iArr, iArr2);
                if (vertical.equals(Arrangement.INSTANCE.getCenter())) {
                    i2 = 0;
                }
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i5), 0, iArr2[i5] + i2, 0.0f, 4, null);
                }
            }
            return w01.a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            int m7566getMinWidthimpl;
            int i;
            int i2;
            int i3;
            int intValue;
            float WideNavigationRailLayout$lambda$9;
            int intValue2;
            float WideNavigationRailLayout$lambda$92;
            float WideNavigationRailLayout$lambda$11;
            float f;
            float f2;
            float WideNavigationRailLayout$lambda$8;
            List<? extends Measurable> list2 = list;
            int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            int size = list2.size();
            int m7566getMinWidthimpl2 = Constraints.m7566getMinWidthimpl(j);
            if (Constraints.m7566getMinWidthimpl(j) == 0) {
                f2 = WideNavigationRailKt.ExpandedRailMinWidth;
                m7566getMinWidthimpl2 = measureScope.mo361roundToPx0680j_4(f2);
                int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
                if (m7566getMinWidthimpl2 > m7564getMaxWidthimpl) {
                    m7566getMinWidthimpl2 = m7564getMaxWidthimpl;
                }
                WideNavigationRailLayout$lambda$8 = WideNavigationRailKt.WideNavigationRailLayout$lambda$8(this.$minWidth$delegate);
                m7566getMinWidthimpl = measureScope.mo361roundToPx0680j_4(WideNavigationRailLayout$lambda$8);
                int m7564getMaxWidthimpl2 = Constraints.m7564getMaxWidthimpl(j);
                if (m7566getMinWidthimpl > m7564getMaxWidthimpl2) {
                    m7566getMinWidthimpl = m7564getMaxWidthimpl2;
                }
            } else {
                m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
            }
            if (size < 1) {
                return MeasureScope.layout$default(measureScope, m7566getMinWidthimpl, m7563getMaxHeightimpl, null, new g11(4), 4, null);
            }
            long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
            ji0 ji0Var = new ji0();
            if (this.$header != null) {
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Measurable measurable = list2.get(i4);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable), "header")) {
                        ji0Var.d = measurable.mo6234measureBRTryo0(m7554copyZbe2FdA$default);
                        if (size > 1) {
                            list2 = list2.subList(1, size);
                        }
                        size--;
                        i = ((Placeable) ji0Var.d).getHeight();
                    }
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i = 0;
            ArrayList arrayList = size > 0 ? new ArrayList() : null;
            int m7564getMaxWidthimpl3 = this.$expanded ? Constraints.m7564getMaxWidthimpl(m7554copyZbe2FdA$default) : m7566getMinWidthimpl;
            if (arrayList != null) {
                float f3 = this.$minimumA11ySize;
                boolean z = this.$expanded;
                State<Dp> state = this.$itemMinHeight$delegate;
                int i5 = i;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size3 = list2.size();
                i2 = m7563getMaxHeightimpl;
                int i6 = 0;
                i3 = 0;
                int i7 = i5;
                while (i6 < size3) {
                    List<? extends Measurable> list3 = list2;
                    Measurable measurable2 = list2.get(i6);
                    int i8 = size3;
                    long m7584offsetNN6EwU$default = ConstraintsKt.m7584offsetNN6EwU$default(m7554copyZbe2FdA$default, 0, -i7, 1, null);
                    int i9 = i6;
                    Constraints.Companion companion = Constraints.Companion;
                    boolean z2 = z;
                    int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(f3);
                    float f4 = f3;
                    WideNavigationRailLayout$lambda$11 = WideNavigationRailKt.WideNavigationRailLayout$lambda$11(state);
                    State<Dp> state2 = state;
                    Placeable mo6234measureBRTryo0 = measurable2.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7584offsetNN6EwU$default, companion.m7573fitPrioritizingWidthZbe2FdA(mo361roundToPx0680j_4, m7564getMaxWidthimpl3, measureScope.mo361roundToPx0680j_4(WideNavigationRailLayout$lambda$11), Constraints.m7563getMaxHeightimpl(m7554copyZbe2FdA$default))));
                    int measuredWidth = mo6234measureBRTryo0.getMeasuredWidth();
                    if (z2 && i3 < measuredWidth) {
                        f = WideNavigationRailKt.ItemHorizontalPadding;
                        i3 = measureScope.mo361roundToPx0680j_4(f) + measuredWidth;
                    }
                    i7 = mo6234measureBRTryo0.getHeight();
                    arrayList2.add(Boolean.valueOf(arrayList.add(mo6234measureBRTryo0)));
                    i6 = i9 + 1;
                    list2 = list3;
                    z = z2;
                    f3 = f4;
                    state = state2;
                    size3 = i8;
                }
            } else {
                i2 = m7563getMaxHeightimpl;
                i3 = 0;
            }
            if (this.$expanded) {
                Placeable placeable = (Placeable) ji0Var.d;
                int max = Math.max(i3, placeable != null ? placeable.getWidth() : 0);
                if (max > m7566getMinWidthimpl && max > m7566getMinWidthimpl2) {
                    int max2 = Math.max(max, m7566getMinWidthimpl2);
                    int m7564getMaxWidthimpl4 = Constraints.m7564getMaxWidthimpl(j);
                    if (max2 > m7564getMaxWidthimpl4) {
                        max2 = m7564getMaxWidthimpl4;
                    }
                    WideNavigationRailLayout$lambda$92 = WideNavigationRailKt.WideNavigationRailLayout$lambda$9(this.$widthFullRange$delegate);
                    int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(WideNavigationRailLayout$lambda$92);
                    m7566getMinWidthimpl = mo361roundToPx0680j_42 > max2 ? max2 : mo361roundToPx0680j_42;
                    this.$actualMaxExpandedWidth$delegate.setIntValue(m7566getMinWidthimpl);
                }
            } else {
                intValue = this.$actualMaxExpandedWidth$delegate.getIntValue();
                if (intValue > 0) {
                    WideNavigationRailLayout$lambda$9 = WideNavigationRailKt.WideNavigationRailLayout$lambda$9(this.$widthFullRange$delegate);
                    int mo361roundToPx0680j_43 = measureScope.mo361roundToPx0680j_4(WideNavigationRailLayout$lambda$9);
                    intValue2 = this.$currentWidth$delegate.getIntValue();
                    if (intValue2 < m7566getMinWidthimpl) {
                        intValue2 = m7566getMinWidthimpl;
                    }
                    m7566getMinWidthimpl = y80.h(mo361roundToPx0680j_43, m7566getMinWidthimpl, intValue2);
                }
            }
            int i10 = m7566getMinWidthimpl;
            this.$currentWidth$delegate.setIntValue(i10);
            int i11 = i2;
            return MeasureScope.layout$default(measureScope, i10, i11, null, new s30(i11, measureScope, ji0Var, arrayList, this.$arrangement, this.$itemVerticalSpacedBy$delegate), 4, null);
        }
    }

    public WideNavigationRailKt$WideNavigationRailLayout$1(WindowInsets windowInsets, my myVar, boolean z, State<Dp> state, float f, State<Dp> state2, State<Dp> state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State<Dp> state4, my myVar2) {
        this.$windowInsets = windowInsets;
        this.$header = myVar;
        this.$expanded = z;
        this.$minWidth$delegate = state;
        this.$minimumA11ySize = f;
        this.$itemMinHeight$delegate = state2;
        this.$widthFullRange$delegate = state3;
        this.$actualMaxExpandedWidth$delegate = mutableIntState;
        this.$currentWidth$delegate = mutableIntState2;
        this.$arrangement = vertical;
        this.$itemVerticalSpacedBy$delegate = state4;
        this.$content = myVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        float f;
        float f2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1489314345, i, -1, "androidx.compose.material3.WideNavigationRailLayout.<anonymous> (WideNavigationRail.kt:258)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), this.$windowInsets);
        f = WideNavigationRailKt.ExpandedRailMaxWidth;
        Modifier m814widthInVpY3zN4$default = SizeKt.m814widthInVpY3zN4$default(windowInsetsPadding, 0.0f, f, 1, null);
        f2 = WideNavigationRailKt.WNRVerticalPadding;
        Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m766paddingqDBjuR0$default(m814widthInVpY3zN4$default, 0.0f, f2, 0.0f, 0.0f, 13, null));
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(24);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(selectableGroup, false, (ky) rememberedValue, 1, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$header, this.$expanded, this.$minWidth$delegate, this.$minimumA11ySize, this.$itemMinHeight$delegate, this.$widthFullRange$delegate, this.$actualMaxExpandedWidth$delegate, this.$currentWidth$delegate, this.$arrangement, this.$itemVerticalSpacedBy$delegate);
        my myVar = this.$header;
        my myVar2 = this.$content;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        iy constructor = companion2.getConstructor();
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
        Updater.m3886setimpl(m3878constructorimpl, anonymousClass2, companion2.getSetMeasurePolicy());
        Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        my setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(setCompositeKeyHash, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
        if (myVar != null) {
            composer.startReplaceGroup(1714892004);
            Modifier layoutId = LayoutIdKt.layoutId(companion, "header");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, layoutId);
            iy constructor2 = companion2.getConstructor();
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
            my b = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar.invoke(composer, 0);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1714982338);
            composer.endReplaceGroup();
        }
        myVar2.invoke(composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
