package androidx.compose.ui.adaptive;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.platform.WindowInfo;
import defpackage.gf;
import defpackage.ky;
import defpackage.my;
import defpackage.ox;
import defpackage.p31;
import defpackage.q11;
import defpackage.t31;
import defpackage.u11;
import defpackage.vz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaQuery_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPhysicalKeyboard(InputManager inputManager) {
        int[] inputDeviceIds;
        if (inputManager != null && (inputDeviceIds = inputManager.getInputDeviceIds()) != null) {
            for (int i : inputDeviceIds) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null && inputDevice.getKeyboardType() == 2 && !inputDevice.isVirtual()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean hasSource(int i, int i2) {
        return (i & i2) == i2;
    }

    private static final boolean hasValidPointerSource(InputDevice inputDevice, int i, int i2) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(i2, i) != null;
    }

    public static /* synthetic */ boolean hasValidPointerSource$default(InputDevice inputDevice, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return hasValidPointerSource(inputDevice, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutomotiveDevice(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCameraAvailable(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.camera.any");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDocked(Intent intent) {
        return (intent == null || intent.getIntExtra("android.intent.extra.DOCK_STATE", 0) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImeVisible(p31 p31Var) {
        return p31Var != null && p31Var.a.q(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMicAvailable(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.microphone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTvDevice(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.software.leanback");
    }

    public static final UiMediaScope obtainUiMediaScope(Context context, View view, WindowInfo windowInfo, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-590796729, i, -1, "androidx.compose.ui.adaptive.obtainUiMediaScope (MediaQuery.android.kt:121)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object systemService = context.getSystemService("input");
            systemService.getClass();
            rememberedValue = (InputManager) systemService;
            composer.updateRememberedValue(rememberedValue);
        }
        InputManager inputManager = (InputManager) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            int i2 = u11.a;
            rememberedValue2 = Boolean.valueOf(isImeVisible(q11.a(view)));
            composer.updateRememberedValue(rememberedValue2);
        }
        boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new UiMediaScopeImpl(context, inputManager, windowInfo, booleanValue);
            composer.updateRememberedValue(rememberedValue3);
        }
        UiMediaScopeImpl uiMediaScopeImpl = (UiMediaScopeImpl) rememberedValue3;
        uiMediaScopeImpl.set_windowInfo(windowInfo);
        boolean changedInstance = composer.changedInstance(context);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new MediaQuery_androidKt$obtainUiMediaScope$1$1(context, uiMediaScopeImpl, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        int i3 = i & 14;
        EffectsKt.LaunchedEffect(context, (my) rememberedValue4, composer, i3);
        boolean changedInstance2 = composer.changedInstance(inputManager);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new MediaQuery_androidKt$obtainUiMediaScope$2$1(inputManager, uiMediaScopeImpl);
            composer.updateRememberedValue(rememberedValue5);
        }
        EffectsKt.DisposableEffect(context, (ky) rememberedValue5, composer, i3);
        boolean changedInstance3 = composer.changedInstance(view);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new MediaQuery_androidKt$obtainUiMediaScope$3$1(view, uiMediaScopeImpl);
            composer.updateRememberedValue(rememberedValue6);
        }
        EffectsKt.DisposableEffect(view, (ky) rememberedValue6, composer, (i >> 3) & 14);
        boolean changedInstance4 = composer.changedInstance(context);
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue7 == companion.getEmpty()) {
            rememberedValue7 = new MediaQuery_androidKt$obtainUiMediaScope$4$1(context, uiMediaScopeImpl);
            composer.updateRememberedValue(rememberedValue7);
        }
        EffectsKt.DisposableEffect(context, (ky) rememberedValue7, composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return uiMediaScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolvePointerPrecision(InputManager inputManager) {
        if (inputManager == null) {
            return UiMediaScope.PointerPrecision.Companion.m4227getNonefpxItnM();
        }
        String m4227getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m4227getNonefpxItnM();
        for (int i : inputManager.getInputDeviceIds()) {
            InputDevice inputDevice = inputManager.getInputDevice(i);
            if (inputDevice != null) {
                if (hasValidPointerSource$default(inputDevice, 8194, 0, 2, null) || hasValidPointerSource$default(inputDevice, 16386, 0, 2, null) || hasValidPointerSource$default(inputDevice, 1048584, 0, 2, null)) {
                    return UiMediaScope.PointerPrecision.Companion.m4226getFinefpxItnM();
                }
                if (hasValidPointerSource$default(inputDevice, 4098, 0, 2, null)) {
                    m4227getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m4225getCoarsefpxItnM();
                } else {
                    UiMediaScope.PointerPrecision.Companion companion = UiMediaScope.PointerPrecision.Companion;
                    if (UiMediaScope.PointerPrecision.m4220equalsimpl0(m4227getNonefpxItnM, companion.m4227getNonefpxItnM()) && (hasValidPointerSource$default(inputDevice, 16777232, 0, 2, null) || hasValidPointerSource$default(inputDevice, 1025, 0, 2, null))) {
                        m4227getNonefpxItnM = companion.m4224getBluntfpxItnM();
                    }
                }
            }
        }
        return m4227getNonefpxItnM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolvePosture(t31 t31Var) {
        Object obj;
        ox oxVar = ox.d;
        List list = t31Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof vz) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((vz) obj).c == ox.f) {
                break;
            }
        }
        vz vzVar = (vz) obj;
        if (vzVar == null) {
            return UiMediaScope.Posture.Companion.m4236getFlatm18o9QQ();
        }
        gf gfVar = vzVar.a;
        return (gfVar.b() > gfVar.a() ? oxVar : ox.c) != oxVar ? UiMediaScope.Posture.Companion.m4235getBookm18o9QQ() : UiMediaScope.Posture.Companion.m4237getTabletopm18o9QQ();
    }
}
