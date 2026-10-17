package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class s00 extends InputConnectionWrapper {
    public final /* synthetic */ StatelessInputConnection$commitContentDelegateInputConnection$1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(StatelessInputConnection$terminalInputConnection$1 statelessInputConnection$terminalInputConnection$1, StatelessInputConnection$commitContentDelegateInputConnection$1 statelessInputConnection$commitContentDelegateInputConnection$1) {
        super(statelessInputConnection$terminalInputConnection$1, false);
        this.a = statelessInputConnection$commitContentDelegateInputConnection$1;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (onCommitContent(inputContentInfo == null ? null : new u00(new p7(inputContentInfo)), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
