package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidDialog_androidKt$Dialog$1$1 extends f30 implements ky {
    final /* synthetic */ DialogWrapper $dialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$1$1(DialogWrapper dialogWrapper) {
        super(1);
        this.$dialog = dialogWrapper;
    }

    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.$dialog.show();
        final DialogWrapper dialogWrapper = this.$dialog;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DialogWrapper.this.dismiss();
                DialogWrapper.this.disposeComposition();
            }
        };
    }
}
