package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InputMethodSession$createInputConnection$1$1 extends f30 implements ky {
    final /* synthetic */ InputMethodSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodSession$createInputConnection$1$1(InputMethodSession inputMethodSession) {
        super(1);
        this.this$0 = inputMethodSession;
    }

    public final void invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
        MutableVector mutableVector;
        MutableVector mutableVector2;
        iy iyVar;
        MutableVector mutableVector3;
        nullableInputConnectionWrapper.disposeDelegate();
        mutableVector = this.this$0.connections;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (q10.b((WeakReference) objArr[i], nullableInputConnectionWrapper)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            mutableVector3 = this.this$0.connections;
            mutableVector3.removeAt(i);
        }
        mutableVector2 = this.this$0.connections;
        if (mutableVector2.getSize() == 0) {
            iyVar = this.this$0.onAllConnectionsClosed;
            iyVar.invoke();
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NullableInputConnectionWrapper) obj);
        return w01.a;
    }
}
