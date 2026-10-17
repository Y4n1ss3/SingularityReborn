package androidx.compose.ui.adaptive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.cq;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$4$1 extends f30 implements ky {
    final /* synthetic */ Context $context;
    final /* synthetic */ UiMediaScopeImpl $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$4$1(Context context, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$context = context;
        this.$scope = uiMediaScopeImpl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.BroadcastReceiver, androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1] */
    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        boolean isDocked;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final ?? r0 = new BroadcastReceiver() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean isDocked2;
                UiMediaScopeImpl uiMediaScopeImpl2 = UiMediaScopeImpl.this;
                isDocked2 = MediaQuery_androidKt.isDocked(intent);
                uiMediaScopeImpl2.setDocked(isDocked2);
            }
        };
        Intent C = cq.C(this.$context, r0, intentFilter, 2);
        UiMediaScopeImpl uiMediaScopeImpl2 = this.$scope;
        isDocked = MediaQuery_androidKt.isDocked(C);
        uiMediaScopeImpl2.setDocked(isDocked);
        final Context context = this.$context;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                context.unregisterReceiver(r0);
            }
        };
    }
}
