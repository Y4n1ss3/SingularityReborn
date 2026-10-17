package androidx.compose.ui.contentcapture;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ContentCaptureSessionWrapper {
    void flush();

    AutofillId newAutofillId(long j);

    ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j);

    void notifyViewAppeared(ViewStructure viewStructure);

    void notifyViewDisappeared(AutofillId autofillId);

    void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence);

    void notifyViewsAppeared(List<ViewStructure> list);

    void notifyViewsDisappeared(long[] jArr);
}
