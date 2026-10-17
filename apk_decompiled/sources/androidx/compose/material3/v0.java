package androidx.compose.material3;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Composer;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TextFieldDecorator g;

    public /* synthetic */ v0(TextFieldDecorator textFieldDecorator, my myVar, int i, int i2) {
        this.d = i2;
        this.g = textFieldDecorator;
        this.e = myVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Decoration$lambda$2;
        w01 Decoration$lambda$22;
        int i = this.d;
        int i2 = this.f;
        my myVar = this.e;
        TextFieldDecorator textFieldDecorator = this.g;
        switch (i) {
            case 0:
                Decoration$lambda$2 = OutlinedTextFieldDefaults$decorator$2.Decoration$lambda$2((OutlinedTextFieldDefaults$decorator$2) textFieldDecorator, myVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Decoration$lambda$2;
            default:
                Decoration$lambda$22 = TextFieldDefaults$decorator$2.Decoration$lambda$2((TextFieldDefaults$decorator$2) textFieldDecorator, myVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Decoration$lambda$22;
        }
    }
}
