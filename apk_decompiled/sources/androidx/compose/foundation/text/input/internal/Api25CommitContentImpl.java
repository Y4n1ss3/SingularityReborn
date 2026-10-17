package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class Api25CommitContentImpl {
    public static final Api25CommitContentImpl INSTANCE = new Api25CommitContentImpl();

    private Api25CommitContentImpl() {
    }

    public final boolean commitContent(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i, bundle);
    }
}
