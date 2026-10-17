package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.k10;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.q10;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$2$4$2 implements ny {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ CalendarMonth $displayedMonth;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;
    final /* synthetic */ k10 $yearRange;

    public DatePickerKt$DatePickerContent$2$4$2(long j, MutableState<Boolean> mutableState, un unVar, LazyListState lazyListState, k10 k10Var, CalendarMonth calendarMonth, SelectableDates selectableDates, CalendarModel calendarModel, DatePickerColors datePickerColors) {
        this.$displayedMonthMillis = j;
        this.$yearPickerVisible$delegate = mutableState;
        this.$coroutineScope = unVar;
        this.$monthsListState = lazyListState;
        this.$yearRange = k10Var;
        this.$displayedMonth = calendarMonth;
        this.$selectableDates = selectableDates;
        this.$calendarModel = calendarModel;
        this.$colors = datePickerColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$4$lambda$3$lambda$2(un unVar, MutableState mutableState, LazyListState lazyListState, k10 k10Var, CalendarMonth calendarMonth, int i) {
        boolean DatePickerContent$lambda$26;
        DatePickerContent$lambda$26 = DatePickerKt.DatePickerContent$lambda$26(mutableState);
        DatePickerKt.DatePickerContent$lambda$27(mutableState, !DatePickerContent$lambda$26);
        p01.t(unVar, null, null, new DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(lazyListState, i, k10Var, calendarMonth, null), 3);
        return w01.a;
    }

    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193716082, i, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1632)");
        }
        Strings.Companion companion = Strings.Companion;
        int i2 = 0;
        String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_year_picker_pane_title), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changed = composer.changed(m2983getString2EP1pXo);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new s(m2983getString2EP1pXo, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion2, false, (ky) rememberedValue, 1, null);
        long j = this.$displayedMonthMillis;
        final MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        final un unVar = this.$coroutineScope;
        final LazyListState lazyListState = this.$monthsListState;
        final k10 k10Var = this.$yearRange;
        final CalendarMonth calendarMonth = this.$displayedMonth;
        SelectableDates selectableDates = this.$selectableDates;
        CalendarModel calendarModel = this.$calendarModel;
        DatePickerColors datePickerColors = this.$colors;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
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
        my b = k4.b(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(SizeKt.m796requiredHeight3ABfNKs(companion2, Dp.m7611constructorimpl(Dp.m7611constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 7.0f) - DividerDefaults.INSTANCE.m1932getThicknessD9Ej5fM())), DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
        boolean changed2 = composer.changed(mutableState) | composer.changedInstance(unVar) | composer.changed(lazyListState) | composer.changedInstance(k10Var) | composer.changed(calendarMonth);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            Object obj = new ky() { // from class: androidx.compose.material3.t
                @Override // defpackage.ky
                public final Object invoke(Object obj2) {
                    w01 invoke$lambda$4$lambda$3$lambda$2;
                    invoke$lambda$4$lambda$3$lambda$2 = DatePickerKt$DatePickerContent$2$4$2.invoke$lambda$4$lambda$3$lambda$2(un.this, mutableState, lazyListState, k10Var, calendarMonth, ((Integer) obj2).intValue());
                    return invoke$lambda$4$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        }
        DatePickerKt.YearPicker(m764paddingVpY3zN4$default, j, (ky) rememberedValue2, selectableDates, calendarModel, k10Var, datePickerColors, composer, 6);
        DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors.m1864getDividerColor0d7_KjU(), composer, 0, 3);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }
}
