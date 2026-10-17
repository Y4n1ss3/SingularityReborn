package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import defpackage.a30;
import defpackage.iy;
import defpackage.q10;
import defpackage.rk0;
import defpackage.w50;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RememberSerializableKt {
    public static final <T> MutableState<T> rememberSerializable(Object[] objArr, a30 a30Var, rk0 rk0Var, iy iyVar, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            rk0Var = rk0.b;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248826527, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:163)");
        }
        MutableState<T> mutableState = (MutableState) RememberSaveableKt.m4147rememberSaveable(Arrays.copyOf(objArr, objArr.length), RememberSaveableKt.mutableStateSaver(SerializableSaverKt.serializableSaver(a30Var, rk0Var)), (String) null, iyVar, composer, (i & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* renamed from: rememberSerializable, reason: collision with other method in class */
    public static final <T> T m4148rememberSerializable(Object[] objArr, a30 a30Var, rk0 rk0Var, iy iyVar, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            rk0Var = rk0.b;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1261607160, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:93)");
        }
        T t = (T) RememberSaveableKt.m4147rememberSaveable(Arrays.copyOf(objArr, objArr.length), SerializableSaverKt.serializableSaver(a30Var, rk0Var), (String) null, iyVar, composer, (i & 7168) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final <T> MutableState<T> rememberSerializable(Object[] objArr, rk0 rk0Var, iy iyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            rk0Var = rk0.b;
        }
        Arrays.copyOf(objArr, objArr.length);
        w50 w50Var = rk0Var.a;
        q10.G();
        throw null;
    }

    /* renamed from: rememberSerializable, reason: collision with other method in class */
    public static final <T> T m4149rememberSerializable(Object[] objArr, rk0 rk0Var, iy iyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            rk0Var = rk0.b;
        }
        Arrays.copyOf(objArr, objArr.length);
        w50 w50Var = rk0Var.a;
        q10.G();
        throw null;
    }
}
