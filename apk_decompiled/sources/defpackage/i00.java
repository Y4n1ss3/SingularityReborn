package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ i00(int i, int i2, int i3) {
        this.d = i3;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 deleteSurroundingTextInCodePoints$lambda$0;
        w01 composingRegion$lambda$0;
        switch (this.d) {
            case 0:
                deleteSurroundingTextInCodePoints$lambda$0 = ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints$lambda$0(this.e, this.f, (TextFieldBuffer) obj);
                return deleteSurroundingTextInCodePoints$lambda$0;
            default:
                composingRegion$lambda$0 = ImeEditCommand_androidKt.setComposingRegion$lambda$0(this.e, this.f, (TextFieldBuffer) obj);
                return composingRegion$lambda$0;
        }
    }
}
