package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.FillableData;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FillableData_androidKt {
    public static final FillableData createFromAutofillValue(FillableData.Companion companion, AutofillValue autofillValue) {
        return new AndroidFillableData(autofillValue);
    }

    public static final FillableData createFromBoolean(FillableData.Companion companion, boolean z) {
        return new AndroidFillableData(AutofillValue.forToggle(z));
    }

    public static final FillableData createFromDateMillis(FillableData.Companion companion, long j) {
        return new AndroidFillableData(AutofillValue.forDate(j));
    }

    public static final FillableData createFromListIndex(FillableData.Companion companion, int i) {
        return new AndroidFillableData(AutofillValue.forList(i));
    }

    public static final FillableData createFromText(FillableData.Companion companion, CharSequence charSequence) {
        return new AndroidFillableData(AutofillValue.forText(charSequence));
    }

    public static final AutofillValue toAutofillValue(FillableData fillableData) {
        AndroidFillableData androidFillableData = fillableData instanceof AndroidFillableData ? (AndroidFillableData) fillableData : null;
        if (androidFillableData != null) {
            return androidFillableData.getAutofillValue$ui();
        }
        return null;
    }
}
