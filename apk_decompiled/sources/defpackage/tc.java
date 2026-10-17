package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class tc implements CodepointTransformation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i, int i2) {
        int BasicSecureTextField_ltb6GB4$lambda$3$0;
        int codepointTransformation$lambda$0;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                BasicSecureTextField_ltb6GB4$lambda$3$0 = BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$3$0((State) obj, i, i2);
                return BasicSecureTextField_ltb6GB4$lambda$3$0;
            default:
                codepointTransformation$lambda$0 = SecureTextFieldController.codepointTransformation$lambda$0((SecureTextFieldController) obj, i, i2);
                return codepointTransformation$lambda$0;
        }
    }
}
