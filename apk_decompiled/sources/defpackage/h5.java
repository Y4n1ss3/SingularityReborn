package defpackage;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ h5(long j, int i) {
        this.d = i;
        this.e = j;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DrawResult drawCursorHandle$lambda$0$0$0;
        w01 TextFieldCursorHandle$lambda$3$0;
        switch (this.d) {
            case 0:
                drawCursorHandle$lambda$0$0$0 = AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0$0$0(this.e, (CacheDrawScope) obj);
                return drawCursorHandle$lambda$0$0$0;
            default:
                TextFieldCursorHandle$lambda$3$0 = CoreTextFieldKt.TextFieldCursorHandle$lambda$3$0(this.e, (SemanticsPropertyReceiver) obj);
                return TextFieldCursorHandle$lambda$3$0;
        }
    }
}
