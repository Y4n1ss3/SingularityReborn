package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(InputConnection inputConnection, ky kyVar) {
        super(inputConnection, kyVar);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
