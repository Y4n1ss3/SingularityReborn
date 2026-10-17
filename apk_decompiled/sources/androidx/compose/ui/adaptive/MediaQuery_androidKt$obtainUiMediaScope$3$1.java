package androidx.compose.ui.adaptive;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.q11;
import defpackage.u11;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$3$1 extends f30 implements ky {
    final /* synthetic */ UiMediaScopeImpl $scope;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$3$1(View view, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$view = view;
        this.$scope = uiMediaScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(UiMediaScopeImpl uiMediaScopeImpl, View view) {
        boolean isImeVisible;
        int i = u11.a;
        isImeVisible = MediaQuery_androidKt.isImeVisible(q11.a(view));
        uiMediaScopeImpl.setImeVisible(isImeVisible);
    }

    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final View view = this.$view;
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.adaptive.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MediaQuery_androidKt$obtainUiMediaScope$3$1.invoke$lambda$0(UiMediaScopeImpl.this, view);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        final View view2 = this.$view;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }
}
