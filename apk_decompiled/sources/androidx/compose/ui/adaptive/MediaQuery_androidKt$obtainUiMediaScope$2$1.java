package androidx.compose.ui.adaptive;

import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$2$1 extends f30 implements ky {
    final /* synthetic */ InputManager $inputManager;
    final /* synthetic */ UiMediaScopeImpl $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$2$1(InputManager inputManager, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$inputManager = inputManager;
        this.$scope = uiMediaScopeImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.hardware.input.InputManager$InputDeviceListener, androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1] */
    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final InputManager inputManager = this.$inputManager;
        final ?? r4 = new InputManager.InputDeviceListener() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1
            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceAdded(int i) {
                update();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceChanged(int i) {
                update();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceRemoved(int i) {
                update();
            }

            public final void update() {
                String resolvePointerPrecision;
                boolean hasPhysicalKeyboard;
                UiMediaScopeImpl uiMediaScopeImpl2 = UiMediaScopeImpl.this;
                resolvePointerPrecision = MediaQuery_androidKt.resolvePointerPrecision(inputManager);
                uiMediaScopeImpl2.m4250set_anyPointerZYK4Wgo(resolvePointerPrecision);
                UiMediaScopeImpl uiMediaScopeImpl3 = UiMediaScopeImpl.this;
                hasPhysicalKeyboard = MediaQuery_androidKt.hasPhysicalKeyboard(inputManager);
                uiMediaScopeImpl3.setHasPhysicalKeyboard(hasPhysicalKeyboard);
            }
        };
        this.$inputManager.registerInputDeviceListener(r4, new Handler(Looper.getMainLooper()));
        r4.update();
        final InputManager inputManager2 = this.$inputManager;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                inputManager2.unregisterInputDeviceListener(r4);
            }
        };
    }
}
