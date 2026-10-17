package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$HorizontalMonthsList$1 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ ky $onDateSelectionChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedDateMillis;
    final /* synthetic */ CalendarDate $today;
    final /* synthetic */ k10 $yearRange;

    public DatePickerKt$HorizontalMonthsList$1(LazyListState lazyListState, k10 k10Var, CalendarModel calendarModel, CalendarMonth calendarMonth, ky kyVar, CalendarDate calendarDate, Long l, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.$lazyListState = lazyListState;
        this.$yearRange = k10Var;
        this.$calendarModel = calendarModel;
        this.$firstMonth = calendarMonth;
        this.$onDateSelectionChange = kyVar;
        this.$today = calendarDate;
        this.$selectedDateMillis = l;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$3$lambda$2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new w(0), new w(1), false, 4, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$3$lambda$2$lambda$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$3$lambda$2$lambda$1() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$5$lambda$4(k10 k10Var, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final ky kyVar, final CalendarDate calendarDate, final Long l, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, LazyListScope lazyListScope) {
        LazyListScope.items$default(lazyListScope, DatePickerKt.numberOfMonthsInRange(k10Var), null, null, ComposableLambdaKt.composableLambdaInstance(72599078, true, new oy() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1$1
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
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
                    ComposerKt.traceEventStart(72599078, i3, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1733)");
                }
                CalendarMonth plusMonths = CalendarModel.this.plusMonths(calendarMonth, i);
                Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
                ky kyVar2 = kyVar;
                CalendarDate calendarDate2 = calendarDate;
                Long l2 = l;
                DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                SelectableDates selectableDates2 = selectableDates;
                DatePickerColors datePickerColors2 = datePickerColors;
                CalendarModel calendarModel2 = CalendarModel.this;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                DatePickerKt.Month(plusMonths, kyVar2, calendarDate2.getUtcTimeMillis(), l2, null, null, datePickerFormatter2, selectableDates2, datePickerColors2, calendarModel2.getLocale(), composer, 221184);
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
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1504086906, i, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1721)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new d(4);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null);
        LazyListState lazyListState = this.$lazyListState;
        FlingBehavior rememberSnapFlingBehavior$material3 = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3(lazyListState, null, composer, 384, 2);
        boolean changedInstance = composer.changedInstance(this.$yearRange) | composer.changedInstance(this.$calendarModel) | composer.changed(this.$firstMonth) | composer.changed(this.$onDateSelectionChange) | composer.changed(this.$today) | composer.changed(this.$selectedDateMillis) | composer.changedInstance(this.$dateFormatter) | composer.changed(this.$selectableDates) | composer.changed(this.$colors);
        final k10 k10Var = this.$yearRange;
        final CalendarModel calendarModel = this.$calendarModel;
        final CalendarMonth calendarMonth = this.$firstMonth;
        final ky kyVar = this.$onDateSelectionChange;
        final CalendarDate calendarDate = this.$today;
        final Long l = this.$selectedDateMillis;
        final DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        final SelectableDates selectableDates = this.$selectableDates;
        final DatePickerColors datePickerColors = this.$colors;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new ky() { // from class: androidx.compose.material3.v
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = DatePickerKt$HorizontalMonthsList$1.invoke$lambda$5$lambda$4(k10.this, calendarModel, calendarMonth, kyVar, calendarDate, l, datePickerFormatter, selectableDates, datePickerColors, (LazyListScope) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        LazyDslKt.LazyRow(semantics$default, lazyListState, null, false, null, null, rememberSnapFlingBehavior$material3, false, null, (ky) rememberedValue2, composer, 0, 444);
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
