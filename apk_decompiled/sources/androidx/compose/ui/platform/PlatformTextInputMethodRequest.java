package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PlatformTextInputMethodRequest {
    InputConnection createInputConnection(EditorInfo editorInfo);
}
