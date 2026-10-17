package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import defpackage.hm;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.oq;
import defpackage.pq;
import defpackage.q10;
import defpackage.q6;
import defpackage.qo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultSingleRowTopAppBarOverride implements SingleRowTopAppBarOverride {
    public static final int $stable = 0;
    public static final DefaultSingleRowTopAppBarOverride INSTANCE = new DefaultSingleRowTopAppBarOverride();

    private DefaultSingleRowTopAppBarOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SingleRowTopAppBar$lambda$15$lambda$12$lambda$11(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SingleRowTopAppBar$lambda$15$lambda$14$lambda$13() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SingleRowTopAppBar$lambda$16(DefaultSingleRowTopAppBarOverride defaultSingleRowTopAppBarOverride, SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, int i, Composer composer, int i2) {
        defaultSingleRowTopAppBarOverride.SingleRowTopAppBar(singleRowTopAppBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final long SingleRowTopAppBar$lambda$2(State<Color> state) {
        return state.getValue().m4771unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SingleRowTopAppBar$lambda$4$lambda$3(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, float f) {
        TopAppBarState state = singleRowTopAppBarOverrideScope.getScrollBehavior().getState();
        state.setHeightOffset(state.getHeightOffset() + f);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SingleRowTopAppBar$lambda$7$lambda$6(State state, DrawScope drawScope) {
        long m4771unboximpl = ((Color) state.getValue()).m4771unboximpl();
        if (!Color.m4762equalsimpl0(m4771unboximpl, Color.Companion.m4797getUnspecified0d7_KjU())) {
            DrawScope.m5329drawRectnJ9OG0$default(drawScope, m4771unboximpl, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SingleRowTopAppBar$lambda$9$lambda$8(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    @Override // androidx.compose.material3.SingleRowTopAppBarOverride
    public void SingleRowTopAppBar(final SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, Composer composer, int i) {
        int i2;
        Modifier modifier;
        Modifier modifier2;
        Modifier adjustHeightOffsetLimit;
        Composer startRestartGroup = composer.startRestartGroup(2137486921);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(singleRowTopAppBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2137486921, i2, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2510)");
            }
            if (Float.isNaN(singleRowTopAppBarOverrideScope.m2390getExpandedHeightD9Ej5fM()) || (Float.floatToRawIntBits(singleRowTopAppBarOverrideScope.m2390getExpandedHeightD9Ej5fM()) & Integer.MAX_VALUE) >= 2139095040) {
                defpackage.o.m("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean changed = startRestartGroup.changed(singleRowTopAppBarOverrideScope.getColors()) | startRestartGroup.changed(singleRowTopAppBarOverrideScope.getScrollBehavior());
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new iy() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$targetColor$2$1
                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Color.m4751boximpl(m1919invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m1919invoke0d7_KjU() {
                        TopAppBarState state;
                        TopAppBarScrollBehavior scrollBehavior = SingleRowTopAppBarOverrideScope.this.getScrollBehavior();
                        return SingleRowTopAppBarOverrideScope.this.getColors().m2802containerColorvNxB06k$material3(((scrollBehavior == null || (state = scrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i4 = 6;
            State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(SingleRowTopAppBar$lambda$2((State) rememberedValue), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1658896622, true, new my() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1
                public final void invoke(Composer composer2, int i5) {
                    if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1658896622, i5, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2537)");
                    }
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    ny actions = SingleRowTopAppBarOverrideScope.this.getActions();
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 54);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
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
                    my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    actions.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                    composer2.endNode();
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
            if (singleRowTopAppBarOverrideScope.getScrollBehavior() == null || singleRowTopAppBarOverrideScope.getScrollBehavior().isPinned()) {
                startRestartGroup.startReplaceGroup(690108113);
                startRestartGroup.endReplaceGroup();
                modifier = Modifier.Companion;
                modifier2 = modifier;
            } else {
                startRestartGroup.startReplaceGroup(689467622);
                Modifier.Companion companion = Modifier.Companion;
                Orientation orientation = Orientation.Vertical;
                int i5 = i2 & 14;
                boolean z = i5 == 4;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new defpackage.h(singleRowTopAppBarOverrideScope, 15);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((ky) rememberedValue2, startRestartGroup, 0);
                boolean z2 = i5 == 4;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(singleRowTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                modifier = DraggableKt.draggable$default(companion, rememberDraggableState, orientation, false, null, false, null, (ny) rememberedValue3, false, 188, null);
                startRestartGroup.endReplaceGroup();
                modifier2 = companion;
            }
            Modifier then = singleRowTopAppBarOverrideScope.getModifier().then(modifier);
            boolean changed2 = startRestartGroup.changed(m100animateColorAsStateeuL9pac);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new oq(m100animateColorAsStateeuL9pac, i3);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Modifier drawBehind = DrawModifierKt.drawBehind(then, (ky) rememberedValue4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue5 == companion2.getEmpty()) {
                rememberedValue5 = new qo(i4);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (ky) rememberedValue5, 1, null);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion2.getEmpty()) {
                rememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$4$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                        return w01.a;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics$default, w01.a, (PointerInputEventHandler) rememberedValue6);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            adjustHeightOffsetLimit = AppBarKt.adjustHeightOffsetLimit(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(modifier2, singleRowTopAppBarOverrideScope.getWindowInsets())), singleRowTopAppBarOverrideScope.getScrollBehavior());
            boolean z3 = (i2 & 14) == 4;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue7 == companion2.getEmpty()) {
                rememberedValue7 = new pq(singleRowTopAppBarOverrideScope, i3);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            FloatProducer floatProducer = (FloatProducer) rememberedValue7;
            long m2806getNavigationIconContentColor0d7_KjU = singleRowTopAppBarOverrideScope.getColors().m2806getNavigationIconContentColor0d7_KjU();
            long m2809getTitleContentColor0d7_KjU = singleRowTopAppBarOverrideScope.getColors().m2809getTitleContentColor0d7_KjU();
            long m2804getActionIconContentColor0d7_KjU = singleRowTopAppBarOverrideScope.getColors().m2804getActionIconContentColor0d7_KjU();
            long m2808getSubtitleContentColor0d7_KjU = singleRowTopAppBarOverrideScope.getColors().m2808getSubtitleContentColor0d7_KjU();
            my title = singleRowTopAppBarOverrideScope.getTitle();
            TextStyle titleTextStyle = singleRowTopAppBarOverrideScope.getTitleTextStyle();
            my subtitle = singleRowTopAppBarOverrideScope.getSubtitle();
            TextStyle subtitleTextStyle = singleRowTopAppBarOverrideScope.getSubtitleTextStyle();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal titleHorizontalAlignment = singleRowTopAppBarOverrideScope.getTitleHorizontalAlignment();
            my navigationIcon = singleRowTopAppBarOverrideScope.getNavigationIcon();
            float m2390getExpandedHeightD9Ej5fM = singleRowTopAppBarOverrideScope.m2390getExpandedHeightD9Ej5fM();
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion2.getEmpty()) {
                rememberedValue8 = new defpackage.e1(20);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            AppBarKt.m1626TopAppBarLayoutlyUyIHI(adjustHeightOffsetLimit, floatProducer, m2806getNavigationIconContentColor0d7_KjU, m2809getTitleContentColor0d7_KjU, m2808getSubtitleContentColor0d7_KjU, m2804getActionIconContentColor0d7_KjU, title, titleTextStyle, subtitle, subtitleTextStyle, (iy) rememberedValue8, center, titleHorizontalAlignment, 0, false, navigationIcon, rememberComposableLambda, m2390getExpandedHeightD9Ej5fM, startRestartGroup, 0, 1600566);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, singleRowTopAppBarOverrideScope, i, 18));
        }
    }
}
