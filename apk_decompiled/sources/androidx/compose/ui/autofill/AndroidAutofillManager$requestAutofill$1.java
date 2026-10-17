package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.semantics.SemanticsInfo;
import defpackage.f30;
import defpackage.oy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidAutofillManager$requestAutofill$1 extends f30 implements oy {
    final /* synthetic */ SemanticsInfo $semanticsInfo;
    final /* synthetic */ AndroidAutofillManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAutofillManager$requestAutofill$1(AndroidAutofillManager androidAutofillManager, SemanticsInfo semanticsInfo) {
        super(4);
        this.this$0 = androidAutofillManager;
        this.$semanticsInfo = semanticsInfo;
    }

    public final void invoke(int i, int i2, int i3, int i4) {
        Rect rect;
        View view;
        Rect rect2;
        rect = this.this$0.reusableRect;
        rect.set(i, i2, i3, i4);
        PlatformAutofillManager platformAutofillManager = this.this$0.getPlatformAutofillManager();
        view = this.this$0.view;
        int semanticsId = this.$semanticsInfo.getSemanticsId();
        rect2 = this.this$0.reusableRect;
        platformAutofillManager.requestAutofill(view, semanticsId, rect2);
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return w01.a;
    }
}
