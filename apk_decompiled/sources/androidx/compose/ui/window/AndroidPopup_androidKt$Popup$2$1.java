package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$2$1 extends f30 implements ky {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ iy $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2$1(PopupLayout popupLayout, iy iyVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = iyVar;
        this.$properties = popupProperties;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.$popupLayout.show();
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
        final PopupLayout popupLayout = this.$popupLayout;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PopupLayout.this.disposeComposition();
                PopupLayout.this.dismiss();
            }
        };
    }
}
