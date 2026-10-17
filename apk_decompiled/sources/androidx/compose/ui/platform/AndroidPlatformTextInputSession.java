package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import defpackage.hm;
import defpackage.kn;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.vn;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, un {
    public static final int $stable = 8;
    private final un coroutineScope;
    private final AtomicReference<SessionMutex.Session<InputMethodSession>> methodSessionMutex = SessionMutex.m4192constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, un unVar) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = unVar;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m4196getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSessionScope, defpackage.un
    public kn getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m4196getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, hm hmVar) {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        int i;
        if (hmVar instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) hmVar;
            int i2 = androidPlatformTextInputSession$startInputMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
                i = androidPlatformTextInputSession$startInputMethod$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    AtomicReference<SessionMutex.Session<InputMethodSession>> atomicReference = this.methodSessionMutex;
                    AndroidPlatformTextInputSession$startInputMethod$2 androidPlatformTextInputSession$startInputMethod$2 = new AndroidPlatformTextInputSession$startInputMethod$2(platformTextInputMethodRequest, this);
                    AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this, null);
                    androidPlatformTextInputSession$startInputMethod$1.label = 1;
                    Object m4199withSessionCancellingPreviousimpl = SessionMutex.m4199withSessionCancellingPreviousimpl(atomicReference, androidPlatformTextInputSession$startInputMethod$2, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1);
                    vn vnVar = vn.d;
                    if (m4199withSessionCancellingPreviousimpl == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                o.j();
                return null;
            }
        }
        androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, hmVar);
        Object obj2 = androidPlatformTextInputSession$startInputMethod$1.result;
        i = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }
}
