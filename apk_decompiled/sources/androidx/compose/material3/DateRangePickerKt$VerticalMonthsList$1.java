package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.iy;
import defpackage.k10;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.oy;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangePickerKt$VerticalMonthsList$1 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ my $onDatesSelectionChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedEndDateMillis;
    final /* synthetic */ Long $selectedStartDateMillis;
    final /* synthetic */ CalendarDate $today;
    final /* synthetic */ k10 $yearRange;

    public DateRangePickerKt$VerticalMonthsList$1(Long l, Long l2, my myVar, LazyListState lazyListState, k10 k10Var, CalendarModel calendarModel, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, CalendarDate calendarDate, SelectableDates selectableDates) {
        this.$selectedStartDateMillis = l;
        this.$selectedEndDateMillis = l2;
        this.$onDatesSelectionChange = myVar;
        this.$lazyListState = lazyListState;
        this.$yearRange = k10Var;
        this.$calendarModel = calendarModel;
        this.$firstMonth = calendarMonth;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$today = calendarDate;
        this.$selectableDates = selectableDates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(Long l, Long l2, my myVar, long j) {
        DateRangePickerKt.updateDateSelection(j, l, l2, myVar);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$5$lambda$4(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new w(2), new w(3), false, 4, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$5$lambda$4$lambda$2() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$5$lambda$4$lambda$3() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$7$lambda$6(k10 k10Var, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final Long l, final Long l2, final ky kyVar, final CalendarDate calendarDate, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final List list, LazyListScope lazyListScope) {
        LazyListScope.items$default(lazyListScope, DatePickerKt.numberOfMonthsInRange(k10Var), null, null, ComposableLambdaKt.composableLambdaInstance(682334170, true, new oy() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
            
                if (defpackage.q10.b(r0.rememberedValue(), java.lang.Integer.valueOf(r4)) == false) goto L39;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ky kyVar2;
                SelectedRangeInfo selectedRangeInfo;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(682334170, i3, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
                }
                CalendarMonth plusMonths = CalendarModel.this.plusMonths(calendarMonth, i);
                Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
                Long l3 = l;
                Long l4 = l2;
                ky kyVar3 = kyVar;
                CalendarDate calendarDate2 = calendarDate;
                DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                SelectableDates selectableDates2 = selectableDates;
                DatePickerColors datePickerColors2 = datePickerColors;
                CalendarModel calendarModel2 = CalendarModel.this;
                List<CustomAccessibilityAction> list2 = list;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillParentMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
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
                my b = k4.b(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting()) {
                    kyVar2 = kyVar3;
                } else {
                    kyVar2 = kyVar3;
                }
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer, 6), ComposableLambdaKt.rememberComposableLambda(-577031469, true, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(datePickerFormatter2, plusMonths, calendarModel2, list2, datePickerColors2), composer, 54), composer, 48);
                if (l3 == null || l4 == null) {
                    composer.startReplaceGroup(186488258);
                    composer.endReplaceGroup();
                    selectedRangeInfo = null;
                } else {
                    composer.startReplaceGroup(185956701);
                    boolean changed = composer.changed(l3) | composer.changed(l4);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = SelectedRangeInfo.Companion.calculateRangeInfo(plusMonths, calendarModel2.getCanonicalDate(l3.longValue()), calendarModel2.getCanonicalDate(l4.longValue()));
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    selectedRangeInfo = (SelectedRangeInfo) rememberedValue;
                }
                DatePickerKt.Month(plusMonths, kyVar2, calendarDate2.getUtcTimeMillis(), l3, l4, selectedRangeInfo, datePickerFormatter2, selectableDates2, datePickerColors2, calendarModel2.getLocale(), composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.oy
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return w01.a;
            }
        }), 6, null);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        final List customScrollActions;
        int i2 = 1;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1090773432, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        un unVar = (un) rememberedValue;
        Strings.Companion companion2 = Strings.Companion;
        String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer, 0);
        String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer, 0);
        boolean changed = composer.changed(this.$selectedStartDateMillis) | composer.changed(this.$selectedEndDateMillis) | composer.changed(this.$onDatesSelectionChange);
        Long l = this.$selectedStartDateMillis;
        Long l2 = this.$selectedEndDateMillis;
        my myVar = this.$onDatesSelectionChange;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new e(l, l2, myVar, i2);
            composer.updateRememberedValue(rememberedValue2);
        }
        final ky kyVar = (ky) rememberedValue2;
        customScrollActions = DateRangePickerKt.customScrollActions(this.$lazyListState, unVar, m2983getString2EP1pXo, m2983getString2EP1pXo2);
        Modifier.Companion companion3 = Modifier.Companion;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new d(8);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion3, false, (ky) rememberedValue3, 1, null);
        LazyListState lazyListState = this.$lazyListState;
        boolean changedInstance = composer.changedInstance(this.$yearRange) | composer.changedInstance(this.$calendarModel) | composer.changed(this.$firstMonth) | composer.changedInstance(this.$dateFormatter) | composer.changedInstance(customScrollActions) | composer.changed(this.$colors) | composer.changed(this.$selectedStartDateMillis) | composer.changed(this.$selectedEndDateMillis) | composer.changed(kyVar) | composer.changed(this.$today) | composer.changed(this.$selectableDates);
        final k10 k10Var = this.$yearRange;
        final CalendarModel calendarModel = this.$calendarModel;
        final CalendarMonth calendarMonth = this.$firstMonth;
        final Long l3 = this.$selectedStartDateMillis;
        final Long l4 = this.$selectedEndDateMillis;
        final CalendarDate calendarDate = this.$today;
        final DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        final SelectableDates selectableDates = this.$selectableDates;
        final DatePickerColors datePickerColors = this.$colors;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            Object obj = new ky() { // from class: androidx.compose.material3.a0
                @Override // defpackage.ky
                public final Object invoke(Object obj2) {
                    w01 invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = DateRangePickerKt$VerticalMonthsList$1.invoke$lambda$7$lambda$6(k10.this, calendarModel, calendarMonth, l3, l4, kyVar, calendarDate, datePickerFormatter, selectableDates, datePickerColors, customScrollActions, (LazyListScope) obj2);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue4 = obj;
        }
        LazyDslKt.LazyColumn(semantics$default, lazyListState, null, false, null, null, null, false, null, (ky) rememberedValue4, composer, 0, 508);
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
