package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommandScope;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j00 implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ImeEditCommandScope g;

    public /* synthetic */ j00(int i, int i2, ImeEditCommandScope imeEditCommandScope) {
        this.e = i;
        this.f = i2;
        this.g = imeEditCommandScope;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 selection$lambda$0;
        w01 deleteSurroundingText$lambda$0;
        switch (this.d) {
            case 0:
                int i = this.e;
                selection$lambda$0 = ImeEditCommand_androidKt.setSelection$lambda$0(this.g, i, this.f, (TextFieldBuffer) obj);
                return selection$lambda$0;
            default:
                deleteSurroundingText$lambda$0 = ImeEditCommand_androidKt.deleteSurroundingText$lambda$0(this.e, this.f, this.g, (TextFieldBuffer) obj);
                return deleteSurroundingText$lambda$0;
        }
    }

    public /* synthetic */ j00(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        this.g = imeEditCommandScope;
        this.e = i;
        this.f = i2;
    }
}
