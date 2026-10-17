package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$3$1 extends f30 implements iy {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ iy $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3$1(PopupLayout popupLayout, iy iyVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = iyVar;
        this.$properties = popupProperties;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7874invoke() {
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m7874invoke();
        return w01.a;
    }
}
