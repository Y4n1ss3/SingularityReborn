package androidx.compose.ui.adaptive;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.DpSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UiMediaScopeImpl implements UiMediaScope {
    public static final int $stable = 0;
    private final MutableState _anyPointer$delegate;
    private final MutableState _windowInfo$delegate;
    private final MutableState _windowPosture$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(UiMediaScope.Posture.m4228boximpl(UiMediaScope.Posture.Companion.m4236getFlatm18o9QQ()), null, 2, null);
    private final MutableState hasPhysicalKeyboard$delegate;
    private final MutableState isDocked$delegate;
    private final MutableState isImeVisible$delegate;
    private final PackageManager packageManager;

    public UiMediaScopeImpl(Context context, InputManager inputManager, WindowInfo windowInfo, boolean z) {
        String resolvePointerPrecision;
        boolean hasPhysicalKeyboard;
        this.packageManager = context.getPackageManager();
        this._windowInfo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInfo, null, 2, null);
        resolvePointerPrecision = MediaQuery_androidKt.resolvePointerPrecision(inputManager);
        this._anyPointer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(UiMediaScope.PointerPrecision.m4217boximpl(resolvePointerPrecision), null, 2, null);
        this.isDocked$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isImeVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        hasPhysicalKeyboard = MediaQuery_androidKt.hasPhysicalKeyboard(inputManager);
        this.hasPhysicalKeyboard$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(hasPhysicalKeyboard), null, 2, null);
    }

    @Override // androidx.compose.ui.UiMediaScope
    public boolean getHasCamera() {
        boolean isCameraAvailable;
        isCameraAvailable = MediaQuery_androidKt.isCameraAvailable(this.packageManager);
        return isCameraAvailable;
    }

    @Override // androidx.compose.ui.UiMediaScope
    public boolean getHasMicrophone() {
        boolean isMicAvailable;
        isMicAvailable = MediaQuery_androidKt.isMicAvailable(this.packageManager);
        return isMicAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasPhysicalKeyboard() {
        return ((Boolean) this.hasPhysicalKeyboard$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getKeyboardKind-J9_QTjY */
    public String mo4201getKeyboardKindJ9_QTjY() {
        return getHasPhysicalKeyboard() ? UiMediaScope.KeyboardKind.Companion.m4215getPhysicalJ9_QTjY() : isImeVisible() ? UiMediaScope.KeyboardKind.Companion.m4216getVirtualJ9_QTjY() : UiMediaScope.KeyboardKind.Companion.m4214getNoneJ9_QTjY();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getPointerPrecision-fpxItnM */
    public String mo4202getPointerPrecisionfpxItnM() {
        return m4248get_anyPointerfpxItnM();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getViewingDistance-tKro-MQ */
    public String mo4203getViewingDistancetKroMQ() {
        boolean isTvDevice;
        boolean isAutomotiveDevice;
        isTvDevice = MediaQuery_androidKt.isTvDevice(this.packageManager);
        if (isTvDevice) {
            return UiMediaScope.ViewingDistance.Companion.m4245getFartKroMQ();
        }
        isAutomotiveDevice = MediaQuery_androidKt.isAutomotiveDevice(this.packageManager);
        return (isAutomotiveDevice || isDocked()) ? UiMediaScope.ViewingDistance.Companion.m4246getMediumtKroMQ() : UiMediaScope.ViewingDistance.Companion.m4247getNeartKroMQ();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getWindowHeight-D9Ej5fM */
    public float mo4204getWindowHeightD9Ej5fM() {
        return DpSize.m7707getHeightD9Ej5fM(get_windowInfo().mo6768getContainerDpSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getWindowPosture-m18o9QQ */
    public String mo4205getWindowPosturem18o9QQ() {
        return m4249get_windowPosturem18o9QQ();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getWindowWidth-D9Ej5fM */
    public float mo4206getWindowWidthD9Ej5fM() {
        return DpSize.m7709getWidthD9Ej5fM(get_windowInfo().mo6768getContainerDpSizeMYxV2XQ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get_anyPointer-fpxItnM, reason: not valid java name */
    public final String m4248get_anyPointerfpxItnM() {
        return ((UiMediaScope.PointerPrecision) this._anyPointer$delegate.getValue()).m4223unboximpl();
    }

    public final WindowInfo get_windowInfo() {
        return (WindowInfo) this._windowInfo$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get_windowPosture-m18o9QQ, reason: not valid java name */
    public final String m4249get_windowPosturem18o9QQ() {
        return ((UiMediaScope.Posture) this._windowPosture$delegate.getValue()).m4234unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDocked() {
        return ((Boolean) this.isDocked$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isImeVisible() {
        return ((Boolean) this.isImeVisible$delegate.getValue()).booleanValue();
    }

    public final void setDocked(boolean z) {
        this.isDocked$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setHasPhysicalKeyboard(boolean z) {
        this.hasPhysicalKeyboard$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setImeVisible(boolean z) {
        this.isImeVisible$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: set_anyPointer-ZYK4Wgo, reason: not valid java name */
    public final void m4250set_anyPointerZYK4Wgo(String str) {
        this._anyPointer$delegate.setValue(UiMediaScope.PointerPrecision.m4217boximpl(str));
    }

    public final void set_windowInfo(WindowInfo windowInfo) {
        this._windowInfo$delegate.setValue(windowInfo);
    }

    /* renamed from: set_windowPosture-InyEWag, reason: not valid java name */
    public final void m4251set_windowPostureInyEWag(String str) {
        this._windowPosture$delegate.setValue(UiMediaScope.Posture.m4228boximpl(str));
    }
}
