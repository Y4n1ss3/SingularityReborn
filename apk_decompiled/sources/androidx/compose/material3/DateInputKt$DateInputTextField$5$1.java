package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.bq;
import defpackage.dq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DateInputKt$DateInputTextField$5$1 extends us0 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ MutableState<TextFieldValue> $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$5$1(Long l, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, MutableState<TextFieldValue> mutableState, hm hmVar) {
        super(2, hmVar);
        this.$initialDateMillis = l;
        this.$calendarModel = calendarModel;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
        this.$text$delegate = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DateInputKt$DateInputTextField$5$1(this.$initialDateMillis, this.$calendarModel, this.$dateInputFormat, this.$locale, this.$text$delegate, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DateInputKt$DateInputTextField$5$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        Long l = this.$initialDateMillis;
        if (l != null) {
            CalendarModel calendarModel = this.$calendarModel;
            DateInputFormat dateInputFormat = this.$dateInputFormat;
            Locale locale = this.$locale;
            MutableState<TextFieldValue> mutableState = this.$text$delegate;
            String formatWithPattern = calendarModel.formatWithPattern(l.longValue(), dateInputFormat.getPatternWithoutDelimiters(), locale);
            mutableState.setValue(new TextFieldValue(formatWithPattern, formatWithPattern.length() == 0 ? TextRange.Companion.m7065getZerod9O1mEE() : TextRangeKt.TextRange(formatWithPattern.length(), formatWithPattern.length()), (TextRange) null, 4, (dq) null));
        }
        return w01.a;
    }
}
