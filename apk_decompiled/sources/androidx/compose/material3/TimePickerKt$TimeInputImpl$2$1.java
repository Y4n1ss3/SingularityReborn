package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.dq;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerKt$TimeInputImpl$2$1 implements my {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ Ref<Boolean> $userOverride;

    public TimePickerKt$TimeInputImpl$2$1(MutableState<TextFieldValue> mutableState, TimePickerState timePickerState, Ref<Boolean> ref, TimePickerColors timePickerColors, MutableState<TextFieldValue> mutableState2) {
        this.$hourValue$delegate = mutableState;
        this.$state = timePickerState;
        this.$userOverride = ref;
        this.$colors = timePickerColors;
        this.$minuteValue$delegate = mutableState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$11$lambda$10(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.mo1599setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$3$lambda$2(TimePickerState timePickerState, Ref ref, MutableState mutableState, TextFieldValue textFieldValue) {
        TextFieldValue TimeInputImpl$lambda$18;
        int m2677getHouryecRtBI = TimePickerSelectionMode.Companion.m2677getHouryecRtBI();
        TimeInputImpl$lambda$18 = TimePickerKt.TimeInputImpl$lambda$18(mutableState);
        TimePickerKt.m2658timeInputOnChange_K77t0(m2677getHouryecRtBI, timePickerState, textFieldValue, TimeInputImpl$lambda$18, timePickerState.is24hour() ? 23 : 12, ref, new r1(mutableState, 0));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$3$lambda$2$lambda$1(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$5$lambda$4(TimePickerState timePickerState, KeyboardActionScope keyboardActionScope) {
        timePickerState.mo1599setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$9$lambda$8(TimePickerState timePickerState, Ref ref, MutableState mutableState, TextFieldValue textFieldValue) {
        TextFieldValue TimeInputImpl$lambda$22;
        int m2678getMinuteyecRtBI = TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI();
        TimeInputImpl$lambda$22 = TimePickerKt.TimeInputImpl$lambda$22(mutableState);
        TimePickerKt.m2658timeInputOnChange_K77t0(m2678getMinuteyecRtBI, timePickerState, textFieldValue, TimeInputImpl$lambda$22, 59, ref, new r1(mutableState, 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$9$lambda$8$lambda$7(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        TextFieldValue TimeInputImpl$lambda$18;
        float f;
        TextFieldValue TimeInputImpl$lambda$22;
        final int i2 = 1;
        final int i3 = 0;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306700887, i, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1032)");
        }
        final MutableState<TextFieldValue> mutableState = this.$hourValue$delegate;
        final TimePickerState timePickerState = this.$state;
        final Ref<Boolean> ref = this.$userOverride;
        TimePickerColors timePickerColors = this.$colors;
        final MutableState<TextFieldValue> mutableState2 = this.$minuteValue$delegate;
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        boolean changed = composer.changed(mutableState) | composer.changedInstance(timePickerState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ky() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$1$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m2659invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m2659invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    TextFieldValue TimeInputImpl$lambda$182;
                    TextFieldValue TimeInputImpl$lambda$183;
                    int m5934getUtf16CodePointZmokQxo = KeyEvent_androidKt.m5934getUtf16CodePointZmokQxo(keyEvent);
                    if (48 <= m5934getUtf16CodePointZmokQxo && m5934getUtf16CodePointZmokQxo < 58) {
                        TimeInputImpl$lambda$182 = TimePickerKt.TimeInputImpl$lambda$18(mutableState);
                        if (TextRange.m7060getStartimpl(TimeInputImpl$lambda$182.m7310getSelectiond9O1mEE()) == 2) {
                            TimeInputImpl$lambda$183 = TimePickerKt.TimeInputImpl$lambda$18(mutableState);
                            if (TimeInputImpl$lambda$183.getText().length() == 2) {
                                TimePickerState.this.mo1599setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI());
                            }
                        }
                    }
                    return Boolean.FALSE;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (ky) rememberedValue);
        TimeInputImpl$lambda$18 = TimePickerKt.TimeInputImpl$lambda$18(mutableState);
        boolean changedInstance = composer.changedInstance(timePickerState) | composer.changed(mutableState) | composer.changedInstance(ref);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ky() { // from class: androidx.compose.material3.s1
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$12$lambda$3$lambda$2;
                    w01 invoke$lambda$12$lambda$9$lambda$8;
                    switch (i3) {
                        case 0:
                            invoke$lambda$12$lambda$3$lambda$2 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$3$lambda$2(timePickerState, ref, mutableState, (TextFieldValue) obj);
                            return invoke$lambda$12$lambda$3$lambda$2;
                        default:
                            invoke$lambda$12$lambda$9$lambda$8 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$9$lambda$8(timePickerState, ref, mutableState, (TextFieldValue) obj);
                            return invoke$lambda$12$lambda$9$lambda$8;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ky kyVar = (ky) rememberedValue2;
        TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.Companion;
        int m2677getHouryecRtBI = companion3.m2677getHouryecRtBI();
        ImeAction.Companion companion4 = ImeAction.Companion;
        int m7244getNexteUduSuo = companion4.m7244getNexteUduSuo();
        KeyboardType.Companion companion5 = KeyboardType.Companion;
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion5.m7298getNumberPjHm6EE(), m7244getNexteUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (dq) null);
        boolean changedInstance2 = composer.changedInstance(timePickerState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new ky() { // from class: androidx.compose.material3.t1
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$12$lambda$5$lambda$4;
                    w01 invoke$lambda$12$lambda$11$lambda$10;
                    int i4 = i3;
                    TimePickerState timePickerState2 = timePickerState;
                    KeyboardActionScope keyboardActionScope = (KeyboardActionScope) obj;
                    switch (i4) {
                        case 0:
                            invoke$lambda$12$lambda$5$lambda$4 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$5$lambda$4(timePickerState2, keyboardActionScope);
                            return invoke$lambda$12$lambda$5$lambda$4;
                        default:
                            invoke$lambda$12$lambda$11$lambda$10 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$11$lambda$10(timePickerState2, keyboardActionScope);
                            return invoke$lambda$12$lambda$11$lambda$10;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        TimePickerKt.m2648TimePickerTextField1vLObsk(onKeyEvent, TimeInputImpl$lambda$18, kyVar, timePickerState, m2677getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (ky) rememberedValue3, null, null, null, 59, null), timePickerColors, composer, 24576, 0);
        f = TimePickerKt.DisplaySeparatorWidth;
        TimePickerKt.DisplaySeparator(SizeKt.m809sizeVpY3zN4(companion, f, TimeInputTokens.INSTANCE.m3701getPeriodSelectorContainerHeightD9Ej5fM()), composer, 6);
        boolean changed2 = composer.changed(mutableState2) | composer.changedInstance(timePickerState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new ky() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2$1$1$4$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m2660invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Boolean m2660invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    boolean z;
                    TextFieldValue TimeInputImpl$lambda$222;
                    if (KeyEvent_androidKt.m5934getUtf16CodePointZmokQxo(keyEvent) == 0) {
                        TimeInputImpl$lambda$222 = TimePickerKt.TimeInputImpl$lambda$22(mutableState2);
                        if (TextRange.m7060getStartimpl(TimeInputImpl$lambda$222.m7310getSelectiond9O1mEE()) == 0) {
                            z = true;
                            if (z) {
                                TimePickerState.this.mo1599setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2677getHouryecRtBI());
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    return Boolean.valueOf(z);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion, (ky) rememberedValue4);
        TimeInputImpl$lambda$22 = TimePickerKt.TimeInputImpl$lambda$22(mutableState2);
        boolean changedInstance3 = composer.changedInstance(timePickerState) | composer.changed(mutableState2) | composer.changedInstance(ref);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = new ky() { // from class: androidx.compose.material3.s1
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$12$lambda$3$lambda$2;
                    w01 invoke$lambda$12$lambda$9$lambda$8;
                    switch (i2) {
                        case 0:
                            invoke$lambda$12$lambda$3$lambda$2 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$3$lambda$2(timePickerState, ref, mutableState2, (TextFieldValue) obj);
                            return invoke$lambda$12$lambda$3$lambda$2;
                        default:
                            invoke$lambda$12$lambda$9$lambda$8 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$9$lambda$8(timePickerState, ref, mutableState2, (TextFieldValue) obj);
                            return invoke$lambda$12$lambda$9$lambda$8;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        ky kyVar2 = (ky) rememberedValue5;
        int m2678getMinuteyecRtBI = companion3.m2678getMinuteyecRtBI();
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion5.m7298getNumberPjHm6EE(), companion4.m7242getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (dq) null);
        boolean changedInstance4 = composer.changedInstance(timePickerState);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new ky() { // from class: androidx.compose.material3.t1
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$12$lambda$5$lambda$4;
                    w01 invoke$lambda$12$lambda$11$lambda$10;
                    int i4 = i2;
                    TimePickerState timePickerState2 = timePickerState;
                    KeyboardActionScope keyboardActionScope = (KeyboardActionScope) obj;
                    switch (i4) {
                        case 0:
                            invoke$lambda$12$lambda$5$lambda$4 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$5$lambda$4(timePickerState2, keyboardActionScope);
                            return invoke$lambda$12$lambda$5$lambda$4;
                        default:
                            invoke$lambda$12$lambda$11$lambda$10 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$11$lambda$10(timePickerState2, keyboardActionScope);
                            return invoke$lambda$12$lambda$11$lambda$10;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        TimePickerKt.m2648TimePickerTextField1vLObsk(onPreviewKeyEvent, TimeInputImpl$lambda$22, kyVar2, timePickerState, m2678getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (ky) rememberedValue6, null, null, null, 59, null), timePickerColors, composer, 24576, 0);
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
