package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.g7;
import defpackage.hm;
import defpackage.i2;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.pq;
import defpackage.q10;
import defpackage.q6;
import defpackage.qo;
import defpackage.uq;
import defpackage.vq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultTwoRowsTopAppBarOverride implements TwoRowsTopAppBarOverride {
    public static final int $stable = 0;
    public static final DefaultTwoRowsTopAppBarOverride INSTANCE = new DefaultTwoRowsTopAppBarOverride();

    private DefaultTwoRowsTopAppBarOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$10$lambda$9(iy iyVar) {
        return 1.0f - ((Number) iyVar.invoke()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TwoRowsTopAppBar$lambda$12$lambda$11(iy iyVar) {
        return ((Number) iyVar.invoke()).floatValue() < 0.5f;
    }

    private static final boolean TwoRowsTopAppBar$lambda$13(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TwoRowsTopAppBar$lambda$15$lambda$14(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, float f) {
        TopAppBarState state = twoRowsTopAppBarOverrideScope.getScrollBehavior().getState();
        state.setHeightOffset(state.getHeightOffset() + f);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TwoRowsTopAppBar$lambda$18$lambda$17(iy iyVar, DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, ((Color) iyVar.invoke()).m4771unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TwoRowsTopAppBar$lambda$20$lambda$19(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = twoRowsTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TwoRowsTopAppBar$lambda$28(DefaultTwoRowsTopAppBarOverride defaultTwoRowsTopAppBarOverride, TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, int i, Composer composer, int i2) {
        defaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar(twoRowsTopAppBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$5$lambda$4(TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = twoRowsTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getCollapsedFraction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TwoRowsTopAppBar$lambda$8$lambda$7(iy iyVar) {
        return AppBarKt.getTopTitleAlphaEasing().transform(((Number) iyVar.invoke()).floatValue());
    }

    @Override // androidx.compose.material3.TwoRowsTopAppBarOverride
    public void TwoRowsTopAppBar(final TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, Composer composer, int i) {
        int i2;
        TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope2;
        Composer composer2;
        Modifier modifier;
        Modifier modifier2;
        Modifier adjustHeightOffsetLimit;
        Composer startRestartGroup = composer.startRestartGroup(-1640665680);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changed(twoRowsTopAppBarOverrideScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = 1;
        int i5 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640665680, i2, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar (AppBar.kt:2732)");
            }
            if (Float.isNaN(twoRowsTopAppBarOverrideScope.m2830getCollapsedHeightD9Ej5fM()) || (Float.floatToRawIntBits(twoRowsTopAppBarOverrideScope.m2830getCollapsedHeightD9Ej5fM()) & Integer.MAX_VALUE) >= 2139095040) {
                defpackage.o.m("The collapsedHeight is expected to be specified and finite");
                return;
            }
            if (Float.isNaN(twoRowsTopAppBarOverrideScope.m2831getExpandedHeightD9Ej5fM()) || (Float.floatToRawIntBits(twoRowsTopAppBarOverrideScope.m2831getExpandedHeightD9Ej5fM()) & Integer.MAX_VALUE) >= 2139095040) {
                defpackage.o.m("The expandedHeight is expected to be specified and finite");
                return;
            }
            if (Dp.m7610compareTo0680j_4(twoRowsTopAppBarOverrideScope.m2831getExpandedHeightD9Ej5fM(), twoRowsTopAppBarOverrideScope.m2830getCollapsedHeightD9Ej5fM()) < 0) {
                defpackage.o.m("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                return;
            }
            int mo361roundToPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(twoRowsTopAppBarOverrideScope.m2832getTitleBottomPaddingD9Ej5fM());
            int i6 = i2 & 14;
            boolean z = i6 == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new i2(twoRowsTopAppBarOverrideScope, 13);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final iy iyVar = (iy) rememberedValue;
            boolean changed = (i6 == 4) | startRestartGroup.changed(iyVar);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new iy() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarContainerColor$1$1
                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Color.m4751boximpl(m1921invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m1921invoke0d7_KjU() {
                        return TwoRowsTopAppBarOverrideScope.this.getColors().m2802containerColorvNxB06k$material3(((Number) iyVar.invoke()).floatValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            iy iyVar2 = (iy) rememberedValue2;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1333673671, true, new my() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$actionsRow$1
                public final void invoke(Composer composer3, int i7) {
                    if (!composer3.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1333673671, i7, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2755)");
                    }
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    ny actions = TwoRowsTopAppBarOverrideScope.this.getActions();
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
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
                    my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    actions.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54);
            boolean changed2 = startRestartGroup.changed(iyVar);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new uq(i5, iyVar);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            iy iyVar3 = (iy) rememberedValue3;
            boolean changed3 = startRestartGroup.changed(iyVar);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new uq(i4, iyVar);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            iy iyVar4 = (iy) rememberedValue4;
            boolean changed4 = startRestartGroup.changed(iyVar);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.derivedStateOf(new uq(i3, iyVar));
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            State state = (State) rememberedValue5;
            boolean z2 = !TwoRowsTopAppBar$lambda$13(state);
            if (twoRowsTopAppBarOverrideScope.getScrollBehavior() == null || twoRowsTopAppBarOverrideScope.getScrollBehavior().isPinned()) {
                startRestartGroup.startReplaceGroup(-340499894);
                startRestartGroup.endReplaceGroup();
                modifier = Modifier.Companion;
                modifier2 = modifier;
            } else {
                startRestartGroup.startReplaceGroup(-341140385);
                Modifier.Companion companion = Modifier.Companion;
                Orientation orientation = Orientation.Vertical;
                boolean z3 = i6 == 4;
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue6 == Composer.Companion.getEmpty()) {
                    rememberedValue6 = new defpackage.h(twoRowsTopAppBarOverrideScope, 16);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((ky) rememberedValue6, startRestartGroup, 0);
                boolean z4 = i6 == 4;
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue7 == Composer.Companion.getEmpty()) {
                    rememberedValue7 = new DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(twoRowsTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                modifier = DraggableKt.draggable$default(companion, rememberDraggableState, orientation, false, null, false, null, (ny) rememberedValue7, false, 188, null);
                startRestartGroup.endReplaceGroup();
                modifier2 = companion;
            }
            Modifier then = twoRowsTopAppBarOverrideScope.getModifier().then(modifier);
            boolean changed5 = startRestartGroup.changed(iyVar2);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue8 == Composer.Companion.getEmpty()) {
                rememberedValue8 = new g7(i3, iyVar2);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            Modifier drawBehind = DrawModifierKt.drawBehind(then, (ky) rememberedValue8);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue9 == companion2.getEmpty()) {
                rememberedValue9 = new qo(7);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (ky) rememberedValue9, 1, null);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == companion2.getEmpty()) {
                rememberedValue10 = new PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$6$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                        return w01.a;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics$default, w01.a, (PointerInputEventHandler) rememberedValue10);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            iy constructor = companion4.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
            iy constructor2 = companion4.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
            my b2 = k4.b(companion4, m3878constructorimpl2, columnMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(modifier2, twoRowsTopAppBarOverrideScope.getWindowInsets()));
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == companion2.getEmpty()) {
                rememberedValue11 = new vq(i5);
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            AppBarKt.m1626TopAppBarLayoutlyUyIHI(clipToBounds, (FloatProducer) rememberedValue11, twoRowsTopAppBarOverrideScope.getColors().m2806getNavigationIconContentColor0d7_KjU(), twoRowsTopAppBarOverrideScope.getColors().m2809getTitleContentColor0d7_KjU(), twoRowsTopAppBarOverrideScope.getColors().m2808getSubtitleContentColor0d7_KjU(), twoRowsTopAppBarOverrideScope.getColors().m2804getActionIconContentColor0d7_KjU(), twoRowsTopAppBarOverrideScope.getSmallTitle(), twoRowsTopAppBarOverrideScope.getSmallTitleTextStyle(), twoRowsTopAppBarOverrideScope.getSmallSubtitle(), twoRowsTopAppBarOverrideScope.getSmallSubtitleTextStyle(), iyVar3, arrangement.getCenter(), twoRowsTopAppBarOverrideScope.getTitleHorizontalAlignment(), 0, TwoRowsTopAppBar$lambda$13(state), twoRowsTopAppBarOverrideScope.getNavigationIcon(), rememberComposableLambda, twoRowsTopAppBarOverrideScope.m2830getCollapsedHeightD9Ej5fM(), startRestartGroup, 0, 1575984);
            adjustHeightOffsetLimit = AppBarKt.adjustHeightOffsetLimit(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(modifier2, WindowInsetsKt.m833onlybOOhFvg(twoRowsTopAppBarOverrideScope.getWindowInsets(), WindowInsetsSides.Companion.m855getHorizontalJoeWqyM()))), twoRowsTopAppBarOverrideScope.getScrollBehavior());
            boolean z5 = i6 == 4;
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue12 == companion2.getEmpty()) {
                twoRowsTopAppBarOverrideScope2 = twoRowsTopAppBarOverrideScope;
                rememberedValue12 = new pq(twoRowsTopAppBarOverrideScope2, 1);
                startRestartGroup.updateRememberedValue(rememberedValue12);
            } else {
                twoRowsTopAppBarOverrideScope2 = twoRowsTopAppBarOverrideScope;
            }
            FloatProducer floatProducer = (FloatProducer) rememberedValue12;
            long m2806getNavigationIconContentColor0d7_KjU = twoRowsTopAppBarOverrideScope2.getColors().m2806getNavigationIconContentColor0d7_KjU();
            long m2809getTitleContentColor0d7_KjU = twoRowsTopAppBarOverrideScope2.getColors().m2809getTitleContentColor0d7_KjU();
            long m2804getActionIconContentColor0d7_KjU = twoRowsTopAppBarOverrideScope2.getColors().m2804getActionIconContentColor0d7_KjU();
            long m2808getSubtitleContentColor0d7_KjU = twoRowsTopAppBarOverrideScope2.getColors().m2808getSubtitleContentColor0d7_KjU();
            my title = twoRowsTopAppBarOverrideScope2.getTitle();
            TextStyle titleTextStyle = twoRowsTopAppBarOverrideScope2.getTitleTextStyle();
            my subtitle = twoRowsTopAppBarOverrideScope2.getSubtitle();
            TextStyle subtitleTextStyle = twoRowsTopAppBarOverrideScope2.getSubtitleTextStyle();
            Arrangement.Vertical bottom = arrangement.getBottom();
            Alignment.Horizontal titleHorizontalAlignment = twoRowsTopAppBarOverrideScope2.getTitleHorizontalAlignment();
            float m7611constructorimpl = Dp.m7611constructorimpl(twoRowsTopAppBarOverrideScope2.m2831getExpandedHeightD9Ej5fM() - twoRowsTopAppBarOverrideScope2.m2830getCollapsedHeightD9Ej5fM());
            ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
            composer2 = startRestartGroup;
            AppBarKt.m1626TopAppBarLayoutlyUyIHI(adjustHeightOffsetLimit, floatProducer, m2806getNavigationIconContentColor0d7_KjU, m2809getTitleContentColor0d7_KjU, m2808getSubtitleContentColor0d7_KjU, m2804getActionIconContentColor0d7_KjU, title, titleTextStyle, subtitle, subtitleTextStyle, iyVar4, bottom, titleHorizontalAlignment, mo361roundToPx0680j_4, z2, composableSingletons$AppBarKt.m1821getLambda$2101264077$material3(), composableSingletons$AppBarKt.getLambda$37575796$material3(), m7611constructorimpl, composer2, 0, 1769520);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            twoRowsTopAppBarOverrideScope2 = twoRowsTopAppBarOverrideScope;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, twoRowsTopAppBarOverrideScope2, i, 20));
        }
    }
}
