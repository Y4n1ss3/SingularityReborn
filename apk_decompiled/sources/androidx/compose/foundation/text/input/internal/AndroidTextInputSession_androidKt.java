package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import defpackage.hm;
import defpackage.iy;
import defpackage.jb0;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {
    private static final String[] ALL_MIME_TYPES = {"*/*", "image/*", "video/*"};
    public static final boolean TIA_DEBUG = false;
    private static final String TIA_TAG = "AndroidTextInputSession";

    public static /* synthetic */ void logDebug$default(String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = TIA_TAG;
        }
        logDebug(str, iyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object platformSpecificTextInputSession(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ky kyVar, iy iyVar, jb0 jb0Var, ViewConfiguration viewConfiguration, ky kyVar2, hm hmVar) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        int i;
        if (hmVar instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) hmVar;
            int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label = i2 - Integer.MIN_VALUE;
                AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$12 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
                Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.result;
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    ComposeInputMethodManager ComposeInputMethodManager = ComposeInputMethodManager_androidKt.ComposeInputMethodManager(platformTextInputSession.getView());
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$12.label = 1;
                    Object platformSpecificTextInputSession = platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, kyVar, iyVar, ComposeInputMethodManager, jb0Var, viewConfiguration, kyVar2, androidTextInputSession_androidKt$platformSpecificTextInputSession$12);
                    vn vnVar = vn.d;
                    if (platformSpecificTextInputSession == vnVar) {
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
        androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(hmVar);
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$122 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$122.result;
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$122.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ky kyVar, iy iyVar, jb0 jb0Var, ViewConfiguration viewConfiguration, ky kyVar2, hm hmVar, int i, Object obj) {
        if ((i & 32) != 0) {
            iyVar = null;
        }
        if ((i & 64) != 0) {
            jb0Var = null;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            viewConfiguration = null;
        }
        return platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, kyVar, iyVar, jb0Var, viewConfiguration, kyVar2, hmVar);
    }

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final void logDebug(String str, iy iyVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object platformSpecificTextInputSession(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ky kyVar, iy iyVar, ComposeInputMethodManager composeInputMethodManager, jb0 jb0Var, ViewConfiguration viewConfiguration, ky kyVar2, hm hmVar) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2;
        int i;
        if (hmVar instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) hmVar;
            int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label = i2 - Integer.MIN_VALUE;
                Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.result;
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label;
                if (i != 0) {
                    p10.Q(obj);
                    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(jb0Var, transformedTextFieldState, textLayoutState, composeInputMethodManager, platformTextInputSession, imeOptions, receiveContentConfiguration, kyVar, iyVar, viewConfiguration, kyVar2, null);
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label = 1;
                    Object n = p10.n(androidTextInputSession_androidKt$platformSpecificTextInputSession$3, androidTextInputSession_androidKt$platformSpecificTextInputSession$2);
                    vn vnVar = vn.d;
                    if (n == vnVar) {
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
        androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(hmVar);
        Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.result;
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }
}
