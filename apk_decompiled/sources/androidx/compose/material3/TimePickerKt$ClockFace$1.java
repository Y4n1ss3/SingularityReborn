package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.e10;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerKt$ClockFace$1 implements ny {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ AnalogTimePickerState $state;

    public TimePickerKt$ClockFace$1(TimePickerColors timePickerColors, AnalogTimePickerState analogTimePickerState, boolean z) {
        this.$colors = timePickerColors;
        this.$state = analogTimePickerState;
        this.$autoSwitchToMinute = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        return w01.a;
    }

    public final void invoke(final e10 e10Var, Composer composer, int i) {
        float f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(747010833, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1609)");
        }
        Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(Modifier.Companion, TimePickerTokens.INSTANCE.m3707getClockDialContainerSizeD9Ej5fM());
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(22);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(m807size3ABfNKs, false, (ky) rememberedValue, 1, null);
        f = TimePickerKt.OuterCircleToSizeRatio;
        final TimePickerColors timePickerColors = this.$colors;
        final AnalogTimePickerState analogTimePickerState = this.$state;
        final boolean z = this.$autoSwitchToMinute;
        TimePickerKt.CircularLayout(semantics$default, f, ComposableLambdaKt.rememberComposableLambda(-99063847, true, new my() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.2
            public final void invoke(Composer composer2, int i2) {
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-99063847, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1613)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(TimePickerColors.this.m2611clockDialContentColorvNxB06k$material3(false))), ComposableLambdaKt.rememberComposableLambda(-596940007, true, new AnonymousClass1(e10Var, analogTimePickerState, z), composer2, 54), composer2, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 implements my {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ e10 $screen;
                final /* synthetic */ AnalogTimePickerState $state;

                public AnonymousClass1(e10 e10Var, AnalogTimePickerState analogTimePickerState, boolean z) {
                    this.$screen = e10Var;
                    this.$state = analogTimePickerState;
                    this.$autoSwitchToMinute = z;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final w01 invoke$lambda$2$lambda$1$lambda$0(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i + 1.0f);
                    return w01.a;
                }

                public final void invoke(Composer composer, int i) {
                    float f;
                    int i2 = 0;
                    if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596940007, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1616)");
                    }
                    composer.startReplaceGroup(1866272144);
                    e10 e10Var = this.$screen;
                    int i3 = e10Var.b;
                    AnalogTimePickerState analogTimePickerState = this.$state;
                    boolean z = this.$autoSwitchToMinute;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int b = (!analogTimePickerState.is24hour() || TimePickerSelectionMode.m2673equalsimpl0(analogTimePickerState.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI())) ? e10Var.b(i4) : e10Var.b(i4) % 12;
                        Modifier.Companion companion = Modifier.Companion;
                        boolean changed = composer.changed(i4);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new p1(i4, i2);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null), analogTimePickerState, b, z, composer, 0);
                    }
                    composer.endReplaceGroup();
                    if (TimePickerSelectionMode.m2673equalsimpl0(this.$state.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI()) && this.$state.is24hour()) {
                        composer.startReplaceGroup(2020585964);
                        Modifier m226backgroundbw27NRU = BackgroundKt.m226backgroundbw27NRU(SizeKt.m807size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3707getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4796getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                        f = TimePickerKt.InnerCircleToSizeRatio;
                        TimePickerKt.CircularLayout(m226backgroundbw27NRU, f, ComposableLambdaKt.rememberComposableLambda(-1385767514, true, new C00212(this.$state, this.$autoSwitchToMinute), composer, 54), composer, 432, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(2021505641);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2, reason: invalid class name and collision with other inner class name */
                public static final class C00212 implements my {
                    final /* synthetic */ boolean $autoSwitchToMinute;
                    final /* synthetic */ AnalogTimePickerState $state;

                    public C00212(AnalogTimePickerState analogTimePickerState, boolean z) {
                        this.$state = analogTimePickerState;
                        this.$autoSwitchToMinute = z;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final w01 invoke$lambda$2$lambda$1$lambda$0(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12.0f + i);
                        return w01.a;
                    }

                    public final void invoke(Composer composer, int i) {
                        e10 e10Var;
                        e10 e10Var2;
                        int i2 = 1;
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1385767514, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1639)");
                        }
                        e10Var = TimePickerKt.ExtraHours;
                        int i3 = e10Var.b;
                        AnalogTimePickerState analogTimePickerState = this.$state;
                        boolean z = this.$autoSwitchToMinute;
                        for (int i4 = 0; i4 < i3; i4++) {
                            e10Var2 = TimePickerKt.ExtraHours;
                            int b = e10Var2.b(i4);
                            Modifier.Companion companion = Modifier.Companion;
                            boolean changed = composer.changed(i4);
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new p1(i4, i2);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null), analogTimePickerState, b, z, composer, 0);
                        }
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

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }
        }, composer, 54), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((e10) obj, (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }
}
