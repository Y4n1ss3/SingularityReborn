package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ft extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ft b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new jr0(cls, charSequence) : super.newEditable(charSequence);
    }
}
